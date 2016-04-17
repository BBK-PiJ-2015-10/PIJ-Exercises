public class PhoneLauncher {

    public static void main ( String [] args ) {
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
		
	}
	
	public void launch() {
		
		MobilePhone myPhone = new SmartPhone("Galaxy");
		//MobilePhone myPhone = new SmartPhone("Galaxy");
		/*
		((SmartPhone)myPhone).browseWeb("Java wrappps. ");
		System.out.println(((SmartPhone)myPhone).findposition());
		myPhone.call("+6176423806");
		myPhone.ringAlarm("6:00 a.m.");
		myPhone.playGame("Stay alive in JAVA");
		myPhone.printlastnumbers();
		*/
		testPhone(myPhone);
		
		
	}
	
	public void testPhone(Phone input) {
		input.call("617-642-3806");
		
		// Even if myPhone is a MobilePhone, since the argument of this method was defined as a Phone. You need to cast
		// the input to a MobilePhone to use the MobilePhone methods.
		// Since you are pushing the MobilePhone thru this method that is defined as a Phone input, you are indirectly
		// upcasting it.
		((MobilePhone)input).playGame("Tennis");
		
	}
	

}


