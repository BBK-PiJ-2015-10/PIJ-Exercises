/**
*  Implementation of interface PersonQueue using an array as support.
*/

public class SuperMarket implements PersonQueue {
  
    /*
    * The array contains the queue
    */

    private Person head;
		
	public void insert (Person person) {
		if (head == null) {
			head = person;
		}
		else {
			head.add(person);
		}
		System.out.println(person + " has been added");
	}	
	
	
	public Person retrieve(){
		if (head == null) {
			return null;
		}
		else {
			Person temp = head;
			head = head.getnextperson();
			System.out.println(temp + "has been retrieved. ");
			return temp;
		}
	}
	
	public void addPerson (Person p){
		insert(p);
	}
	
	public Person servePerson (){
		return retrieve();
	}

}