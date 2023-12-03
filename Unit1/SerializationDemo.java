
package Unit1;

import java.io.*;
class rectangle implements Serializable{
private int length;
private int breadth;
public void setRect(int length, int breadth){
this.length=length;
this.breadth=breadth;
}
public void calcArea(){
    System.out.println("area is"+(length*breadth));}
public void calcPeri(){
int peri=2*(length+breadth);
    System.out.println("perimeter is"+peri);}
}
public class SerializationDemo {
    public static void main(String[] args) {
        try{
        rectangle r1=new rectangle();
        r1.setRect(10,10);
        FileOutputStream fos=new FileOutputStream("Csitb.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(r1);
            System.out.println("object written to file");
            fos.close();
            oos.close();            
            //deserialization
            FileInputStream fis=new FileInputStream("csitb.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            rectangle r2=(rectangle)ois.readObject();
        }catch(IOException e){
            System.out.println("e");
        }catch(ClassNotFoundException c){
            System.out.println("c");
        }}}