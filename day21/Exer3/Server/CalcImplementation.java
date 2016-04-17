import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//import CalculatorInterface;

public class CalcImplementation extends UnicastRemoteObject implements CalculatorInterface {

	public CalcImplementation () throws RemoteException {
	}

	@Override
	public int add (int n1, int n2) throws RemoteException {
		return n1+n2;
	}
	
	@Override
	public int substract (int n1, int n2) throws RemoteException{
		return n1-n2;
	}
	
	@Override
	public int multiply (int n1, int n2) throws RemoteException{
		return n1 * n2;
	}
	
	@Override
	public double divide (int n1, int n2) throws RemoteException {
		return n1/n2;
	}
	

}