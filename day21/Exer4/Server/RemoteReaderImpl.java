import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.*;
import java.util.*;

public class RemoteReaderImpl extends UnicastRemoteObject implements RemoteReader {

	public RemoteReaderImpl () throws RemoteException {
		
	}

	public String readRemote(String address) {
		
		String result = "";
		
		File source = new File(address);
		if (!source.exists()){
			System.out.println("The address provided doesn't exist");
		}
		if (source.exists()){
			try {
				BufferedReader in = new BufferedReader(new FileReader(source));
				String line;
				while ((line=in.readLine()) !=null ){
					result = result + line;
				}
				return result;
			}
			catch (IOException ex){
				ex.printStackTrace();
			}
		}
		return result;
	}

}