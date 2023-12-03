package Unit1;
import java.io.*;
public class FileDemo2{
    public static void main(String[] args) {
        try{
        File f1=new File("Csit.txt");
        if(!f1.exists()){
        f1.createNewFile();
            System.out.println("new file created");
        }else{
            System.out.println("file already exists");
        }
        //file info
            System.out.println("name of the file is"+f1.getName());
            System.out.println("absolute path is"+f1.getAbsolutePath());
            //inserting data into file using byte stream
            
            FileOutputStream fos=new FileOutputStream("Csit.txt");
            String msg="hello csit";
            byte[]b1=msg.getBytes();
            fos.write(b1);
            System.out.println("content written successfully");
            fos.close();
            //reading contents from the file 
            FileInputStream fis=new FileInputStream("Csitb.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.println((char)i);
            }
            fis.close();
        }catch(IOException e){
            System.out.println("e");
        }
    }
}




