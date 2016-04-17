public class Person {

    private String name;
	private int age;
	private Person nextperson;
	private Person priorperson;
	
	public Person(String name, int age){
		this.name = name;
		this.age=age;
		this.nextperson=null;
		this.priorperson=null;
		}
		
	public void add(Person newperson) {
		if (this.nextperson != null) {
			if (this.age <65 && newperson.age >=65){
			    this.priorperson.nextperson = newperson;
				newperson.nextperson = this;
			}  
			else {
				//if (this.age <18 && newperson.age >=18){
					//this.priorperson.nextperson = newperson;
				    //newperson.nextperson = this;
				//}
				this.nextperson.add(newperson);
			}
		}
		
		
		else {
			if (this.age <65 && newperson.age >=65){
				this.priorperson.nextperson = newperson;
				newperson.nextperson = this;
			}
			else {
				//if (this.age <18 && newperson.age >=18){
					//this.priorperson.nextperson = newperson;
				    //newperson.nextperson = this;
				//}
				this.nextperson = newperson;
				newperson.priorperson = this;
			}
		}
	}	
	
	public String getname(){
		return this.name;	
	}
	
	public String setname(String s){
		return this.name = s;
	}
	
	public String toString(){
		return "Name: " + name + ", Age: " + age;	
	}
	
	public int getage(){
	    return this.age;
	}
	
	public int setage(int a){
		return this.age = a;
	}
	
	public Person getnextperson(){
	    return this.nextperson;
	}
	
	public Person getpriorperson(){
	    return this.priorperson;
	}
	
	
	
	public Person setnextperson(Person t){
		return this.nextperson = t;
	}  
	
	public Person setpriorperson(Person t){
		return this.priorperson = t;
	} 
	
	
	
	

	/*public void add(Person newperson) {
		if (this.nextperson == null) {
			if (this.age <65 && newperson.age >=65) {
			   this.priorperson.nextperson = newperson;
			   newperson.priorperson = this.priorperson;
			   this.priorperson = newperson;
			   newperson.nextperson = this;
			       if(newperson.priorperson.priorperson == null) {					   
				   }
				   //else {
					 //  newperson.priorperson.add(newperson);
				   //}
			}
			else {
				this.nextperson = newperson;
				this.nextperson.priorperson = this;
			}
		}
		else {
			this.nextperson.add(newperson);
		*/
	
	
	
	
	
	
	
	
	
}

