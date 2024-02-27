package potterproject;

public class Tile {

    private boolean checked;

    private TileType type;

    private int startDistance;
    public void setType(int type) {
        if (type == -2)
            this.type = TileType.Unexplored;
        if (type == -1)
            this.type = TileType.OutOfBounds;
        if (type==0)
            this.type = TileType.Empty;
        if (type==1)
            this.type = TileType.Wall;
        if (type==2)
            this.type = TileType.Start;
        if (type==3)
            this.type = TileType.Goblet;
        
    }
    public boolean isChecked() {
        return checked;
    }
    
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    public boolean isGoblet() {
        return type == TileType.Goblet;
    }
    public boolean isStart() {
        return type == TileType.Start;
    }
    public boolean isEmpty() {
        return type == TileType.Empty;
    }
    public boolean isWall() {
        return type == TileType.Wall;

    }

    public int getStartDistance() {
        return startDistance;
    }
    
}
