import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.server.*;
import java.rmi.*;


public class EchoServerLauncher {
	
	
	public static void main (String [] args) {
		
		EchoServerLauncher script = new EchoServerLauncher();
		script.launch();
		
	}
	

	private void launch (){

		/*
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		*/

		try {
			LocateRegistry.createRegistry(1099);
			
			
			
			EchoServer server = new EchoServer();
			
			String registryHost = "//localhost/";
			String serviceName = "echo";
			Naming.rebind(registryHost + serviceName, server);
			
			System.out.println("The server is ready");
			
			
		}
		catch (MalformedURLException ex1){
			ex1.printStackTrace();
		}
		catch (RemoteException ex2){
			ex2.printStackTrace();
		}
	
	}
}