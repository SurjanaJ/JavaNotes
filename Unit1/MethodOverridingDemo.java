package Unit1;
class Calculation1{
public void calc1(){
System.out.println("this is default of calculation");
}
public void calc2(int x, int y){
    System.out.println("sum is"+(x+y));
}
}
class Calculation2 extends Calculation1{
public void calc1(){
   // super.calc1();
    System.out.println("this is default of calculation2");
}
public void calc2(int x, int y){
    //super.calc2(x,y);//calls calc2
    System.out.println("diff is"+(x-y));
}
    public void calcMulti(double x, double y){
        System.out.println("multiplication is"+(x*y));   
}
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Calculation2 c2=new Calculation2();
        c2.calc1();//calls method of sub class calculation2
        c2.calc2(10,5);//calls method of sub class calculation2
        c2.calcMulti(10, 20);
        //dynamic method dispatch
        //using super class reference to call overriden method of subclass
        System.out.println("--this is dynamic method dispatch--");
        Calculation1 c1;
        c1=c2;
        c1.calc1();
        c1.calc2(10,9);
    }
}
