package potterproject;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSON {

    final String regex = "\"(.*?)\": (.*?)(,(?![^\\[]*])|\\})";
    
    final Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
    
    private final ArrayList<JSONPair> params;

    public JSON(String jsonString) {
        params = new ArrayList<>();
        Matcher matcher = pattern.matcher(jsonString);
        while (matcher.find()) {
            params.add(new JSONPair(
                matcher.group(1).trim(),
                matcher.group(2).trim(),
                false
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
    
    public ArrayList<Integer> getIntArray(String param) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for (String value : getArray(param)) {
            if (!value.isBlank())
                intArray.add(Integer.valueOf(value));
        }
        return intArray;
    }
    
    public ArrayList<String> getStringArray(String param) {
        ArrayList<String> stringArray = new ArrayList<>();
        for (String value : getArray(param)) {
            if (!value.isBlank())
                stringArray.add(value.substring(1, value.length()-1));
        }
        return stringArray;
    }

    @Override
    public String toString() {
        String jsonString = "{";
        for (JSONPair pair : params) {
            jsonString += "\"%s\":%s,".formatted(pair.getParam(), pair.getValue());
        }
        return jsonString.substring(0, jsonString.length()-1) + "}";
    }
    
    
}
