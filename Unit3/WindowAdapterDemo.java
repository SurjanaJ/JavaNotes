//window event contains 6 methods now we can use any of them
package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Windowss{
        JFrame jf;
    public void WindowAdapter(){
        jf= new JFrame();
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowIconified(WindowEvent e){
                System.out.println("window is minimized");
            }
            
            @Override
            public void windowDeiconified(WindowEvent e){
                System.out.println("window is minimized");
            }
        });
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }

        }
public class WindowAdapterDemo {
    public static void main(String[] args) {
        Windowss w=new Windowss();
        w.WindowAdapter();
    }
}
