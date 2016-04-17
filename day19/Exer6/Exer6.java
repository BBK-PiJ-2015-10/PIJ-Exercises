import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Exer6 {
	
	private List<String> inputlist;
	
	public static void print (List printlist){
		System.out.println();
		System.out.println("The elements of the output list are");
		for (int i=0;i<printlist.size();i++){
			System.out.println(printlist.get(i));
		}	
	}

	public static void main (String [] args) {
		
		Exer6 script = new Exer6();
		script.launch();
		
	}
	
	public void launch (){
		
		Scanner in = new Scanner(System.in); 
		inputlist = new LinkedList<String>();
		System.out.println("Please enter the size of your list");
		int dimension = in.nextInt();
		for (int i=0;i<dimension;i++){
			System.out.println("Please enter a string value");
			String str = in.next();
			inputlist.add(str);
		}
		
		List<String> output1 = ElementUtils.allMatches(inputlist,
			s1 -> s1.length()>6 );
		Exer6.print(output1);	

		List<String> output2 = ElementUtils.allMatches(inputlist,
			s1 -> s1.contains("y") );
		Exer6.print(output2);
		
		List<String> output3 = ElementUtils.allMatches(inputlist,
			s1 -> (s1.length() % 2 == 0) );
		Exer6.print(output3);

		
			
	}

}