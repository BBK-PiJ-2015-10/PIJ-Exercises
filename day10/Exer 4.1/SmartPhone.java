public class SmartPhone extends MobilePhone {

    public void browseWeb(String website ) {
		
		System.out.println("We are now surfing on " +website);
		
	}

	public double findposition() {
		return 10.25;
	}
	
    @Override
	public void call (String number){
		if (number.substring(0,2).equals("00" )) {
		    System.out.println("Calling number via the internet " +number );
	    }
		else {
		    super.call(number);
		}
	}
	
	public SmartPhone (String brand){
		  super(brand);
	  }
	
	
	//@Override
	public void playGame (String game) {
	       
		   System.out.println("We are now playing " +game);
		   
		   //super.playGame(game);	   
		   
	}
	
	
	
}