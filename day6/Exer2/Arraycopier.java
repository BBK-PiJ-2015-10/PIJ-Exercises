import java.util.Scanner;
public class Arraycopier {
   
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

// This is to capture array destination
			
		 System.out.println ("Please enter the lenght of your second array");
		 int x2=in.nextInt();
		 int[] destArray;
		 destArray = new int[x2];
		 int count2=0;
		 for (count2=0;count2<=(x2-1);count2++) {
			  System.out.println ("Please enter the value of element #" +(count2+1));
			  destArray[count2]=in.nextInt();			
			}
		
		
		transfor(srcArray,destArray);
		
// This is the printing section		
		
		System.out.println ("The values of the new destination array are");
		int counter=0;
		for (counter=0;counter<=x2-1;counter++) {
			System.out.println (destArray[counter]);
		};
		    //System.out.println (destArray[0]);	
	 }
	 
	 
	 public static void transfor(int [] array1, int [] array2)
	 {
		 int lens1 =array1.length;
		 int lens2 =array2.length;
		 int c=0;
		 
//These are for arrays of same size or source arrays larger		 

		 if (lens1>=lens2) {
		     for (c=0;c<=lens2-1;c++) {
			     array2[c]=array1[c];
		     };	


			 
		 };
		 
// This is for arrays where the source is smaller than the destination
		 
		 if (lens1<lens2) {
		     for (c=0;c<=lens1-1;c++) {
			     array2[c]=array1[c];
		     };
			 for (c=lens1;c<=lens2-1;c++) {
				 array2[c]=0;
			 };
		 };
		 
	 }
	 
}