package Unit1;
//using thread class
class ThreadEg extends Thread{
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
class ThreadEg1 extends Thread{
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
public class ThreadDemo1 {
    public static void main(String[] args) {
        ThreadEg1 t2=new ThreadEg1();
         ThreadEg t1=new ThreadEg();
        t1.start();
        t2.start();
    }   
}
