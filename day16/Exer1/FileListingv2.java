import java.io.File;
import java.util.*;

public class FileListingv2 {

	public void listFiles(){
		
		try {
			File file = new File (".");
			String [] fileList  = file.list();
			for (int i=0;i<fileList.length;i++){
				System.out.println(fileList[i]);
			}
		}
		catch (NullPointerException ex){
			System.out.println("The folder selected doesn't exist");
		}
	}
	
}