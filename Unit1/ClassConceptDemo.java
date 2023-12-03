package Unit1;
import java.util.*;
class rectangle{
    private int length;
    private int breadth;
    //constructor
    public rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void CalcArea(){
        System.out.println("area is"+(this.length*this.breadth));
    }
    public int calcPeri(){
        int peri=2*(length+breadth);
        return (peri);
    }
}
public class ClassConceptDemo {
    public static void main(String[] args) {
        rectangle r1=new rectangle(60,50);
        r1.CalcArea();
        int peri1=r1.calcPeri();
        System.out.println("perimeter is"+peri1);
        //taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int len=sc.nextInt();
        System.out.println("enter breadth");
        int bre=sc.nextInt();
        rectangle r2=new rectangle(len,bre);
        r2.CalcArea();
        int peri2=r2.calcPeri();
        System.out.println("Perimetr is"+peri2);
    }
}
