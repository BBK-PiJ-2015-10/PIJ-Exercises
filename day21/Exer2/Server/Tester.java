import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tester {

	public static void main (String [] args) {


		//Calendar day1 = new GregorianCalendar(2015, 10, 1, 18, 45);
		Calendar day1 = Calendar.getInstance();
		System.out.print("The curent time is " +day1.get(Calendar.HOUR_OF_DAY) +" hours ");
		System.out.println("and " +day1.get(Calendar.MINUTE) +" minutes" + " .");
		
		//String result = "The curent time is " +day1.get(Calendar.HOUR_OF_DAY) +" hours ";
		//result = result + "and " +day1.get(Calendar.MINUTE) +" minutes" + " .";
		
		String result = "The curent time is " +Calendar.getInstance().get(Calendar.HOUR_OF_DAY) +" hours ";
		result = result + "and " +Calendar.getInstance().get(Calendar.MINUTE) +" minutes" + ".";
		System.out.println(result);
		
	}


}