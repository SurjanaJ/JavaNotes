/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Windowss{
    JFrame jf;
    public void setWindowAdaptor(){
    jf=new JFrame();
    jf.addWindowListener(new WindowAdapter(){
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

    public class WindowAdaptorDemo {
        public static void main(String[] args) {
           Windowss w= new Windowss();
           w.setWindowAdaptor();
        }
    }
    

