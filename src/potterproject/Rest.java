
package potterproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Rest {
    public Rest(int seed, String team) {
        this.seed = seed;
        this.team = team;
    }
    private String team;
    private int seed;
   
    private JSON restRequest(String url, ArrayList<JSONPair> send) {
        JSON jsonObject = null;
        try {
            @SuppressWarnings("deprecation")
            URL requestUrl = new URL(url);
            // Crea un oggetto HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();

            // Imposta il metodo HTTP
            connection.setRequestMethod("POST");

            // Imposta il tipo di contenuto
            connection.setRequestProperty("Content-Type", "application/json");

            // Invia i dati
            connection.setDoOutput(true);
            connection.getOutputStream().write(new JSON(send).toString().getBytes());
            
            // Leggi la risposta del server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String risposta = reader.readLine();

            // Analizza la risposta del server
            jsonObject = new JSON(risposta);
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        
        return jsonObject;

    }

    public InitResult init() {
        String url = "https://dw.gnet.it/init";
        ArrayList<JSONPair> send = new ArrayList<JSONPair>();
            send.add (new JSONPair("team", team));
            send.add (new JSONPair("seed", seed));
        InitResult initResult = new InitResult(restRequest(url, send));
        return initResult;
    }

    public LookResult look() {
        String url = "https://dw.gnet.it/look";
        ArrayList<JSONPair> send = new ArrayList<JSONPair>();
            send.add (new JSONPair("team", team));
            send.add (new JSONPair("seed", seed));
        LookResult lookResult = new LookResult(restRequest(url, send));
        return lookResult;
    }

    public MoveResult Move(int move) {
        String url = "https://dw.gnet.it/move";
        ArrayList<JSONPair> send = new ArrayList<JSONPair>();
            send.add (new JSONPair("team", team));
            send.add (new JSONPair("seed", seed));
            send.add (new JSONPair("move", move));
        MoveResult moveResult = new MoveResult(restRequest(url, send));
            
        return moveResult;
    }

    public UnloadResult unload() {
        String url = "https://dw.gnet.it/unload";
        ArrayList<JSONPair> send = new ArrayList<JSONPair>();
            send.add (new JSONPair("team", team));
            send.add (new JSONPair("seed", seed));
        UnloadResult unloadResult = new UnloadResult(restRequest(url, send));
        return unloadResult;
        }

    public LoadResult load() {
        String url = "https://dw.gnet.it/load";
        ArrayList<JSONPair> send = new ArrayList<JSONPair>();
            send.add (new JSONPair("team", team));
            send.add (new JSONPair("seed", seed)); 
        LoadResult loadResult = new LoadResult(restRequest(url, send));
        return loadResult; 
        }
}
