import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Clock extends Remote {

	public String Tellmethetime() throws RemoteException;

}