/**
*  Implementation of interface PersonQueue using an array as support.
*/

public class ArrayPersonQueue implements PersonQueue {
  
    /*
    * The array contains the queue
    */

    private Person [] queueArray;
	
	/*
	* The number of people in the queue
	*/
	
	private int size;
	
	/*
	* The number of positions available in the queue
	*/
	
	private static int INITIAL_QUEUE_CAPACITY = 5;
	
	public ArrayPersonQueue(){
		queueArray = new Person[INITIAL_QUEUE_CAPACITY];
		size = 0;
		}
		
	public void insert (Person person) {
		if (isAlmostFull()) {
			reserveMoreMemory();			
		}
		queueArray[size] = person;
		size++;
	}	
	
	/*public void retrieve() {
		//if(isEmpty()){
		//}
		Person result = queueArray[0];
		for (int i=0;i<size;i++) {
			queueArray[i]=queueArray[i+1];
		}
		size --;
		
	}*/
	
	public int getLength(){
		return this.queueArray.length;
	}
	
	public boolean isEmpty(){
		if (size == 0) {
		    return true;
		}	
		else {
		    return false;	
		}				
	}
	
	private boolean isAlmostFull () {
		if (queueArray.length - size < 1) {
			return true;
		}
		else {
		    return false;	
		}
	}
	
	private void reserveMoreMemory () {
		Person[]  biggerqueueArray = new Person[size*2];
		for (int i = 0; i < size ; i++) {
			biggerqueueArray[i] = this.queueArray[i];
		}
		this.queueArray = biggerqueueArray;
	}
	
	/*public void print () {
		for(int i = 0; i < this.size ; i++)
		{
			System.out.println(this.queueArray[i]); //this works becuase of toSting()
		}
	}*/

}