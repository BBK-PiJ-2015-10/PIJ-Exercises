import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ClockImpl extends UnicastRemoteObject implements Clock {

	public ClockImpl () throws RemoteException{
		
	}

	@Override
	public String Tellmethetime() {
		String result = "The curent time is " +Calendar.getInstance().get(Calendar.HOUR_OF_DAY) +" hours ";
		result = result + "and " +Calendar.getInstance().get(Calendar.MINUTE) +" minutes" + ".";
		return result;
	}

}