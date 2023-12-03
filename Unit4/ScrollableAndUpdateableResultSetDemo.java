//using result set we can only move pointer to froward direction ie we canot fetch partcular  rowe we like 
//using scroolable and updateable resut set we can fecth any row as we like
//per need ie we can fetcch last row,third row
//it can move pointer to any row

package Unit4;
import java.sql.*;

public class ScrollableAndUpdateableResultSetDemo {
    public static void main(String[] args) {
        try{
            Connection conn;
            //connecting to database
            String url="jdbc:mysql://localhost:3306/nccs";
            String username="root";
            String password="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,username,password);
            
            //creeating scroable and updateable result set
            
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                                                        //scrollable,updateable
                                                        
            String disQuery="select * from tbl_reg";
            ResultSet rs=st.executeQuery(disQuery);
            //fecthing last row
            rs.last();
            System.out.println("id is "+rs.getInt("id"));
            System.out.println("username is "+rs.getString("username"));
            System.out.println("course is "+rs.getString("course"));
            System.out.println("gender is "+rs.getString("gender"));
            System.out.println("country is "+rs.getString("country"));
            //fetchingg partiular row
            rs.absolute(4);
            System.out.println("fetching of 4th row");
            System.out.println("id is "+rs.getInt("id"));
            System.out.println("username is "+rs.getString("username"));
            System.out.println("course is "+rs.getString("course"));
            System.out.println("gender is "+rs.getString("gender"));
            System.out.println("country is "+rs.getString("country"));
            
            //udpating course to java and countery to india for forth row 
            rs.updateString("course","csit");
            rs.updateString("country", "inida");
            
            rs.updateRow();
            
            //insert new lable after 3th row
            rs.absolute(3);
            rs.updateInt("id",11);
            rs.updateString("username","manish");
            rs.updateString("password","manish");
            rs.updateString("repassword","manish");
            rs.updateString("gender","manish");
            rs.updateString("course","manish");
            rs.updateString("country","manish");
            rs.updateRow();
            
            
        }
        catch(ClassNotFoundException c){
            System.out.println(c);
            
        }
        catch(SQLException e){
            System.out.println(e);
            
        }
    }
    
}
