
//mouse motion is generated whenerver mouse is dragged or moved
//mouse wheel is generated when mouse wheel is used

package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseMotionWheel extends JFrame{
    JTextArea t1;
    JLabel l1;
    public void setMouseMotionWheel(){
    t1=new JTextArea(10,10);
    l1=new JLabel("result");
    //handlong mouse motion event in t1
    t1.addMouseMotionListener(new MouseMotionListener(){
        @Override
        public void mouseDragged(MouseEvent e){
        l1.setText("mouse is dragged");
        }
    
        @Override
        public void mouseMoved(MouseEvent e){
        l1.setText("mouse is moved at" +e.getX()+","+e.getY());
        }
    });
    //handling mouse wheel event in t1
    t1.addMouseWheelListener(new MouseWheelListener(){
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
        l1.setText("mouse wheel is moved");
        }
    });
    add(t1);add(l1);
    setVisible(true);
    setSize(400,400);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MouseMotionAndWheelDemo {
    public static void main(String[] args) {
        MouseMotionWheel m1=new MouseMotionWheel();
        m1.setMouseMotionWheel();
    }
}
