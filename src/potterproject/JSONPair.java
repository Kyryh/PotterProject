package potterproject;

public class JSONPair {

    private String param;

    private String value;

    public JSONPair(String param, String value) {
        this(param, value, true);
    }
    
    public JSONPair(String param, String value, boolean addParentheses) {
        this.param = param;
        if (addParentheses)
            this.value = "\""+value+"\"";
        else
            this.value = value;
    }
    
    public JSONPair(String param, int value) {
        this.param = param;
        this.value = ""+value;
    }

    public String getParam() {
        return param;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\"%s\"=%s".formatted(param, value);
    }
    
    
}
