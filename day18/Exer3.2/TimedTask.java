
public class TimedTask implements Runnable {
	
	private int sleeptime;
	
	public TimedTask(int sleeptime){
		if (sleeptime < 1000){
			this.sleeptime = sleeptime;
		}
		else {
			this.sleeptime = 1000;
		}
	}
	
	public void run(){
		try {
			Thread.sleep(sleeptime);
		}
		catch (InterruptedException ex) {
			// do nothing
		}
	}
	

}