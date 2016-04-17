public class Exer1b {

     private int[] precalculated = null;
	 
	 private void initPrecalculatedArray (int size){
		 if (precalculated == null) {
			 precalculated = new int [size];
		 }
		 for (int i = 0; i < precalculated.length; i++){
			 precalculated[i] = -1;
		 }
		 precalculated[0] = 1;
		 precalculated[1] = 1;
	 }

	 public int fib (int n){
		 initPrecalculatedArray(n);
		 if (precalculated[n-1] != -1){
			 return precalculated[n-1];
		 }
		 else {
			 int result = fib (n-1) + fib (n-2);
			 precalculated [n-1] = result;
			 return precalculated [n-1];
		 }
	 }


}