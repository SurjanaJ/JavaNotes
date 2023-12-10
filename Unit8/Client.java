//request service from serverie invoke pbject of server 
package JavaNotes.Unit8;
import java.rmi.*;
import java.rmi.registry.*;

import java.util.*;//user bata input liyeko le

public class Client {
    public static void main(String[] args) {
        try{
            Registry reg=LocateRegistry.getRegistry("localhost",8888);
            Adder ad=(Adder)reg.lookup("helloserver");
            
            Scanner sc= new Scanner(System.in);
            System.out.println("enter first number");
            int num1=sc.nextInt();
            System.out.println("enter second number");
            int num2=sc.nextInt();
            System.out.println("addtionis "+ad.add(num1,num2));
            System.out.println("multiply is "+ad.mul(num1,num2));
            System.out.println("the no is "+ad.findEven(num1));
            
            
        }catch(RemoteException|NotBoundException e){
            System.out.println(e);
            
        }
    }
}
