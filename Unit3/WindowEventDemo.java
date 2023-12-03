//window event is generated when window os closed, opened, minimized
//back to normal state after minimized,activated,deactivated(not working)
package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Window{
    JFrame jf;
    public void setWindow(){
    jf=new JFrame();
    jf.addWindowListener(new WindowListener(){
        @Override
        public void windowClosed(WindowEvent e){
        //whwn window is closed due to any interrupt
            System.out.println("window is closed");
        }
        @Override
        public void windowClosing(WindowEvent e){
            System.out.println("window closing through cross sign");
        }
        @Override
        public void windowActivated(WindowEvent e){
            //when window is in working state
            System.out.println("window is running");
        }
        @Override
        public void windowDeactivated(WindowEvent e){
            //when window isnt in working state
            System.out.println("window is not working");
        }
        @Override
        public void windowOpened(WindowEvent e){
            System.out.println("window is opened");
        }
        @Override
        public void windowIconified(WindowEvent e){
            System.out.println("window is minimized(iconified)");
        }
        @Override
        public void windowDeiconified(WindowEvent e){
            System.out.println("window is back to normal");}
    });
            jf.setVisible(true);
            jf.setSize(400,400);
            jf.setLayout(new FlowLayout());
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
            
    
}
public class WindowEventDemo{
    public static void main(String[] args) {
        Window w1=new Window();
        w1.setWindow();
        
    }
}