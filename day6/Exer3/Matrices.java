public class Matrices {
    	  
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
   
   public static int[][]   Coordinates (int x, int y, int val, int [][] src){
			 int rows = src.length-1;
			 int cols = src[0].length-1;
			 if (x>rows) {
				 System.out.print ("The row coordinate exceeds coordinates of matrix");
				 System.out.println (" please reconsider selection of row");
			     return src;
			 }
			 if (y>cols) {
				 System.out.print ("The row coordinate exceeds coordinates of matrix");
				 System.out.println (" please reconsider selection of column");
			     return src;
			 }
			 src[x][y] = val; 
			 return src;
   }
   
   public static int[][] setRow (int x, int list[], int[][] src )  {
	        int rows = src.length-1;
			int cols = src[0].length-1;
			int lcols = list.length-1;
	        if ( x > rows) {
				 System.out.print ("The row coordinate exceeds coordinates of matrix");
				 System.out.println (" please reconsider selection of row");
			     return src; 
			}
			if (cols != lcols) {
				 System.out.print ("The string being entered is not equal in size to");
				 System.out.println (" the matrix columns, please re-enter");
			     return src; 
			}
			int count=0;
			for (count=0;count<=cols;count++) {
				 src [x][count]= list [count];
			}
            return src;			
   }
   
    public static int[][] setCol (int x, int list[], int[][] src )  {
	        int rows = src.length-1;
			int cols = src[0].length-1;
			int lrows = list.length-1;
	        if ( x > cols) {
				 System.out.print ("The row coordinate exceeds coordinates of matrix");
				 System.out.println (" please reconsider selection of column");
			     return src; 
			}
			if (rows != lrows) {
				 System.out.print ("The string being entered is not equal in size to");
				 System.out.println (" the matrix rows, please re-enter");
			     return src; 
			}
			int count=0;
			for (count=0;count<=rows;count++) {
				 src [count][x]= list [count];
			}
            return src;			
   }
      
   public static String toS (int[][] src) {
	       String result = "[";
		   int rows = src.length-1;
		   int cols = src[0].length-1;
		   int count1=0;
		   int count2=0;
		   for (count1=0;count1<=rows;count1++) {
				 for (count2=0;count2<=cols;count2++) {
					 result += src[count1][count2];
					 if (count2!=cols) {
						 result += ",";
					 }
				 }
		         if (count1!=rows) {
		            result +=";";
                 }					
           }
           result += "]";	
           return result;   		   
   }
    
   
}