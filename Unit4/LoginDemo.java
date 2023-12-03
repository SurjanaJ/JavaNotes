
package Unit4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Login extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    public void setLogin(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Result");
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        b1= new JButton("Submit");
        
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(b1);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String uname=t1.getText();
                String pass=p1.getText();
                try{
                    Connection conn;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/nccs";
                    String username="root";
                    String password="";
                    conn = DriverManager.getConnection(url, username, password);
                    String disQuery="select * from tbl_reg where username=? and password=?";
                    PreparedStatement ps=conn.prepareStatement(disQuery);
                    ps.setString(1,uname);
                    ps.setString(2,pass);
                    ResultSet rs=ps.executeQuery();
                    if(rs.next()){
                        String funame=rs.getString("username");
                        String fcourse=rs.getString("course");
                        String fcountry=rs.getString("country");
                        
                        l3.setText("welcome"+funame+"course"+fcourse+"country"+fcountry);
                        
                    }
                    else
                    {
                        l3.setText("username or password error");
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
public class LoginDemo {
    public static void main(String[] args) {
        Login l1=new Login();
        l1.setLogin();
        
    }
    
}
