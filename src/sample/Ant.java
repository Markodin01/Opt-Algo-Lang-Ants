package sample;
import static sample.Ant.Direction.*;
public class Ant {

    int xAnt;
    int yAnt;

    enum Direction{
        UP, RIGHT, DOWN, LEFT
    }

    Direction direction;

    public Ant() {

        xAnt = Symulation.GRID_SIZE /2;
        yAnt = Symulation.GRID_SIZE /2;
        direction  = UP;

    }

    public void rotate(int angle){

        if(angle == 90){
            switch (direction){
                case UP: direction = RIGHT;
                    break;

                case RIGHT: direction = DOWN;
                    break;

                case DOWN: direction = LEFT;
                    break;

                case LEFT: direction = UP;
                    break;
            }
        }
        else if(angle == -90) {
            switch (direction) {
                case UP:
                    direction = LEFT;
                    break;

                case RIGHT:
                    direction = UP;
                    break;

                case DOWN:
                    direction = RIGHT;
                    break;

                case LEFT:
                    direction = DOWN;
                    break;

            }
        }
        else {
            System.out.println("another angle...");
        }

    }

    public void move(int units){
        switch (direction){
            case UP:
                yAnt = (yAnt-units+Symulation.GRID_SIZE)%Symulation.GRID_SIZE;
                break;

            case RIGHT:
                xAnt = (xAnt+units+Symulation.GRID_SIZE)%Symulation.GRID_SIZE;
                break;

            case DOWN:
                yAnt = (yAnt+units+Symulation.GRID_SIZE)%Symulation.GRID_SIZE;
                break;

            case LEFT:
                xAnt = (xAnt-units+Symulation.GRID_SIZE)%Symulation.GRID_SIZE;
                break;
        }


    }

}
