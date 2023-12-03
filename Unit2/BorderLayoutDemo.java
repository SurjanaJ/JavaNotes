
package Unit2;

//divide the window into five parts north, south,east,west,center and
//place the component in such 5 parts
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Border extends JFrame{
JButton b1,b2,b3,b4;
JTextArea t1;
public void setBorder(){
b1=new JButton("North Button");
b2=new JButton("East Button");
b3=new JButton("South Button");
b4=new JButton("West Button");
t1=new JTextArea(20,40);
setVisible(true);
setSize(400,400);
setLayout(new BorderLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//adding component into respective position using border

add(b1,BorderLayout.NORTH);
add(b2,BorderLayout.EAST);
add(b3,BorderLayout.SOUTH);
add(b4,BorderLayout.WEST);
add(t1,BorderLayout.CENTER);

//handling event
b1.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
    t1.setText("North button is clicked");
}
});
b2.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
    t1.setText("East button is clicked");
}
});
b3.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
    t1.setText("South button is clicked");
}
});
b4.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
    t1.setText("West button is clicked");
}
});

}
}
public class BorderLayoutDemo {
    public static void main(String[] args) {
        Border b1=new Border();
        b1.setBorder();
    }
    
}
