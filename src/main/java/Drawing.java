import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    Point p=new Point(200,200);
    Color c=new Color(0x992266);
    Circle circle = new Circle(p,c,100);
    private final Frame f;
    public Drawing(){
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
        setBackground(Color.WHITE);
        setSize(400,400);
    }

    public void paint(Graphics g) {
        circle.draw(g);

    }
}
