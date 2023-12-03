
//mouse event is generated when mouse is clicked, presssed, released
//cursor enter into component, cursor exited from component
package unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mouse extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setMouse(){
        t1= new JTextField(20);
        l1= new JLabel("result");
        //mouse event
        t1.addMouseListener(new MouseListener(){
            public void mouseClickeded(MouseEvent e){
                //when mouse is clicked and immediately release inside component
                l1.setText("mouse is clicked");
            }
            @Override
            public void mousePressed(MouseEvent e){
                //when mouse is continuously clicked 
                l1.setText("mouse is pressed");
            }
            @Override
            public void mouseEntered(MouseEvent e){
                //when mouse is placed inside of component
                l1.setText("mouse entered in component");
            }
            @Override
            public void mouseExited(MouseEvent e){
                //when mouse is placed out of component
                l1.setText("mouse exited from component");
            }
            @Override
            public void mouseReleased(MouseEvent e){
                //when mouse is released outside of component
                l1.setText("mouse released");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
           
        });
        add(t1); add(l1);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }       

    
}
 
public class MouseEventDemo {
    public static void main(String[] args) {
        Mouse m1= new Mouse();
        m1.setMouse();
    }    
}
