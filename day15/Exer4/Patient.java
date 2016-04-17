public class Patient {

	private String name;
	
	private int birthyear;
	
	Patient (String name, int birthyear) {
		this.name = name;		
		testAge(birthyear);
		this.birthyear = birthyear;
	}
	
	public void testAge(int birthyear){
		int age = 2015 - birthyear;
			if (age>130 || age < 0){
				throw new IllegalArgumentException();
			}
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getBirthyear(){
		return this.birthyear;
	}
	
}