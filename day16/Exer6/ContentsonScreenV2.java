 import java.util.Scanner;
 import java.io.*;
 import java.util.*;
 
public class ContentsonScreenV2 {

	public void showcontent(){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the name you are looking for");
		String name = input.next();
		String address = "\\Users\\YasserAlejandro\\PIJ\\Day-16\\Exer6\\"+name;
		File file = new File(address);
		if (file.exists()) {
			try (BufferedReader in = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = in.readLine()) != null) {
				System.out.println(line);	
				}				
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	

}
 