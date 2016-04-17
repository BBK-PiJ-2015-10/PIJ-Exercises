public class SuperMarketScript {

    public static void main ( String [] args) {
		
		SuperMarketScript script = new SuperMarketScript();
		script.launch(); 
	}

   public void launch () {
	   
	   PersonQueue firstQueue = new SuperMarket();
	   Person person1 = new Person ("Ralph",20);
	   firstQueue.insert(person1);
	   Person person2 = new Person ("John",23);
	   firstQueue.insert(person2);
	   Person person3 = new Person ("Marck",29);
	   firstQueue.insert(person3);
	   
	   firstQueue.retrieve();
	   firstQueue.retrieve();
	      
   }

}