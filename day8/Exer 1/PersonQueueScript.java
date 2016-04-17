public class PersonQueueScript {

    public static void main ( String [] args) {
		
		PersonQueueScript script = new PersonQueueScript();
		script.launch(); 
	}

   public void launch () {
	   
	   PersonQueue firstQueue = new ArrayPersonQueue();
	   testQueue(firstQueue);
	   
   }

    private void testQueue (PersonQueue queue) {
		System.out.println("Testing the queue");
		
		Person person1 = new Person ("Ralph",20);
		//addPerson(person1, queue);
		Person person2 = new Person ("John",23);
		//addPerson(person2, queue);
		Person person3 = new Person ("Marck",29);
		//addPerson(person3, queue);
		//
		//queue.retrieve();
		
	}
		//print(queue.)
		
		
		//System.out.println(""+queue.getLength());
		
		//int m = firstQueue.queueArray.length;
		
	/*private void addPerson(Person personToAdd , PersonQueue queueToAddTo){
		queueToAddTo.insert(personToAdd);
		System.out.print(personToAdd);
	}*/
	

}