import java.awt.*;
public class Rectangle extends Shape {
    private int wid;
    private int hei;

    public Rectangle(Point initPos, Color col, int width, int height) {
        super(initPos, col);
        hei = height;
        wid = width;
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y, wid, hei);
    }
}
