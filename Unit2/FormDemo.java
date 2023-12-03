
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form extends JFrame{
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1;
JPasswordField p1,p2;
JRadioButton r1,r2;
JCheckBox c1,c2,c3;
JComboBox cb1;
JButton b1;
public void setForm(){
l1=new JLabel("username");
l2=new JLabel("password");
l3=new JLabel("repassword");
l4=new JLabel("gender");
l5=new JLabel("course");
l6=new JLabel("degree");
l7=new JLabel("result");
t1=new JTextField(20);
p1=new JPasswordField(20);
p2=new JPasswordField(20);
r1=new JRadioButton("Male");
r2=new JRadioButton("Female");
c1=new JCheckBox("c");
c2=new JCheckBox("c++");
c3=new JCheckBox("java");
String[]degree={"intermediate","+2","Bachelor","Master"};
cb1=new JComboBox(degree);
b1=new JButton("submit");
ButtonGroup bg=new ButtonGroup();
//adding component into window
bg.add(r1);bg.add(r2);
add(l1);add(t1);
add(l2);add(p1);
add(l3);add(p2);
add(l4);add(r1);add(r2);
add(l5);add(c1);add(c2);add(c3);
add(l6);add(cb1);
add(b1);add(l7);
setVisible(true);
setSize(500,500);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//When submit button is clicked
b1.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
//extracting from the field

String uname=t1.getText();
String pass=p1.getText();
String repass=p2.getText();
String gender="";

if(r1.isSelected()){
gender+="male";
}else{
gender+="female";
}

String course="";
if(c1.isSelected()){
course="c"+"";
}
if(c2.isSelected()){
course+="c++"+"";
}
if(c3.isSelected()){
course+="java";
}
//for combo box
String degree=(String)cb1.getSelectedItem();
//displaying final result in label7
String res="your name is"+uname+"password is"+pass+"repassword is"+repass+"gender is"+gender+"course is"+course+
        "degree is"+degree;
l7.setText(res);
}
});

}
}
public class FormDemo {
    public static void main(String[] args) {
        Form f1=new Form();
        f1.setForm();
        
    }
}


