public class ScriptC {
	
	public static void main ( String [] args) {
		   
	   ScriptC first = new ScriptC(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
	   
	   Comparator2 one = new Comparator2();
	   System.out.println(one.getMax(2.0,5.0));
	   System.out.println(one.getMax(2,5));
	   System.out.println(one.getMax("2","5"));
	   
	   }
}