import java.util.Scanner;

public class ScriptMS2 {

	public static void main(String[] args) {
		
		int length_of_array;
		System.out.println("Please enter the size of your array");
		Scanner in = new Scanner (System.in);
		length_of_array = in.nextInt();
		int input [] = new int [length_of_array],i;
		for (i=0;i<length_of_array;i++){
			input[i]=(int)(Math.random()*100);
			System.out.print(input[i]+" ");
		}
		System.out.println();
		Exer6 test = new Exer6();
		int output [] = test.mergeSort(input);
		for (i=0;i<output.length;i++){
			System.out.print(output[i]+" ");
		}	
		
	}

}