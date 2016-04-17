import java.util.Scanner;
public class Patient {
    
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness){
		this.name=name;
		this.age=age;
		this.illness=illness;
		this.nextPatient=null;
	}
	
	public void addPatient (Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;	
		} else {
			this.nextPatient.addPatient(newPatient);
		}	
	}
	
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient ==  null ){
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}	
	
	public Patient getNextPatient()
	{
		return this.nextPatient;
	}
	
	//public Patient getPatient() {
		//return this.nextPatient;
	//}
		
	public String getname()
	{
		return this.name;
	}	
		
		
	public void output () {
		System.out.println (this.name);
		System.out.println (this.age);
		System.out.println (this.illness);
			
	}
	

}