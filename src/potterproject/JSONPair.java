package potterproject;

public class JSONPair {

    private String param;

    private Object value;

    public JSONPair(String param, Object value) {
        this.param = param;
        this.value = value;
    }

    public String getParam() {
        return param;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\"%s\"=%s".formatted(param, value);
    }
    
    
}
