import java.util.*;

public class Exer3d{
	
	public double mean(){
		int listsize = getSize();
		List<Integer> list1 = new LinkedList<>();	
		for (int i=0;i<listsize;i++){
			list1.add(getNumberV2());	
		}
		double cumulative =0;
		for (int i=0;i<list1.size();i++){
			cumulative = cumulative + list1.get(i);
		}
		double result = cumulative/list1.size();
		return result;
	}

	
	public int getNumber(){
		int result =0;
		boolean validNumber = false;
		while (!validNumber){
			try{
				System.out.println("Please enter number");
				String str = System.console().readLine();			
				int input = Integer.parseInt(str);
				validNumber = true;
				result = input;
			} catch (NumberFormatException ex){
				System.out.println("You need to re enter number");
				System.out.println();
			}
		}
		return result;
	}
	
	public int getNumberV2(){
		while (true){
			try{
				System.out.println("Please enter number");		
				return Integer.parseInt(System.console().readLine());
			}   
			catch (NumberFormatException ex){
				System.out.println("You need to re enter number");
				System.out.println();
			}
		}
	}
	
	public int getSize(){
		while (true){
			try{
				System.out.println("Please enter how many numbers you want to enter");		
				return Integer.parseInt(System.console().readLine());
			}   
			catch (NumberFormatException ex){
				System.out.println("Wrong input category");
				System.out.println();
			}
		}
	} 
	
}