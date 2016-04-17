public class HospitalManager {
	
	private Patient patientListStart = null;

    
	public static void main (String[] args) {
		
		HospitalManager hm = new HospitalManager();
		hm.launch();
		
		
	}
	
	private void launch () {
		
		Patient firstPatient= new Patient("John",33,"Tuberculosis");
		patientListStart = firstPatient;
		
		
	}








}