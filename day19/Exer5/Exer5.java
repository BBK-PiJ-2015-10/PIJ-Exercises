import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Exer5 {
	
	private List<String> inputlist;
	
	public static void print (List printlist){
		System.out.println();
		System.out.println("The elements of the output list are");
		for (int i=0;i<printlist.size();i++){
			System.out.println(printlist.get(i));
		}	
	}

	public static void main (String [] args) {
		
		Exer5 script = new Exer5();
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
		
		List<String> output1 = StringUtils.allMatches(inputlist,
			s1 -> s1.length()>6 );
		Exer5.print(output1);	

		List<String> output2 = StringUtils.allMatches(inputlist,
			s1 -> s1.contains("y") );
		Exer5.print(output2);
		
		List<String> output3 = StringUtils.allMatches(inputlist,
			s1 -> (s1.length() % 2 == 0) );
		Exer5.print(output3);

		
			
	}

}