import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class ClockServer {
	
	public static void main ( String [] args) {
		
		try {
			
			Registry reg = LocateRegistry.createRegistry(1099);
			ClockImpl sw = new ClockImpl();
			reg.bind("ServerWatch",sw);
			
			System.out.println("The ServerWatch is ready");
			
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

}