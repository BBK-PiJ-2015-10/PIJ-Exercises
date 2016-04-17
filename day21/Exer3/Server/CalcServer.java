import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;


public class CalcServer {
	
	public static void main (String[] args) {
	
		try {
			Registry ServerReg = LocateRegistry.createRegistry(1099);
			CalcImplementation c = new CalcImplementation();
			ServerReg.rebind("mycalc",c);
			
			System.out.println("The Server is ready");
			
		}
		
		catch (Exception ex ) {
			ex.printStackTrace();
		}
		
			
		}

}