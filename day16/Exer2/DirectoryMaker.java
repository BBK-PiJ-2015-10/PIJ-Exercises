import java.util.Scanner;
import java.io.File;

public class DirectoryMaker {

	public void makedirectory(){
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter desired directory name");
		String name = in.next();
		String address = "\\Users\\YasserAlejandro\\PIJ\\Day-16\\Exer2\\"+name;
		
		try {
			File newdirectory = new File(address);
			newdirectory.mkdir();
		}
		catch (NullPointerException ex){
			System.out.println("Directory address is invalid");
		}
	}

}