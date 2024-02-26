package potterproject;

public class LookResult {

    private ArrayList<Integer> neighbors;

    private int posX;

    private int posY;

    public int[] getNeighbors() {
        return neighbors;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public LookResult(JSON json) {
        neighbors = json.getIntArray("neighbors");
        posX = json.getInt("posx");
        posY = json.getInt("posy");

    }
}
