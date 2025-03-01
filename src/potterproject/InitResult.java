package potterproject;

public class InitResult {

    private int width;

    private int height;

    private int posX;

    private int posY;

    private int energy;
    
    private String seed;

    public InitResult(JSON json) {
        width = json.getInt("width");
        height = json.getInt("height"); 
        posX = json.getInt("posx");
        posY = json.getInt("posy");
        energy = json.getInt("Energy");
        seed = json.getString("seed");
    }
    public InitResult(InitResult other) {
        this.width = other.width;
        this.height = other.height;
        this.posX = other.posX;
        this.posY = other.posY;
        this.energy = other.energy;
        this.seed = other.seed;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getEnergy() {
        return energy;
    }
    
    public String getSeed() {
        return seed;
    }
    
    @Override
    public String toString() {
        return "InitResult{" + "width=" + width + ", height=" + height + ", posX=" + posX + ", posY=" + posY + ", energy=" + energy + ", seed=" + seed + '}';
    }
    
    // maze size
    // ratio 1.25 -> 1.5
}
