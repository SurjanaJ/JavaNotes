
package Unit1;
import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        try{
            int res=num1/num2;
            System.out.println("division is"+res);
        }catch(ArithmeticException a){
            System.out.println("denominator cannot be zero"+a);
        }finally{
            System.out.println("finally block always executed");
        }
        System.out.println("out of catch block");
    }
    
}
