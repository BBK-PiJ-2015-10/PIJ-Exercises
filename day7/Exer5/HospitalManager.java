public class HospitalManager {
	
	private Patient patientListStart = null;
	

	public static void main (String[] args) {
		
		HospitalManager hm = new HospitalManager();
		hm.launch();
				
	}
	
	private void printlistforward (Patient p) {
		if (p == null) {
			return;
		}
		if (p.getNextPatient() == null) {
			p.output();	
		} 
		else {
		p.output();
		printlistforward(p.getNextPatient());
		}
		}
			
    private void printlistback (Patient p) {
		if (p == null) {
			return;
		}
		if (p.getNextPatient() != null) {
			printlistback(p.getNextPatient());
		}
		else {
			while (p.getPriorPatient() != null) {
			p.output();
			p = p.getPriorPatient();
		    }
			p.output();
		}
	}
	
	public void print() {
		System.out.println("This is the list forward");
		printlistforward(this.patientListStart);
		System.out.println("---------------------------");
		System.out.println("This is the list backwards");
		printlistback(this.patientListStart);
	}
	
	private void clist (Patient patientListStart) {
		int result =1;
		while (patientListStart.getNextPatient() != null) {
			result = result +1;
			patientListStart= patientListStart.getNextPatient();
			}	
		System.out.println("The lenght of the queue is " +result +" patients"); 
	}
	
	public void deleteP (Patient patient, Patient patientListStart) {
		if (patientListStart == patient) {
	        patient.getNextPatient().resetPriorPatient();
			this.patientListStart = patient.getNextPatient();
			
		}
		else {
			this.patientListStart.deletePatient(patient);
		}
	}
	
		
	
	private void launch () {
		
		Patient firstPatient= new Patient("John",1,"Tuberculosis");
		patientListStart = firstPatient;
		Patient secondPatient = new Patient ("Mary",2,"nothing");
		patientListStart.addPatient(secondPatient); 
		Patient thirdPatient = new Patient ("Ralp",3,"chilling");
		patientListStart.addPatient(thirdPatient);
		Patient fourthPatient = new Patient ("Leon",4,"surfing");
		patientListStart.addPatient(fourthPatient);
		Patient fifthPatient = new Patient ("Ricardo",5,"headache");
		patientListStart.addPatient(fifthPatient);
		Patient sixthPatient = new Patient ("Diego",6,"muscle pain");
		patientListStart.addPatient(sixthPatient);
		
		
		print();
		clist(patientListStart);
		System.out.println("-----------------------------------");
			
		System.out.println("Now I am deleting the last patient");
		deleteP (sixthPatient, patientListStart);
		print();
		clist(patientListStart);
		System.out.println("-----------------------------------");
		
		
		System.out.println("Now I am deleting the first patient");
		deleteP (firstPatient, patientListStart);
		print();
		clist(patientListStart);
		System.out.println("-----------------------------------");
		
		
		System.out.println("Now I am deleting the 2nd Patient");
		deleteP (secondPatient, patientListStart);
		print();
		clist(patientListStart);
		System.out.println("-----------------------------------");
		
		
		
		System.out.println("Now I am adding another Patient");
		
		Patient seventhPatient = new Patient ("Armando",7,"broken heart");
		patientListStart.addPatient(seventhPatient);
		print();
		clist(patientListStart);
		System.out.println("-----------------------------------");
		
		System.out.println("I believe it works well");
		
		
		
		
		//printlistback(this.patientListStart);

		
		/*while () {
			name
			age
			illness
			new Patient(...)
			add to list
			
		}*/
				
	}



}