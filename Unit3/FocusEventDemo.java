//focus event is generated whenever component gains or looses focus of keyboard
package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Focuses extends JFrame{
JLabel l1;
JButton b1,b2;
public void setFocus(){
l1=new JLabel("result");
        b1=new JButton("submit");
        b2= new JButton("reset");
        b1.addFocusListener(new FocusListener(){
          

    @Override
    public void focusGained(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    l1.setText("submit button get focus");
    }

    @Override
    public void focusLost(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        l1.setText("submit button lost focus");
    }
        });
        add(l1);add(b1);add(b2);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
public class FocusEventDemo {
    public static void main(String[] args) {
        Focuses f1=new Focuses();
        f1.setFocus();
    }
    
}
