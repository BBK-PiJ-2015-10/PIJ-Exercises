import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Exer8 {
	
	private List<String> inputlist;
	
	public static void print (List printlist){
		System.out.println();
		System.out.println("The elements of the output list are");
		for (int i=0;i<printlist.size();i++){
			System.out.println(printlist.get(i));
		}	
	}

	public static void main (String [] args) {
		
		Exer8 script = new Exer8();
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
		
		List<String> output4 = ElementtransformedList.transformedList(inputlist, s -> s.replace("i","eye") );
		Exer8.print(output4);
		
		List<String> output5 = ElementtransformedList.transformedList(inputlist, String:: toUpperCase);
		Exer8.print(output5);
		
			
	}

}