package potterproject;
// copilot helpd.
public class Maze {

    private Tile[][] matrix;

    private int height;

    private int lenght;

    private int xPos;

    private int yPos;

    private int[] home;

    private Rest rest;

    public Maze(int seed, String team) {
        Rest rest = new Rest(team, Integer.toString(seed));
        InitResult initResult = new InitResult(rest.init());
        this.height = initResult.getHeight();
        this.lenght = initResult.getWidth();
        this.xPos = initResult.getPosX();
        this.yPos = initResult.getPosY();
        home = new int[]{xPos, yPos};
        matrix = new Tile[height][lenght];
        
    }
    public boolean findCup() {
        return true;
        
    }
    
    public void lookNear(){
        LookNear look= new LookNear(rest.look());
        ArrayList<Int> neighbors = look.getNeighbors();
        if (look.getPosY()>0)
            matrix[look.getPosX()][look.getPosY()-1].setCheck(true);
        if (look.getPosX()<lenght-1)
            matrix[look.getPosX()+1][look.getPosY()].setCheck(true);
        if (look.getPosY()<height-1)
            matrix[look.getPosX()][look.getPosY()+1].setCheck(true);
        if (look.getPosX()>0)
            matrix[look.getPosX()-1][look.getPosY()].setCheck(true);
    }

    public boolean home() {
        if (xPos == home[0] && yPos == home[1]) {
            return true;
        }
        return false;
    }

    public boolean move (int dir) {
        // 0 = up, 2 = right, 4 = down, 6 = left
        //up
        if (dir == 0) {
            if (yPos > 0 && !matrix[xPos][yPos - 1].isWall()) {
                yPos--;
                return true;
            }
        }

        //right
        if (dir == 2) {
            if (xPos < lenght - 1 && !matrix[xPos + 1][yPos].isWall()) {
                xPos++;
                return true;
            }
        }

        //down
        if (dir == 4) {
            if (yPos < height - 1 && !matrix[xPos][yPos + 1].isWall()) {
                yPos++;
                return true;
            }
        }
        
        //left
        if (dir == 6) {
            if (xPos > 0 && !matrix[xPos - 1][yPos].isWall()) {
                xPos--;
                return true;
            }
        }
        
        return false;
    }

    public void comeHome() {
    }
}
