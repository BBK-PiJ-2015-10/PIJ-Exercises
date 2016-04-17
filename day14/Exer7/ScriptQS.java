import java.util.Scanner;
import java.util.*;


public class ScriptQS {

	public static void main(String[] args) {	
		ScriptQS one = new ScriptQS();
		one.launch();
	}	
	
	public void launch (){
		List<Integer> input = new LinkedList<>();
		System.out.println("Please enter the size of your list");
		Scanner in = new Scanner (System.in);
		int size = in.nextInt();
		for (int i=0;i<size;i++){
			input.add((int)(Math.random()*100));
		}
		System.out.println();
		for (int i=0;i<size;i++){
			System.out.print(input.get(i)+" ");
		}
		
		Exer7 test = new Exer7();
		System.out.println();
		List<Integer> result = test.quickSort(input);
		for (int i=0;i<size;i++){
			System.out.print(result.get(i)+" ");
		}	
	}
	
}