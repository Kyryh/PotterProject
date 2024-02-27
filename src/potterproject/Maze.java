package potterproject;
// copilot helpd.

import java.util.ArrayList;



public class Maze {

    private Tile[][] matrix;

    private int height;

    private int lenght;

    private int xPos;

    private int yPos;

    private int[] home;

    private Rest rest;

    public Maze(String team) {
        this(team, null);
    }
    
    
    public Maze(String team, String seed) {
        rest = new Rest(team, seed);
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
        
        LookResult look= rest.look();
        ArrayList<Integer> neighbors = look.getNeighbors();
        //up
        if (neighbors.get(0) != -1){
            matrix[look.getPosX()][look.getPosY()-1].setChecked(true);
            matrix[look.getPosX()][look.getPosY()-1].setType(neighbors.get(0));
        }
        //right
        if (neighbors.get(1) != -1){
            matrix[look.getPosX()+1][look.getPosY()].setChecked(true);
            matrix[look.getPosX()+1][look.getPosY()].setType(neighbors.get(1));
        }
        //down
        if (neighbors.get(2) != -1){
            matrix[look.getPosX()][look.getPosY()+1].setChecked(true);
            matrix[look.getPosX()][look.getPosY()+1].setType(neighbors.get(2));
        }
        //left
        if (neighbors.get(3) != -1){
            matrix[look.getPosX()-1][look.getPosY()].setChecked(true);
            matrix[look.getPosX()-1][look.getPosY()].setType(neighbors.get(3));
        }
        
    }

    public Tile[][] getMatrix() {
        return matrix;
    }

    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int[] getHome() {
        return home;
    }

    public Rest getRest() {
        return rest;
    }

    public boolean home() {
        return xPos == home[0] && yPos == home[1];
    }

    public boolean move (int dir) {
        // 0 = up, 2 = right, 4 = down, 6 = left
        //up
        if (dir == 0) {
            // TODO
        }

        //right
        if (dir == 2) {
            // TODO
        }

        //down
        if (dir == 4) {
            // TODO
        }
        
        //left
        if (dir == 6) {
            // TODO
        }
        
        return false;
    }
    public int[] initialData(){
        LookResult look=new LookResult(rest.look());
        int data[]=new int[3];
        data[0]=look.getEnergy();
        data[1]=getHeight();
        data[2]=getLenght();
        return data;
    }
    public void comeHome() {
    }
}
