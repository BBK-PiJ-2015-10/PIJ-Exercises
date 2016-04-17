import java.util.Scanner;
public class Spy {
    
	private String ID;
	public static int spyCount =0;
	
	public Spy (String ID) {
		this.ID = ID;
		System.out.println(this.ID);
		spyCount++;
		System.out.println("We have " +spyCount +" spies at the moment");
	}
	private static String createSpyID () {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an ID");
		String ID = in.nextLine();
		return ID;
	}
	
	public void die (){
		//this.ID = ID;
		System.out.print ("Spy " +ID +" has been detected and eliminated. ");
		spyCount--;
		System.out.println("We have " +spyCount +" left");
	}
	
	public static void main (String[] args){
		
		Spy spy1 = new Spy (createSpyID());
		Spy spy2 = new Spy(createSpyID());
		Spy spy3 = new Spy (createSpyID());
		
		System.out.println(spy1.ID);
		
		spy2.die();
		//spy3.die();
	
	}
	
/*	private void launch() {
				
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an ID");
		String ID = in.nextLine();
		Spy spy2 = new Spy (ID);
		System.out.println("Please enter an ID");
		ID = in.nextLine();
		Spy spy3 = new Spy (ID);
		//System.out.println("Please enter the ID of the spy eliminated");
		//ID = in.nextLine();
		//Spy.die(ID);
		
		
		
	}*/

}