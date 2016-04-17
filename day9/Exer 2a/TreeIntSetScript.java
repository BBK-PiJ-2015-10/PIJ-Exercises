public class TreeIntSetScript {

    public static void main ( String[] args ) {
		
		TreeIntSetScript script = new TreeIntSetScript();
		script.launch();
		
	}

    public void launch () {
		
		IntSortedList first = new TreeIntSet();
		first.add(5);
		first.add(25);
		System.out.println(first.contains(5));
		System.out.println(first.toString());
		System.out.println(first.containsVerbose(5));
		
			
	}
	
   
	
	
}