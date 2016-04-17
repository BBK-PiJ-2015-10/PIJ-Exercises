import java.io.*;
import java.util.*;

public class Copier {

	public void copyfile (){
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the name of the source file");
		String address1 = "\\Users\\YasserAlejandro\\PIJ\\Day-16\\Exer4\\"+input.next();
		File source = new File(address1);
		if (!source.exists()) {
			System.out.println("The source file doesn't exist");
		}
		
		System.out.println("Please enter the name of the destination file");
		String address2 = "\\Users\\YasserAlejandro\\PIJ\\Day-16\\Exer4\\"+input.next();
		File destination = new File(address2);
		if (!destination.exists()){
			System.out.println("The destination file doesn't exist");
		}
		
		//The out.println() method is to terminate the line so the next like being read goes into the next line.
		
		if (source.exists() & destination.exists() ){
			System.out.println("Enter 1 if you wish to overwrite file, or any other number if otherwise");	
			int trigger = input.nextInt();
			if (trigger == 1){
				try (BufferedReader in = new BufferedReader(new FileReader(source));
				     PrintWriter out = new PrintWriter(destination)) {
					 String line;
					 while ((line = in.readLine()) != null) {
					 out.write(line);
					 out.println();
				
					 }
				}	
				catch (IOException ex) {
				     ex.printStackTrace();
				}	
			}			
		}
		
		
	}

}