//focus event is generated wheneevr a compnent gains or looses 
//focous of keyword
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;
class Focuses extends JFrame{
    JLabel l1;
    JButton b1,b2;
    public void SetFocus(){
        l1=new JLabel("result");
        b1=new JButton("result");
        b2=new JButton("result");
        
        b1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEventDemo e)
            {
                l1.setText("submit butteon get focus");
                
            }
            @Override
            public void focusLost(FocusEventDemo e)
            {
                l1.setText("submit button loss focus");
                
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
        f1.SetFocus();
        
    }
}

