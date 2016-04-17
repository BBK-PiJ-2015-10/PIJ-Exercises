import java.util.*;

public class Exer4 {

	public String binarySearch(int[] listA, int n){
		
		int[] listB = mergeSort(listA);
		int len = listB.length;
		int mid = (int) Math.floor(listB.length/2);
		
		if (listB[mid] == n){
			String result = "The value is in the list";
			return result;
		}
		else {
			if (len == 1){
				String result = "The value is not in the list";
				return result;
			}
			else {	
				if (listB[mid] > n){
					int[] listC = new int [mid];
					for (int i=0; i<mid; i++){
						listC[i] =listB[i];
					}
					return binarySearch(listC, n);
				}
			   else {
					int[] listC = new int [mid];
					for (int i=0; i<mid; i++){
						listC[i] =listB[i+len-mid];
					}
					return binarySearch(listC, n);					
			   }
			}
	    }
	}
	
	public int [] mergeSort(int [] A){
		if (A.length == 1) {
			return A;	
		}
		else {
			int n = (int) Math.floor(A.length/2);
			int[] B = new int [n];
			int[] C = new int [A.length-n];
			for (int i=0; i<A.length; i++){
				if (i < n){
					B [i] = A [i];
				}
				else {
					C [i-n] = A [i];
				}			
			}
			B = mergeSort(B);
			C = mergeSort(C);
			A = merge(B,C);
			return A;
		}
	}
	
	public int[] merge (int[] A, int[] B){
		int[] C = new int [A.length + B.length];
		int i;
		int a=0;
		int b=0;
		for (i=0;i<A.length+B.length;i++){
			if (a == A.length){
				C[i]=B[b];
				++b;
			}
			else {
				if (b == B.length) {
					C[i]=A[a];
					++a;
				}
				else {
					if (A[a]>B[b]){
						C[i]=B[b];
						++b;
					}
					else {
						C[i]=A[a];
					    ++a;
					}
				}
			}
		}
		return C;
	}
	

}