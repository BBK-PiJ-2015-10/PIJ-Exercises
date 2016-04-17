import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Exer1 {

	public static void main (String [] args) {
		
		Exer1 script = new Exer1();
		script.launch();
		
	}
	
	public void launch (){
		
		Scanner in = new Scanner(System.in); 
		
		List<String> list = new ArrayList<String>(5);
		
		for (int i=0; i<5;i++){
			System.out.println("Please enter a string");
			String str = in.next();
			list.add(str); 
		}
		
		System.out.println("Print Asc by based on Length ");
		
		Collections.sort(list,(String str1, String str2) -> 
			((Integer)str1.length()).compareTo((Integer)str2.length()));
		System.out.println(Arrays.asList(list));	
		
		System.out.println("Print Desc by based on Length ");
		Collections.sort(list,(String str1, String str2) -> 
			((Integer)str2.length()).compareTo((Integer)str1.length()));
		System.out.println(Arrays.asList(list));
		
		System.out.println("Print Asc by based on first letter ");
		Collections.sort(list,(String str1, String str2) -> 
			(str1.substring(0,1)).compareTo(str2.substring(0,1)));
		System.out.println(Arrays.asList(list));
		
		System.out.println("Print Asc by based on presence of e letter ");
		Collections.sort(list,(String str1, String str2) -> 
		{
			 int result =0;
			 if ( (str1.contains("e")) &&  (!str2.contains("e"))) {
				 result =-1;
			 } else if ( (!str1.contains("e")) &&  (str2.contains("e"))) {
				 result =1;
			 }
			 return result;
		}
		); 
		System.out.println(Arrays.asList(list));
		
				
	}

}