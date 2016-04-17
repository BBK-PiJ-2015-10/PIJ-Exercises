public class Person {

    private String name;
	private int age;
	private Person nextperson;
	
	public Person(String name, int age){
		this.name = name;
		this.age=age;
		this.nextperson=null;
		}
		
	public void add(Person p) {
		if (this.nextperson == null) {
			this.nextperson = p;
		}
		else {
			this.nextperson.add(p);
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
	
	public Person setnextperson(Person t){
		return this.nextperson = t;
	}  

	
	
	
}

