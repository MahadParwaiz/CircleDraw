import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    Point p=new Point(200,200);
    Color c=new Color(0x992266);
    Circle circle = new Circle(p,c,100);

    Point x= new Point(10,10);
    Color d= new Color(0x992266);
    Rectangle rectangle=new Rectangle(x,d,100,100);
    private Frame f;
    public Drawing(){
        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400,400);
    }

    private void setupFrame() {
        f = new Frame("My Window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {
        circle.draw(g);
        rectangle.draw(g);

    }
}

