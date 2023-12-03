
package Unit4;
import java.sql.*;
import java.util.*;

public class PrepareStatementDemo {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your id");
            int id=sc.nextInt();
            System.out.println("enter your username");
            String uname=sc.next();
            System.out.println("enter your password");
            String pass=sc.next();
            System.out.println("enter your repassword");
            String repass=sc.next();
            System.out.println("enter your gender");
            String gender=sc.next();
            System.out.println("enter your course");
            String course=sc.next();
            System.out.println("enter your country");
            String country=sc.next();
            
            //connecting to database
            String url="jdbc:mysql://localhost:3306/nccs";
            String username="root";
            String password="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            
            //isnert data into table
            String insQuery="insert into tbl_reg values(?,?,?,?,?,?,?)";
            PreparedStatement ps= conn.prepareStatement(insQuery);
            ps.setInt(1,id);
            ps.setString(2,uname);
            ps.setString(3,pass);
            ps.setString(4,repass);
            ps.setString(5,gender);
            ps.setString(6,course);
            ps.setString(7,country);
            int res=ps.executeUpdate();
            if(res>0){
                System.out.println(res+"record inserted");
            }
            //delete record of person accoing to id 
            System.out.println("enter id of person whose record is to be deleted");
            int delid=sc.nextInt();
            String delQuery="delete from tbl_reg where id=?";
            PreparedStatement ps2=conn.prepareStatement(delQuery);
            ps2.setInt(1,delid);
            int res2=ps2.executeUpdate();
            if(res2>0)
            {
                System.out.println("record deleted");
            }
            
            //display record of person whose gender is male
            String disQuery="select * from tbl_reg where gender=?";
            PreparedStatement ps1=conn.prepareStatement(disQuery);
            ps1.setString(1,"male");
            ResultSet rs=ps1.executeQuery();
            
            while(rs.next()){
                System.out.println("id is"+rs.getInt("id"));
                System.out.println("username is"+rs.getString("username"));
                System.out.println("password is"+rs.getString("password"));
                System.out.println("repassword is"+rs.getString("repassword"));
                System.out.println("gender is"+rs.getString("gender"));
                System.out.println("country is"+rs.getString("country"));
            }
            
            
            
        }
        catch(ClassNotFoundException c){
            System.out.println(c);
            
        }
        catch(SQLException e){
            System.out.println(e);
            
        }
        
    }
}
