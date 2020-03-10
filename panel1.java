package lab2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class panel1 extends JPanel {
    int mx,sx,my,sy;
    public panel1() {
        setBackground(Color.WHITE);//background color
        setBounds(150, 60, 700, 400);//setting bounds
        addMouseListener(new MouseAdapter() {//Mouse listener
            public void mousePressed(MouseEvent m) {//mouse pressed
                mx = m.getX();
                my = m.getY();
                repaint();
            }
            public void mouseReleased(MouseEvent m) {//mouse released
                sx = m.getX();
                sy = m.getY();
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {//mouse motion listener
            public void mouseDragged(MouseEvent m) {//mouse dragged
                sx = m.getX();
                sy = m.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(Math.min(mx, sx), Math.min(my, sy), Math.abs(mx - sx), Math.abs(my - sy));
    }
}

