public class Exer6 {

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