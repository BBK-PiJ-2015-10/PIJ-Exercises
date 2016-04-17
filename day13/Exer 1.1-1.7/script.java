public class script {

       public static void main ( String [] args) {
		   
	   script first = new script(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
		
	   LibraryImpl L1 = new LibraryImpl("British Library"); 
	   UserImpl U1 = new UserImpl("Ale");
	   UserImpl U2 = new UserImpl("Robert");
	   UserImpl U3 = new UserImpl("Tonto");
	   
	   U1.register(L1);
	   U2.register(L1);
	   U3.register(L1);
	   
	   //This is to see the library ID of each user from the user class
	   
	   System.out.println("This is to see the library ID from the user class");
	   System.out.println(U1.getLibraryID());
	   System.out.println(U2.getLibraryID());
	   System.out.println(U3.getLibraryID());
	   System.out.println();
	   
	   
	   
	   
	   
	   //System.out.println(U1.getLibraryID());
	  
	   //System.out.println(U1.getLibraryID());
	  
	   //System.out.println(U1.getLibraryID());
	   //U1.register(L1);
	   //System.out.println(U1.getLibraryID());
	   //System.out.println(L1.isRegistered(U1.getName()));
	   //System.out.println(L1.isRegistered("Domingo"));
	   //System.out.println(L1.isRegistered(U1.getName()));
	   //System.out.println(L1.getexistingID("Ale",2));
	   //System.out.println(U1.getLibraryID());
	   //System.out.println(U2.getLibraryID());
	   //System.out.println(U3.getLibraryID());
	   //System.out.println(U1.getLibraryID());
	   
	   //System.out.println(L1.getID("Ale"));
	   //System.out.println(L1.getID("Robert"));
	   //System.out.println(L1.getID("Tonto"));
	   //System.out.println(S1.getID("Antonio"));
	   //System.out.println(S1.getID("Tonto"));
	   
	   //System.out.println(S1.isRegistered("Ale"));
	    //System.out.println(S1.isRegistered("Bibio"));
	   
	   //System.out.println(S1.getexistingID("Ale",3));
	   //S1.getID("Tonto");
	   //S1.getID("Tonto");
	   
	   
	   }
	   
}