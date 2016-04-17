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
		
		/*
		if (System.getSecurityManager() == null) {
            System.out.println(">1<");
            System.setSecurityManager(new SecurityManager());
            System.out.println(">2<");
		}
		*/
		
		try {
			
			//Registry ServerReg = LocateRegistry.createRegistry(1099);
			Registry ServerReg = LocateRegistry.getRegistry();
			System.out.println(">3<");
			RemoteReaderImpl r = new RemoteReaderImpl();
			ServerReg.rebind("reader",r);
			System.out.println(">4<");
			System.out.println("The server is up and running");
			
		}
		
		catch (RemoteException ex2){
			ex2.printStackTrace();
		}
		
		
		catch (Exception ex3){
			ex3.printStackTrace();
		}
		
	}

}