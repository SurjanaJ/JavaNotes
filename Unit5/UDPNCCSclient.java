
package JavaNotes.Unit5;

import java.net.*;
import java.util.*;
public class UDPNCCSclient {
    public static void main(String[] args) {
        try{
            //create server using datagram socket
            DatagramSocket cl=new DatagramSocket();
            InetAddress ip=InetAddress.getLocalHost();//finding own ip address
            byte[]buff=new byte[8000];
            DatagramPacket dp=null;
            Scanner sc=new Scanner(System.in);
                System.out.println("client ready");
                System.out.println("enter anything u like");
            while(true){
                
                String str=sc.next();
                //converting into byte
                buff=str.getBytes();
                
                //sending data into server from datagram packet
                dp=new DatagramPacket(buff, buff.length,ip,5678);
                //send the packet
                cl.send(dp);
                //close the clent req if he presses out
                if(str.equals("out")){
                System.out.println("client ended");
                break;
            }
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
