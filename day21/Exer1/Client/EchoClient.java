import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class EchoClient {
	
	public static void main (String[] args) {
		
		try {
			
			Registry myReg = LocateRegistry.getRegistry("127.0.0.1",1099);
			EchoService echoService = (EchoService)myReg.lookup("echo");

			String receivedEcho = echoService.echo("Hello!");	
			
			
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

}