public class PhoneLauncher {

    public static void main ( String [] args ) {
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
		
	}
	
	public void launch() {
		
		SmartPhone one = new SmartPhone();
		
		one.call("07818098070");
		one.call("00018098070");
		//one.ringAlarm("6:30 a.m.");
		//one.playGame(" Bond ");
		//one.printlastnumbers();
	    //one.findposition();
		//one.browseWeb("Moodle");
		
	}

}