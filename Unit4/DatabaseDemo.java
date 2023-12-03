//here jar file is used as driver to connect java application with database
package unit4;
import java.sql.*;
public class DatabaseDemo {
    public static void main(String[] args) {
        try{
           //step 1: initialize driver class
           Connection conn;
           Class.forName("com.mysql.cj.jdbc.Driver");
           //step 2: make connectiojn with server
           String url = "jdbc:mysql://localhost:3306/nccs";
           //portol:server    port number        database
           String username="root";
           String password="";
           conn= DriverManager.getConnection(url, username, password);
           if(conn!=null){
               System.out.println("server connected");
           }else{
               System.out.println("server not connected");
           }
           //step 3: use statement object to exceute query
           Statement st = conn.createStatement();
           //step 4: write query and execute it
           //createing table
//           String tblquery="create table tbl_reg (id int primary key,"
//                   +"username varchar(50),password varchar(50),"
//                   +"repassword varchar(50), gender varchar(50),"
//                   +"course varchar(50),country varchar(50))";
//           int res = st.executeUpdate(tblquery);
//           if(res>0){
//               System.out.println("Table created");
//           }
           //insert operation 
           String insQuery="insert into tbl_reg values(2, 'edeena', 'abc', 'abc', 'female', 'c','china')";
           int res=st.executeUpdate(insQuery);
           if(res>0){
              System.out.println(res+"row inserted");
           }else{
               System.out.println("error");
           }
//           //displaying data (retriveing
           String disQuery = "select * from tbl_reg";
           ResultSet rs = st.executeQuery(disQuery);
           while(rs.next()){
               System.out.println("id is"+rs.getInt("id"));
               System.out.println("username is"+rs.getString("username"));
               System.out.println("password is"+rs.getString("password"));
               System.out.println("repassword is"+rs.getString("repassword"));
               System.out.println(" gender"+rs.getString("gender"));
               System.out.println("course is"+rs.getString("course"));
               System.out.println("country is"+rs.getString("country"));
           }
//           //update name to sam country to usa of person where id is 2
//           String upQuery="update tbl_reg set username='sam',country='usa'where id=2";
//           int res1=st.executeUpdate(upQuery);
//           if(res1>0){
//              System.out.println(res1+"record updated");
//           }else{
//               System.out.println("error");
//           }
        }catch(ClassNotFoundException c){
            //this except is thrown if driver class is not found (jar file)
            System.out.println(c);
            
        }catch(SQLException e){
            //if there is error in sql command
            System.out.println(e);
        }
    }
}

