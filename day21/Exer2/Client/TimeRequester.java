import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class TimeRequester {

	public static void main ( String [] args ) {
		
		try {
			Registry ServerReg = LocateRegistry.getRegistry("127.0.0.1",1099);
			Clock cc = (Clock)ServerReg.lookup("ServerWatch"); 
			System.out.println(cc.Tellmethetime());
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}


}