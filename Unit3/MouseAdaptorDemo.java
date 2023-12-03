//using delegation event model(listener) we have to implement all the method 
//compulsory whether they all are required or not
//but using adaptor calss we can use any of the method according to our needs
//i.e. we can 1 2 or all methods as our needs
package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseAdaptors extends JFrame{
JTextArea t1;
JLabel l1;
public void mouseAdaptors(){
l1=new JLabel("result");
t1=new JTextArea(10,10);
t1.addMouseListener(new MouseAdaptor(){
@Override
public void mouseClicked(MouseEvent e){
l1.setText("Mouse is clicked");
}
@Override
public void mouseReleased(MouseEvent e){
l1.setText("Mouse is released");
}
});
t1.addMouseMotionListener(new MouseMotionAdaptor(){
@Override
public void mouseMoved(MouseEvent e){
l1.setText("mouse is moved");
}
});
add(l1);add(t1);add(l1);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
public class MouseAdaptorDemo {
    public static void main(String[] args) {
        MouseAdaptors m1=new MouseAdaptors();
        m1.setMouseAdaptors();
    }
}
