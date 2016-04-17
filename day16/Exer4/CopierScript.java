public class CopierScript {

	public static void main (String [] args ) {
		
		CopierScript script = new CopierScript();
		script.launch();
		
	}

	public void launch(){
		
		Copier firstcopy = new Copier();
		firstcopy.copyfile();
		
		
	}

}