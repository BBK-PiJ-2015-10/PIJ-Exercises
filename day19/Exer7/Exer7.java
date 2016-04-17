import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Exer7 {
	
	private List<String> inputlist;
	
	public static void print (List printlist){
		System.out.println();
		System.out.println("The elements of the output list are");
		for (int i=0;i<printlist.size();i++){
			System.out.println(printlist.get(i));
		}	
	}

	public static void main (String [] args) {
		
		Exer7 script = new Exer7();
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
		
		List<String> output4 = StringtransformedList.transformedList(inputlist, s -> s.replace("i","eye") );
		Exer7.print(output4);
		
		List<String> output5 = StringtransformedList.transformedList(inputlist, String:: toUpperCase);
		Exer7.print(output5);
		
			
	}

}