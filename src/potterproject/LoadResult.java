package potterproject;

public class LoadResult {

    private String inventory;

    private int energy;

    public String getInventory() {
        return inventory;
    }

    public int getEnergy() {
        return energy;
    }

    public LoadResult(JSON json) {
        inventory = json.getString("inventory");
        energy = json.getInt("Energy");
    }
}
