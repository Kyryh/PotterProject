package potterproject;

import java.util.ArrayList;

public class LookResult {

    private ArrayList<Integer> neighbors;

    private int posX;

    private int posY;

    public LookResult(JSON json) {
        neighbors = json.getIntArray("neighbors");
        posX = json.getInt("posx");
        posY = json.getInt("posy");

    }

    public LookResult(LookResult other) {
        this.neighbors = new ArrayList<>(other.neighbors);
        this.posX = other.posX;
        this.posY = other.posY;
    }

    public ArrayList<Integer> getNeighbors() {
        return neighbors;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
