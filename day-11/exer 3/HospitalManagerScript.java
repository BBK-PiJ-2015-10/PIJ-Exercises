public class HospitalManagerScript {

	public static void main (String [] args) {
			
		HospitalManagerScript script = new HospitalManagerScript();
		script.launch();	
	
	}

	public void launch(){
		
		Patient one = new Patient("Roberto",31,"Headache");
		Patient two = new Patient("Thomas",10,"Big belly");
		Patient three = new Patient("Carlo",2,"Nothing");
		
		HospitalManager UCL = new HospitalManager();
		
		UCL.registerPatient(one);
		UCL.registerPatient(two);
		UCL.registerPatient(three);
		
		
		
		
		
	}

}