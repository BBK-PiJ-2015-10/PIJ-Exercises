import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalcClient {
	
	public static void main (String [] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			Registry myReg = LocateRegistry.getRegistry("127.0.0.1",1099);
			CalculatorInterface c = (CalculatorInterface)myReg.lookup("mycalc");
			
			System.out.println("Please enter the first number");
			int n1 = sc.nextInt();
			System.out.println("Please enter your second number");
			int n2 = sc.nextInt();
			System.out.println("The addition is "  +c.add(n1,n2));
			System.out.println("The substraction is "  +c.substract(n1,n2));
			System.out.println("The multiplication of is "  +c.multiply(n1,n2));
			System.out.println("The division of is "  +c.divide(n1,n2));
				
			
		}
		
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

}