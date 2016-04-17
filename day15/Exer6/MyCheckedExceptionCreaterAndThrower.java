public class MyCheckedExceptionCreaterAndThrower{

	public static void main( String[] args) {
		
		MyCheckedExceptionCreaterAndThrower myObject = new MyCheckedExceptionCreaterAndThrower();
		try {
			myObject.launch();
		}
		catch (MyCheckedException ex2){
			System.out.println("Type 2 error");	
		}
				
	}
	
	public void launch() throws MyCheckedException {
		
		try {
		System.out.println();
			MyCheckedException newException = new MyCheckedException("Being thrown inside a try block");
			throw newException;
		}
		catch (MyCheckedException ex1){
		   System.out.println("Type 1 error");	
		}
		MyCheckedException newException = new MyCheckedException("Being thrown outside a try block");
		throw newException;
		
	}
	
}