import java.util.Scanner;

public class ScriptBS {

	public static void main(String[] args) {	
		ScriptBS one = new ScriptBS();
		one.launch();
	}	
	
	public void launch (){
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
		Exer4 test = new Exer4();
		//int output [] = test.mergeSort(input);
		//for (i=0;i<output.length;i++){
			//System.out.print(output[i]+" ");
		//}
		
		System.out.println();
		System.out.println("Please enter number that you want to find out if in list");
		int number = in.nextInt();
		System.out.println(test.binarySearch(input,number));
		
	}
	
}