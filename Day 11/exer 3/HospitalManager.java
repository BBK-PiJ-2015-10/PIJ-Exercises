public class HospitalManager {

	private Patient head = null;
	
	private int listsize = 0;
	
	public void registerPatient(Patient patient){
		if (head == null) {
			head = patient;
		}
		else {
			head.addPatient(patient);
		}
		listsize ++;
	}
	
	public int getListSize(){
		return this.listsize;
	}
	
	public Patient getLastPatient(){
		if (head.nextPatient == null ) {
			return head;
		} 
		else {
			return head.nextPatient.getLastPatient();
		}
	}
	
	
	
	
	

}