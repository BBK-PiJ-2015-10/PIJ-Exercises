public class SuperMarketScript {

    public static void main ( String [] args) {
		
		SuperMarketScript script = new SuperMarketScript();
		script.launch(); 
	}

   public void launch () {
	   
	   PersonQueue firstQueue = new SuperMarket1();
	   Person person1 = new Person ("A",20);
	   firstQueue.insert(person1);
	   Person person2 = new Person ("B",22);
	   firstQueue.insert(person2);
	   Person person3 = new Person ("C",93);
	   firstQueue.insert(person3);
	   Person person4 = new Person ("D",94);
	   firstQueue.insert(person4);
	   Person person5 = new Person ("E",99);
	   firstQueue.insert(person5);
	   Person person6 = new Person ("F",80);
	   firstQueue.insert(person6);
	   Person person7 = new Person ("G",20);
	   firstQueue.insert(person7);
	   
	   //System.out.println(person4.getnextperson());
	   //System.out.println(person6.getnextperson());
	   
	   System.out.println("----------------------");
	   
	   firstQueue.retrieve();
	   firstQueue.retrieve();
	   firstQueue.retrieve();
	   firstQueue.retrieve();
	   
	   //System.out.println(person4.getnextperson());
	   //System.out.println(person6.getnextperson());
	   
	   
	   
	   
	   //System.out.println(person5.getpriorperson());
	      
   }

}