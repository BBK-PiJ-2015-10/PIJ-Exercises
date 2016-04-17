import java.util.concurrent.*;

public class ThreadPoolExecutor implements Executor {

	public void execute(Runnable input){
		Thread t = new Thread(input);
		t.start();
	}

}