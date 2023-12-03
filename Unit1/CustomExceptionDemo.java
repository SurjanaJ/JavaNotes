
package Unit1;
import java.util.*;
//write a program that reads college name from user and display the name
//of college and if the length of college name is more than 5
//then throw the exception
class CollegeError extends Exception{
@Override
public String toString(){
return "college name cannot be greater than 5 letter";
}}
class College{
public void setCollege(String name)throws CollegeError {
if(name.length()>=5){
throw new CollegeError();
}else{
    System.out.println("name of college is"+name);
}
}
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        College c1=new College();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your college name");
        String cname=sc.next();
        
        
        
        try{
        c1.setCollege(cname);
        }catch(CollegeError c){
            System.out.println("c");
        }
    }
    
    
    
    
    //write a program in java that declares rectangle class with members as
    //length and breadth. Define necessary constructor, getters and setters and
    //public static double getAreaOfPath (Rectangle r1, Rectangle r2)that returns double type of area
    //between the path. Assume Rectangle r1 is greater than Rectangle r2.
    //the public double getArea() method should calculate the area of rectangle.
    
    
    
    
    
}
