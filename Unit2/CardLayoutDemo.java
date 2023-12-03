package Unit2;
//place one component behind another component and only top component is displayed
import javax.swing.*;
import java.awt.*;
class Cards extends JFrame{
JButton b1,b2,b3,b4;
JPanel p1;
public void setCards(){
b1=new JButton("button1");
b2=new JButton("button2");
b3=new JButton("button3");
b4=new JButton("button4");
p1=new JPanel();//sub window

CardLayout cl=new CardLayout();
p1.setLayout(cl);
add(p1);
setVisible(true);
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//adding component on panel

p1.add(b1,"but1");
p1.add(b2,"but2");
p1.add(b3,"but3");
p1.add(b4,"but4");
//showing next component
cl.next(p1);
//showing last component
cl.last(p1);
//showing component of own choice
cl.show(p1,"but3");
}
}

public class CardLayoutDemo {
    public static void main(String[] args) {
        Cards c1=new Cards();
        c1.setCards();
    }
    
}
