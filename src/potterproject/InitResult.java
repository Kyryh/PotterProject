package potterproject;

public class InitResult {

    private int width;

    private int height;

    private int posX;

    private int posY;

    private int energy;

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
    


    public InitResult(JSON json) {
        width = json.getInt("width");
        height = json.getInt("height"); 
        posX = json.getInt("posx");
        posY = json.getInt("posy");
        energy = json.getInt("Energy");
    }
}
