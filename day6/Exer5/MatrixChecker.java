import java.util.Scanner;
public class MatrixChecker {
		
     public static int[] Matrixsing () {
		 
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the # of elements in the array");
		int size1=in.nextInt();
		int [] MatrixSrc;
		MatrixSrc = new int [size1];
		int count = 0;
		   for (count=0;count<=size1-1;count++) {
			   System.out.println("Please enter a number");
			   MatrixSrc[count]= 1;
			   //MatrixSrc[count]= in.nextInt();
		   }
		return  MatrixSrc;
	 }
	 
	 public static int[][]   Matrix (int x, int y) { 
			 int[][] matrixA;
			 matrixA = new int [x][y];
			 int count1=0;
			 int count2=0;
			 for (count1=0;count1<=x-1;count1++) {
				 for (count2=0;count2<=y-1;count2++) {
					 matrixA[count1][count2]=1;	 
				 }
			 }
             return matrixA;	
	 }  			 
	 
	 
}