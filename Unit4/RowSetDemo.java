//row set is more flexible than result as row set are by default
//scrooable 
//and updateabe ir its ponter can be moved to any row
//to fecth recod and to update such records
//for row set it is rquied to import javax.sql.rowset packet
package Unit4;
import java.sql.*;
import javax.sql.rowset.*;


public class RowSetDemo {
    public static void main(String[] args) {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create rowset
            JdbcRowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
            //for database connecton
            
            rs.setUrl("jdbc:mysql://localhost:3306/nccs");
            rs.setUsername("root");
            rs.setPassword("");
            String disQuery="select * from tbl_reg";
            rs.setCommand(disQuery);
            rs.execute();
            rs.absolute(4);
            
            System.out.println("id is "+rs.getInt("id"));
            System.out.println("username is "+rs.getString("username"));
            System.out.println("course is "+rs.getString("course"));
            System.out.println("gender is "+rs.getString("gender"));
            System.out.println("country is "+rs.getString("country"));
            //update name to sita and country tosita
            rs.updateString("username", "sita");
            rs.updateString("country", "sita");
            rs.updateRow();
            
            
            
        }catch(ClassNotFoundException c){
            System.out.println(c);
            
        }
        catch(SQLException s){
            System.out.println(s);
            
        }
    }
}
