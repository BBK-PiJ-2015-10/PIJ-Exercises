/**
*  Implementation of interface PersonQueue using an array as support.
*/

public class SuperMarket1 implements PersonQueue {
  
    /*
    * The array contains the queue
    */

    private Person head;
		
	public void insert (Person newperson) {
		if (head == null) {
			head = newperson;
		}
		else {
			if (head.getage() <65 && newperson.getage() >=65){
			    Person oldhead = head;
			    head = newperson;
			    newperson.setnextperson(oldhead);
			    oldhead.setpriorperson(head);
			}
			else {
				if (head.getage() <18 && newperson.getage() >=18){
			       Person oldhead = head;
			       head = newperson;
			       newperson.setnextperson(oldhead);
			       oldhead.setpriorperson(head);		
			    }
			head.add(newperson);
		    }
		System.out.println(newperson + " has been added");
	    }	
	}
	
	public Person retrieve(){
		if (head == null) {
			return null;
		}
		else {
			Person temp = head;
			head = head.getnextperson();
			System.out.println(temp + " has been retrieved. ");
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