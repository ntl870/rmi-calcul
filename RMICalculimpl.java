import java.io.Serializable;
import java.rmi.RemoteException;

public class RMICalculimpl implements RMICalcul, Serializable {
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public double convert(int f) throws RemoteException {
        return  ((f - 32)*5)/9;
    }
}