import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ReaderClientLauncher {

	public static void main ( String [] args ){
		
		try {
			
			Scanner input = new Scanner (System.in);
			
			Registry Reg = LocateRegistry.getRegistry("127.0.0.1",1099);
			RemoteReader cr = (RemoteReader) Reg.lookup("reader");
			
			System.out.println("Please the name of the file you are looking for");
			String target = "\\Users\\YasserAlejandro\\PIJ\\Day-21\\Exer4\\"+input.next();
			
			System.out.println(cr.readRemote(target));
			
			
		}
		
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

}