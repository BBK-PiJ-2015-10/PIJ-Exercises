public class ScriptTester {

	private String fullstring = "There is something here";
	
	private String nullstring = null;

	public static void main ( String [] args) {
		
		ScriptTester script =  new ScriptTester();
		script.launch();
	}

	public void launch (){
		
		Tester first = new Tester();
	    first.testNull(nullstring);
		
	}
}