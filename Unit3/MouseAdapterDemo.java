//using deletagte event model(listener)we have to implement all 
//megthod compulsary wherether thet all are required
//but using adapter class we can use any of the method accoridng to our needs
//ie we can  add 1 2 or all method as our need
package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseAdapter extends JFrame{
    
    JTextArea t1;
    JLabel l1;
    
    public void mouseAdapters(){
    l1= new JLabel("reuslt");
    t1=new JTextArea(10,10);
    
    t1.addMouseListener((MouseListener) new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            l1.setText("mouse id clicedd");
            
        }
        @Override
        public void mouseReleased(MouseEvent e){
            l1.setText("mouse id clicedd");
            
        }
    });
    t1.addMouseMotionListener(new MouseMotionAdapter(){
        @Override
        public void mouseMoved(MouseEvent e){
            l1.setText("mouse moved at"+e.getX()+","+e.getY());
    
    });
    
    add(l1);add(t1);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
    
}
public class MouseAdapterDemo {
    public static void main(String[] args) {
        MouseAdapter m1=new MouseAdapter();
        m1.mouseAdapters();
    
}
