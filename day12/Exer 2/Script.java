public class Script {

     public static void main ( String [] args) {
		Script today = new Script();
		today.launch();
	}
	
	public void launch (){
		
		Person myself = new Person();
		
		
		String myname = "Tom  Lond";
		//tomorrow.getInitials(myname);
		String ini = myself.getInitials(myname);
		System.out.println(ini);
		
	}

}