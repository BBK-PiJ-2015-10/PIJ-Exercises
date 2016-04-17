public class ExceptionCreaterAndThrower{

	public static void main( String[] args){
		
		try {
			ExceptionCreaterAndThrower myObject = new ExceptionCreaterAndThrower();
			myObject.launch();
			
		} 
		catch (MyCheckedException ex) {
		    System.out.println("Error type 4");	
		}
	}
	
	public void launch() throws MyCheckedException, NullPointerException {
		try {
			
		}
		catch (NullPointerException ex) {
			System.out.println("Error type 3")
		}
	}
	
}