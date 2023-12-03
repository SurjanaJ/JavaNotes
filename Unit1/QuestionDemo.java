//write a program in java that declares rectangle class with members as
    //length and breadth. Define necessary constructor, getters and setters and
    //public static double getAreaOfPath (Rectangle r1, Rectangle r2)that returns double type of area
    //between the path. Assume Rectangle r1 is greater than Rectangle r2.
    //the public double getArea() method should calculate the area of rectangle.
package Unit1;
class Rectangle{
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    
    }
    public double getArea(){
    return(this.length*this.breadth);
    }
    public static double getAreaOfPath(Rectangle r1, Rectangle r2){
    double areaR1=r1.getArea();
    double areaR2=r2.getArea();
    double res=areaR1-areaR2;
    return res;
    }
    
}
public class QuestionDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(100.8,100.8);
        Rectangle r2=new Rectangle(50.5,40.5);
        
        double diff =Rectangle.getAreaOfPath(r1, r2);
        System.out.println("area between path is " +diff);
    }   
}
