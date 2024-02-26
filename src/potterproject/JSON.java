package potterproject;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSON {

    final String regex = "\"(.*?)\": (.*?)(,(?![^\\[]*])|\\})";
    
    final Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
    
    private ArrayList<JSONPair> params;

    public JSON(String jsonString) {
        params = new ArrayList<JSONPair>();
        Matcher matcher = pattern.matcher(jsonString);
        while (matcher.find()) {
            params.add(new JSONPair(
                matcher.group(1),
                matcher.group(2)
            ));
        }
    }

    public JSON(ArrayList<JSONPair> params) {
        this.params = params;
    }
    
    private String getValue(String param) {
        for (JSONPair pair : params) {
            if (pair.getParam().equals(param)) {
                return pair.getValue();
            }
        }
        return null;
    }
    
    public String getString(String param) {
        return getValue(param).substring(1, param.length()-1);
    }
    
    public int getInt(String param) {
        return Integer.parseInt(getValue(param));
    }
    
    private String[] getArray(String param) {
        return getValue(param).split("\\s*[,|\\[|\\]]\\s*");
    }
    
    public int[] getIntArray(String param) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String[] getStringArray(String param) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "JSON" + params;
    }
    
    
}
