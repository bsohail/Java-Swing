package lab2;
import java.awt.event.*;
import javax.swing.*;
public class frame extends JFrame {
    private panel1 panel = new panel1();//Drawing panel
    private panel2 panel2 = new panel2();//Drawing panel
    //private JPanel BPanel = new JPanel();//background panel
    frame(){
        setTitle("Shapes");
        JLayeredPane pane = getLayeredPane();
        pane.add(panel2, new Integer(1));
        pane.add(panel,new Integer(2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1024, 800);
    }
}