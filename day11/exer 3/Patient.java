import java.util.Scanner;
public class Patient {
    
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient priorPatient;
	
	public Patient(String name, int age, String illness){
		this.name=name;
		this.age=age;
		this.illness=illness;
		this.nextPatient=null;
		this.priorPatient=null;
	}
	
	public void addPatient (Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
            this.nextPatient.priorPatient = this;			
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient ==  null ){
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			if (this.nextPatient.nextPatient == null ) {
				this.nextPatient = nextPatient.nextPatient;
			}
			else {
			this.nextPatient = nextPatient.nextPatient;
			this.nextPatient.priorPatient = this;
			}
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}	
	
	public Patient getNextPatient()
	{
		return this.nextPatient;
	}
	
	public Patient getPriorPatient() {
		return this.priorPatient;
	}
	
    public Patient resetPriorPatient(){
		return this.priorPatient = null;
	}

	
	public String getname()
	{
		return this.name;
	}	
		
		
	public void output () {
		System.out.print ("Name:  ");
		System.out.print (this.name);
		System.out.print (" Age: ");
		System.out.print (this.age);
		System.out.print (" Illness; ");
		System.out.println (this.illness);
			
	}
	

}