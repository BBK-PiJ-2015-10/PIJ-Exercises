import java.util.*;

public class PatientList {

	private List<Patient> list;
	
	public void addPatient(){
		String name = getName();
		boolean validyearinput = false;
		while (!validyearinput){
			try {
				int birthyear = getYear();
				Patient inputpatient = new Patient(name,birthyear);
				validyearinput = true;
				if (list == null){
					list = new LinkedList<>();
				}
				list.add(inputpatient);
			}
			catch (NumberFormatException ex) {
				System.out.println("The year enter was not a number");
			}
			catch (IllegalArgumentException ex) {
				System.out.println("The year enter is not valid. ");
			}
		}
		
	}
	
	public String getName(){
		System.out.println("Please enter patient's name");
		String name = System.console().readLine();
		return name;
	}
	
	public int getYear(){
		System.out.println("Please enter patient's birthyear");
		int birthyear = Integer.parseInt(System.console().readLine());
		return birthyear;
	}
	
	
	

}