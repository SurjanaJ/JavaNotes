package unit4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Form extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JComboBox cb1;
    JButton b1;
    public void setForm(){
        l1= new JLabel("Id");
        l2= new JLabel("Username");
        l3= new JLabel("Password");
        l4= new JLabel("Repassword");
        l5= new JLabel("Gender");
        l6= new JLabel("Course");
        l7= new JLabel("Country");
        l8= new JLabel("Result");
        t1= new JTextField(20);
        t2= new JTextField(20);
        p1= new JPasswordField(20);
        p2= new JPasswordField(20);
        r1= new JRadioButton("male");
        r2= new JRadioButton("female");
        b1= new JButton("Submit");
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1); bg.add(r2);
        c1 = new JCheckBox("C");
        c2 = new JCheckBox("Java");
        c3 = new JCheckBox("web");
        String country[]={"nepal","Japan","china","India"};
        cb1 = new JComboBox(country);
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(p1);
        add(l4); add(p2);
        add(l5); add(r1);add(r2);
        add(l6); add(c1);add(c2);add(c3);
        add(l7); add(cb1);
        add(b1);add(l8);
        add(l8); 
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //extracting fromfield
                String id = t1.getText();
                String uname = t2.getText();
                String pass = p1.getText();
                String repass = p1.getText();
                String gender = "";
                if(r1.isSelected()){
                    gender+="male";
                }else{
                    gender+="female";
                }
                String course="";
                if(c1.isSelected()){
                    course+="C"+",";
                }
                if(c2.isSelected()){
                    course+="java"+"'";
                }
                if(c3.isSelected()){
                    course+="web"+"'";
                }
                String country1=(String)cb1.getSelectedItem();
                //database connection
                try{
                    Connection conn;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/nccs";
                    String username="root";
                    String password="";
                    conn = DriverManager.getConnection(url, username, password);
                    String insQuery="insert into tbl_reg values(?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(insQuery);
                    ps.setString(1, id);
                    ps.setString(2,uname);
                    ps.setString(3, pass);
                    ps.setString(4, repass);
                    ps.setString(5, gender);
                    ps.setString(6, course);
                    ps.setString(7, country1);
                    int res = ps.executeUpdate();
                    if(res>0){
                        l8.setText("record inserted");
                    }
                    
                }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
            }
        });
    }
}
public class SwingJDBCDemo {
    public static void main(String[] args) {
        Form f1 = new Form();
        f1.setForm();
    }
}
