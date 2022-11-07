import java.awt.*;

public class Square extends Rectangle{
    private int wid;
    private int hei;

    public Square(Point initPos, Color col, int side){
        super(initPos, col,side, side);
        wid=hei=side;
    }

}
