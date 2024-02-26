package potterproject;

public class MoveResult {

    private int energy;

    private int posX;

    private int posY;

    public int getEnergy() {
        return energy;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public MoveResult(JSON json) {
        energy = json.getInt("Energy");
        posX = json.getInt("posx");
        posY = json.getInt("posy");
    }
}
