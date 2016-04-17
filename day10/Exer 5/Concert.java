public class Concert {

   public static void main ( String [] args) {
		
	   Concert first = new Concert();
	   first.launch(); 
	}

   public void launch () {
	   
	   Guitar one = new Guitar();
	   one.play("Slow music");
	   one.burn("At 500 degrees");
	   
   }
}