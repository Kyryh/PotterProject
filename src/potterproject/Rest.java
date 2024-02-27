package potterproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Rest {
    
    private String team;
    private String seed;

    public Rest(String team, String seed) {
        this.team = team;
        this.seed = seed;
    }

    public Rest(String team) {
        this.team = team;
        this.seed = null;
    }
    
    
    
    private JSON restRequest(String url, JSONPair... pairs) {
        JSON jsonObject = null;
        HttpURLConnection connection = null;
        try {
            URL requestUrl = new URL(url);
            // Crea un oggetto HttpURLConnection
            connection = (HttpURLConnection) requestUrl.openConnection();

            // Imposta il metodo HTTP
            connection.setRequestMethod("POST");

            // Imposta il tipo di contenuto
            connection.setRequestProperty("Content-Type", "application/json");

            // Invia i dati
            connection.setDoOutput(true);
            ArrayList<JSONPair> pairsArrayList = new ArrayList<>(Arrays.asList(pairs));
            pairsArrayList.add(new JSONPair("team", team));
            
            if (seed != null)
                pairsArrayList.add(new JSONPair("seed", seed));
            
            connection.getOutputStream().write(new JSON(pairsArrayList).toString().getBytes());
            // Leggi la risposta del server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String risposta = reader.readLine();
            // Analizza la risposta del server
            jsonObject = new JSON(risposta);
        } catch (MalformedURLException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
            if (connection != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                try {
                    throw new RuntimeException(reader.readLine());
                    
                } catch (IOException e2) {}
            }
        }
        if (jsonObject == null)
            throw new RuntimeException("I'm sorry, something went terribly wrong...");
        
        return jsonObject;

    }

    public InitResult init() {
        String url = "https://dw.gnet.it/init";
        System.out.println(restRequest(
                url
            ));
        InitResult initResult=new InitResult(
            restRequest(
                url
            )
        );
        return initResult;
    }

    public LookResult look() {
        String url = "https://dw.gnet.it/look";
        LookResult lookResult= new LookResult (
            restRequest(
                url
            )
        );
        return lookResult;
    }

    public MoveResult Move(int move) {
        String url = "https://dw.gnet.it/move";
        MoveResult moveResult = new MoveResult(
            restRequest(
                url,
                new JSONPair("move", move)
            )
        );
        return moveResult;
    }

    public UnloadResult unload() {
        String url = "https://dw.gnet.it/unload";
        UnloadResult unloadResult = new UnloadResult(
            restRequest(
                url
            )
        );
        return unloadResult;
    }

    public LoadResult load() {
        String url = "https://dw.gnet.it/load";
        LoadResult loadResult = new LoadResult(
            restRequest(
                url
            )
        );
        return loadResult;
    }
}
