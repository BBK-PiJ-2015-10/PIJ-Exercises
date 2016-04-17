import java.util.Scanner;

public class Task implements Runnable {
	
	private int taskduration;
	
	private int taskID;
	
	private int state;
	
	public int getID(){
		return this.taskID;
	}
	
	public int getState(){
		return this.state;
	}
	
	public void setState(int state){
		this.state = state;
	}

	
	@Override
	public void run(){
			try {
				Thread.sleep(taskduration);
			}
			catch (InterruptedException ex1) {
			}
			this.state=1;
			System.out.println("This task is done " +taskID);
	}
	
	public Task (int duration, int taskID){ 
		this.taskduration = duration;
		this.taskID = taskID;
		this.state = 0;
	}
			
}