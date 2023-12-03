
package Unit2;
//place the component in form of row and column
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Grid extends JFrame{
JButton b1,b2,b3,b4,b5,b6;
public void setGrid(){
    b1=new JButton("Button1");
    b2=new JButton("Button2");
    b3=new JButton("Button3");
    b4=new JButton("Button4");
    b5=new JButton("Button5");
    b6=new JButton("Button6");

    add(b1);add(b2);add(b3);
    add(b4);add(b5);add(b6);

    setVisible(true);
    setSize(400,400);
    setLayout(new GridLayout(2,3,10,10));//3 row 2 coln
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        Grid g1=new Grid();
        g1.setGrid();
    }
}
    

