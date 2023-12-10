
package JavaNotes.Unit8;
import java.rmi.*;

public interface Adder extends Remote{//it id remote used by server
    public int add(int x,int y)throws RemoteException;
    public int mul(int x,int y) throws RemoteException;
    public String findEven(int x) throws RemoteException;
    
}
