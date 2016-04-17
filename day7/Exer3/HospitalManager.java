public class HospitalManager {
	
	private Patient patientListStart = null;

	public static void main (String[] args) {
		
		HospitalManager hm = new HospitalManager();
		hm.launch();
				
	}
	
	private void printlist (Patient p) {
		if (p == null) {
			return;
		}
		if (p.getNextPatient() == null) {
			p.output();	
		} 
		else {
		p.output();
		printlist(p.getNextPatient());
		}
		}
			
			
	public void print() {
		printlist(this.patientListStart);
	}
	
	public void deleteR (Patient patient, Patient liststart){
		if ((patient.getNextPatient()).equals(liststart.getNextPatient())) {
			liststart = patient.getNextPatient();
		}
		else {
			patientListStart.deletePatient(patient);
	    }
	}
	
	private void launch () {
		
		Patient firstPatient= new Patient("John",1,"Tuberculosis");
		patientListStart = firstPatient;
		Patient secondPatient = new Patient ("Mary",2,"nothing");
		patientListStart.addPatient(secondPatient); 
		Patient thirdPatient = new Patient ("Ralp",3,"doing great");
		patientListStart.addPatient(thirdPatient);
		Patient fourthPatient = new Patient ("Leon",4,"doing great");
		patientListStart.addPatient(fourthPatient);
		Patient fifthPatient = new Patient ("Ricardo",5,"doing great");
		patientListStart.addPatient(fifthPatient);
		Patient sixthPatient = new Patient ("Diego",6,"doing great");
		patientListStart.addPatient(sixthPatient);
		
		
		print();
		System.out.println("--------");
		
		//patientListStart=firstPatient.getNextPatient();
		
		deleteR (secondPatient, patientListStart);
		
		print();
		

		
		/*while () {
			name
			age
			illness
			new Patient(...)
			add to list
			
		}*/
				
	}



}