package potterproject;

import java.util.ArrayList;

public class LookResult {

    private ArrayList<Integer> neighbors;

    private int posX;

    private int posY;
    
    private int energy;

    public LookResult(JSON json) {
        neighbors = json.getIntArray("neighbors");
        posX = json.getInt("posx");
        posY = json.getInt("posy");
        energy=json.getInt("Energy");
        

    }

    public LookResult(LookResult other) {
        this.neighbors = new ArrayList<>(other.neighbors);
        this.posX = other.posX;
        this.posY = other.posY;
        this.energy= other.energy;
    }

    public int getEnergy() {
        return energy;
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

    @Override
    public String toString() {
        return "LookResult{" + "neighbors=" + neighbors + ", posX=" + posX + ", posY=" + posY + '}';
    }
    
    
}
