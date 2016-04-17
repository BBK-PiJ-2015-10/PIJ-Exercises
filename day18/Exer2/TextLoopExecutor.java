import java.util.concurrent.*;

public class TextLoopExecutor implements Executor {

	public void execute(Runnable input){
		Thread t = new Thread(input);
		t.start();
	}

}