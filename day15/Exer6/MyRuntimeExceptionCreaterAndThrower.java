public class MyRuntimeExceptionCreaterAndThrower{

	public static void main( String[] args){
		
		MyRuntimeExceptionCreaterAndThrower myObject = new MyRuntimeExceptionCreaterAndThrower();
		try {
			myObject.launch();
		}
		catch (MyRuntimeException ex2){
			System.out.println("Type 2 error");	
		}
				
	}
	
	public void launch() {
		
		try {
		System.out.println();
			//RuntimeException newException = new MyRuntimeException("Being thrown inside a try block");
			//throw newException;
		}
		catch (MyRuntimeException ex1){
		   System.out.println("Type 1 error");	
		}
		RuntimeException newException = new MyRuntimeException("Being thrown outside a try block");
		throw newException;
		
	}
	
}