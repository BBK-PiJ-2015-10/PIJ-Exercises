import java.util.concurrent.*;
import java.util.Scanner;

public class TaskScript {
	
	public static void main (String args []) {
		
		
		Scanner in = new Scanner(System.in);
		
		Executor e = new UIExecutor();
		Executor serial = new SerialExecutor(e);
		
		for (int i=0; i<10; i++){
			
			System.out.println("Max waiting time is " +((SerialExecutor)serial).getMaxPendingTime() );
			System.out.println("Please enter the duration of task " +i);		
			int duration = in.nextInt();
			TimedTask inputtask = new TimedTask(duration);
			serial.execute(inputtask);
			System.out.println("Max waiting time is " +((SerialExecutor)serial).getMaxPendingTime() );	
			
		}
		
	}
	
}