import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.net.MalformedURLException;


public class ReaderServerLauncher {

	public static void main (String[] args) {
		
		ReaderServerLauncher script = new ReaderServerLauncher();
		script.launch();
		
	}
	
	public void launch(){
		
		try {
			
			Registry ServerReg = LocateRegistry.createRegistry(1099);
			RemoteReaderImpl r = new RemoteReaderImpl();
			ServerReg.rebind("reader",r);
			System.out.println("The server is up and running");
			
		}
		
		/*
		catch (MalformedURLException ex1){
			ex1.printStackTrace();
		}
		*/
		
		catch (RemoteException ex2){
			ex2.printStackTrace();
		}
		
		
		catch (Exception ex3){
			ex3.printStackTrace();
		}
		
	}

}