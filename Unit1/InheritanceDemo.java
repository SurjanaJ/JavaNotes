
package Unit1;
import java.util.*;
class Box
{
private int length;
private int breadth;
private int height;
public Box(int length,int breadth,int height){
    this.length=length;
    this.breadth=breadth;
    this.height=height;
}
public void calacArea()
{
    System.out.println("area of box"+(this.length*this.breadth*this.height));
}
public void calacPeri()
{
    System.out.println("perimeter of box"+(length+breadth+height));
}
}
class BoxWeight extends Box{
private int weight;
public BoxWeight(int weight,int length,int breadth,int height){
super(length,breadth,height);
this.weight=weight;
}
public void displayWeigth()
{
    System.out.println("weight of box is"+this.weight);
}
} 
public class InheritanceDemo {
    public static void main(String[] args) {
        BoxWeight bw1=new BoxWeight(50,10,20,30);
bw1.calacArea();
bw1.calacPeri();
bw1.displayWeigth();

Scanner sc=new Scanner(System.in);
        System.out.println("enter length"); 
int len=sc.nextInt();
System.out.println("enter breadth");
int bre=sc.nextInt();
System.out.println("enter heigth");
int hei=sc.nextInt();
System.out.println("enter weight");
int wei=sc.nextInt();
BoxWeight bw=new BoxWeight(wei,len,bre,hei);
bw.calacArea();
bw.calacPeri();
bw.displayWeigth();
    }
}
