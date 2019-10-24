package sample;


import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle  {

    int x;
    int y;

    boolean isWhite;

    public Square(double width, double height, Paint fill, int x, int y, boolean isWhite) {
        super(width, height, fill);
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }
}
