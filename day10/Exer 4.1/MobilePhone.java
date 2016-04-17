public class MobilePhone extends OldPhone {

      public void ringAlarm (String time) {

    	  System.out.println("The alarm is now ringing at " +time );
		   
	  }

	  private void playGame (String game) {
		  
		  System.out.println("We are now playing " +game);
		  
	  }
	  
	  public void printlastnumbers () {
		  
		  System.out.println("The last 10 numbers called were");
		  
	  }
	  
	  public MobilePhone (String brand){
		  super(brand);
	  }
	  
}