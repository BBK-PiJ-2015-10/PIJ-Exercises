import java.util.*;

public class Exer3 {
	 
	 public List<Integer> hailstone (int input, List<Integer> list){
		if (list == null){
			list = new LinkedList<>();
		}
        list.add(input);

		if (input != 1) {
			if (input % 2 == 0){
			     int temp = input / 2;
				 hailstone(temp, list);
		    }
			else {
				int temp = (3*input) + 1;
			    hailstone(temp, list);
			}
		}
		return list;	
		
    }

}