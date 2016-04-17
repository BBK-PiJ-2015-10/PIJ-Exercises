import java.rmi.Remote;
import java.rmi.RemoteException; 

public interface RemoteReader extends Remote {

	public String readRemote(String address) throws RemoteException;

}