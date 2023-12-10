//network programming: how data are transferrd into network using TCP and UDP
//to use network programming java.net package should be imported.
//in network programming client is known as socket and server is known as socket server.
//in UDP both client and server is referred to socket(Datagram socket)

package JavaNotes.Unit5;

import java.net.*;
public class UDPNCCSserver {
    public static void main(String[] args) {
        try{
        //creating server
        DatagramSocket ds=new DatagramSocket(5678);
        byte[]rec=new byte[8000];
        //cretaing packet
        DatagramPacket dp=null;
            System.out.println("server ready");
        while(true){
        dp=new DatagramPacket(rec,rec.length);
        //receiving data
        ds.receive(dp);
        //displaying data sent by client
            System.out.println("client sent"+changeString(rec));
            //close the server if user sent out
            if(changeString(rec).toString().equals("out")){
                System.out.println("client presses out so service exit");
                break;
            }
            //clearing the buffer
            rec=new byte[8000];
            
        }
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //converting into string and returning result
    public static StringBuilder changeString(byte a[]){
    if(a==null){
        return null;
    }else{
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(a[i]!=0){
            sb.append((char)a[i]);
            i++;
    }
    return sb;
    }
}
    
}
