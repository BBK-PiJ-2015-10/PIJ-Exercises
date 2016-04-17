import java.util.Scanner;
public class Matrixchecker {
   
     public static void main (String[] args)
	 {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println ("Please enter the # values of your first array");
		 int x1=in.nextInt();
		 
//This is to capture array source
		 
		 int[] srcArray;
		 srcArray = new int[x1];
		 int count1=0;
		 for (count1=0;count1<=(x1-1);count1++) {
			  System.out.println ("Please enter the value of element #" +(count1+1));
			  srcArray[count1]=in.nextInt();			
		 }
	 System.out.println (srcArray[0]);
			
	 }
	 
// The below method is to test if the array source is Symmetrical or not
	 
public static String Symmetrical(int [] array1){
		int lens =array1.length;
		if (lens<=1) {
			return System.out.println ("It is symmetrical");		
		}
		else {
			int first = array1[0];
			int last = array1[lens-1];
			   if (first == last ) {
				   int [] array2;
				   result = new int [lens-2];
				   int count = 0;
				   for (count=0;count<lens-2;count++) {
					   result[count]=array1[count+1];
				   }
				   return Symmetrical(array2);
			   }
			   else {
				   return System.out.println ("It is not symmetrical");
			   }
		}
		
	
	 
}