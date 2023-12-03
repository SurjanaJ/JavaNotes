package Unit1;
class cal1 implements Runnable{
@Override
public void run(){
for(int i=1;i<=10;i++){
if(i%2==0){
    System.out.println("first therad"+i);
    try{
    Thread.sleep(500);
    }catch(InterruptedException e){
        System.out.println("e");
    }}}}}
class cal2 implements Runnable{
@Override
public void run(){
for(int i=10;i<=20;i++){
    System.out.println("Second Thread"+i);
    try{
    Thread.sleep(1000);
    }catch(InterruptedException e){
        System.out.println("e");
    }
}
}
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        cal1 c1=new cal1();
        cal2 c2=new cal2();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }  
}
