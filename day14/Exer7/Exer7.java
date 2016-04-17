import java.util.*;

public class Exer7 {

	public List<Integer> quickSort (List<Integer> input){
		int len = input.size();
		if (len == 1 || len == 0){
			return input;
		}
		int pivot = input.get(0);
		List<Integer> listA = new LinkedList<>();
		List<Integer> listB = new LinkedList<>();
		
		for (int i=1; i < len;i++){
			if (input.get(i)<pivot) {
				listA.add(input.get(i));
			}
			else {
				listB.add(input.get(i));
			}
		}
		listA = quickSort(listA);
		listB = quickSort(listB);
		return integrate(listA, listB, pivot);
	}
	
	public List<Integer> integrate (List<Integer> inputA, List<Integer> inputB, int pivot){
		List<Integer> listOutput = new LinkedList<>();
		if (inputA.size() != 0){
			for (int i=0; i < inputA.size();i++){
				listOutput.add(inputA.get(i));
			}
		}
		listOutput.add(pivot);
		if (inputB.size() != 0){
			for (int i=0; i < inputB.size();i++){
				listOutput.add(inputB.get(i));
			}
		}
		return listOutput;
	}
	
}