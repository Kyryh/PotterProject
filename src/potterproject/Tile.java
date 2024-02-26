package potterproject;

public class Tile {

    private boolean checked;

    private String type;

    private int startDistance;
    public void setType(int type) {
        if (type==0)
            this.type = "floor";
        if (type==1)
            this.type = "wall";
        if (type==2)
            this.type = "home";
        if (type==3)
            this.type = "cup";
        
    }
    public boolean isChecked() {
        return checked;
    }
    public boolean isCup() {
        if (type=="cup")
            return true;
        return false;
    }
    public boolean isHome() {
        if (type=="home")
            return true;
        return false;
    }
    public boolean isFloor() {
        if (type=="floor")
            return true;
        return false;
    }
    public boolean isWall() {
        if (type=="wall")
            return true;
    return false;

    }

    public int getStartDistance() {
        return startDistance;
    }
    
}
