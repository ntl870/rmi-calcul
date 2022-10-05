import java.rmi.*;

public interface RMICalcul extends Remote {
    public int add (int a, int b) throws RemoteException;
    public int sub (int a, int b) throws RemoteException;
    public double convert (int f) throws RemoteException;
}