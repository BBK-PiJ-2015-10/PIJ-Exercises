public class FileListingScript {

	public static void main (String [] args) {
		
		FileListingScript script = new FileListingScript();
		script.launch();
		
	}

	public void launch(){
		
		FileListingv2 list = new FileListingv2();
		list.listFiles();
		
	}
	
}