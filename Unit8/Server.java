//RMI refers to remote Method Invocation it means that it is used for invoking
//method of another object from one object i.e used to communicate between two
//seperate JVM.(java virtsaul machine). It involves two parts

// CLient:stub:is a object that invoke method of other object. It write the necessary parameter to skeleton(server)
//another JVM object known as marshaling. It also reads the parameter sent from skeleton and pass to client
//object known as unmarshaling.

//Server Skeleton: it is a object that provides use of method to client object.
//it invokes remote object and provides services to client object i.e. sent method to client known as marshaling

//Method step to create rmi program
//cretate remote interface
//create server program that provide details of method of remote interface, for this case remote registry should
//be used.
//create client program that request services of server

package JavaNotes.Unit8;
//use remote object to procide servoies to client.for this server has to inherit UnicastRemoteObejct.
//it throes remoteeCXEPTIipn which is thrown if remote interface is not found
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Server extends UnicastRemoteObject implements Adder{//RMI refers to remote Method Invocation it means that it is used for invoking
//method of another object from one object i.e used to communicate between two
    public Server()throws RemoteException{
        super();
        
    }
    
        
    @Override
    public int add(int x, int y) {
        return(x+y);        
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int mul(int x, int y) {
        
        return(x*y);//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String findEven(int x) {
        if(x%2==0){
            return"even number";
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        else{
                return"odd number";

            }
    }
    public static void main(String[] args) {
        try{
            Registry reg=LocateRegistry.createRegistry(8888);
            reg.rebind("helloserver",new Server());
            System.out.println("server is redy to serve");
        
        }
        catch(RemoteException r ){
                   System.out.println(r);
        }
        
//seperate JVM.(java virtsaul machine). It involves two parts

// CLient:stub:is a object that invoke method of other object. It write the necessary parameter to skeleton(server)
//another JVM object known as marshaling. It also reads the parameter sent from skeleton and pass to client
//object known as unmarshaling.

//Server Skeleton: it is a object that provides use of method to client object.
//it invokes remote object and provides services to client object i.e. sent method to client known as marshaling

//Method step to create rmi program
//cretate remote interface
//create server program that provide details of method of remote interface, for this case remote registry should
//be used.
//create client program that request services of server


//use remote object to procide servoies to client.for this server has to inherit UnicastRemoteObejct.
//it throes remoteeCXEPTIipn which is thrown if remote interface is not found


        
    }
    
}
