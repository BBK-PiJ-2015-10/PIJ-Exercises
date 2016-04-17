import java.util.concurrent.*;
import java.util.Scanner;

public class TaskScript {
	
	public static void main (String args []) {
		
		Task[] taskList = new Task[10];
		String result = "";
		
		Scanner in = new Scanner(System.in);
		
		int counter =0;
		
		for (int i=0; i<10; i++){
			
			System.out.println("Please enter the duration of task " +i);		
			int duration = in.nextInt();
			Task inputtask = new Task(duration,i);
			Executor e = new UIExecutor();	
		
			Executor serial = new SerialExecutor(e);
			
			serial.execute(inputtask);
			
			taskList[i] = inputtask;
		
			counter ++;
			
			boolean print = false;
			boolean firstcomma = false;
			for (int k=0; k< counter; k++){
				if (taskList[k].getState()==1){
					if (!firstcomma){
						result = result +" " +taskList[k].getID();
						firstcomma = true;
					}
					else {
						result = result +", " +taskList[k].getID();
					}
					taskList[k].setState(0);
					print = true;
				}
			}
			if (print){
				System.out.println("Finished tasks: " +" " +result +" ");
				result ="";
			}
			
		}
		
		
		

		
	}
	


}