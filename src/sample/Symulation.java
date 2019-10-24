package sample;

public class Symulation {

    static  final int GRID_SIZE = 50;
    Square [][] grid  = new Square[GRID_SIZE][GRID_SIZE];

    Ant ant;

    public Symulation() {
        ant = new Ant();
    }

    public void runStep(){

        if(grid[ant.xAnt][ant.yAnt].isWhite){
            ant.rotate(90);
            grid[ant.xAnt][ant.yAnt].isWhite = false;
        }else {
            ant.rotate(-90);
            grid[ant.xAnt][ant.yAnt].isWhite = true;
        }
        ant.move(1);
    }

}
