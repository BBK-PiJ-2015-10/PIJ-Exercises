import java.util.concurrent.*;

public class UIExecutor implements Executor {

	public void execute(Runnable input){
		Thread t = new Thread(input);
		t.start();
	}

}