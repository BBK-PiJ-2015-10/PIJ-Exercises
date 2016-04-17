import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Exer3 {

	public static void main (String [] args) {
		
		Exer3 script = new Exer3();
		script.launch();
		
	}
	
	public void launch (){
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Please enter a first string");
		String str1 = in.next();
		
		System.out.println("Please enter a second string");
		String str2 = in.next();
		
		System.out.println("Output based on string length");
		String result1 = StringUtils.betterString(str1, str2,  
			(s1,s2) -> s1.length() > s2.length());
		System.out.println(result1);			
		
		System.out.println("Output based on returning the first always");
		String result2 = StringUtils.betterString(str1, str2,  
			(s1,s2) -> true);
		System.out.println(result2);	
		
		
		
		
		
		
				
	}

}