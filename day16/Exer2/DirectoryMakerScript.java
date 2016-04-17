
public class DirectoryMakerScript {

	public static void main (String [] args) {
		
		DirectoryMakerScript script = new DirectoryMakerScript();
		script.launch();
		
	}
	
	public void launch(){
		
		DirectoryMaker newDirectory = new DirectoryMaker();
		newDirectory.makedirectory();
		
		
	}

}