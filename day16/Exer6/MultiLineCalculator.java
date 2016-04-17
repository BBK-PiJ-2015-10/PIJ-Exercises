
import java.io.*;
import java.util.*;


public class MultiLineCalculator {

	private List<String> filelines;
	
	private List<Double> fileresult;
	
	public void readnumbers(){
		
		filelines = new LinkedList<String>();
		fileresult = new LinkedList<Double>();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the name you are looking for");
		String name = input.next();
		String address = "\\Users\\YasserAlejandro\\PIJ\\Day-16\\Exer6\\"+name;
		File sourcefile = new File(address);
		if (sourcefile.exists()) {
			try (BufferedReader in = new BufferedReader(new FileReader(sourcefile))){
				String line;
				String str;
				int value;
				while ((line = in.readLine())!= null){
					filelines.add(line);
				}	
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
			for (int k=0 ; k < filelines.size();k++){
				String str2 = "";
				double cumulative = 0;
				int count = 0;
				for (int i=0; i< filelines.get(k).length() ;i++) {
					char currentchar = filelines.get(k).charAt(i);
					if (currentchar != ',' ){
						str2 = str2 + currentchar;
						count++;
						if(i == filelines.get(k).length()-1){
							int number2 = Integer.parseInt(str2);
							cumulative = cumulative + number2;
							str2 = "";
						}
					}
					else {
						int number2 = Integer.parseInt(str2);
						cumulative = cumulative + number2;
						str2 = "";
					}	  
				}
				fileresult.add(cumulative/count);
			}
			
			double cumulative = 0;
			for (int i=0; i <fileresult.size();i++){
				System.out.println("The average of line # " +(i+1) +" is " +fileresult.get(i));
				cumulative = cumulative + fileresult.get(i);
			}
			System.out.println("The average of all the lines is " +(cumulative/fileresult.size()) );
		}
		
		else {
			System.out.println("Source file doesn't exist");
		}
		      
	}

}