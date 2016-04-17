
public class IntegerList {
     
	 private int value;
	 private IntegerList next;
	 
	 
	 public IntegerList(int value){
		 this.value = value;
	 }
	 
	 public void adds(int newNumber){
		 if (this.next == null) {
			this.next = new IntegerList(newNumber);
		 }
		else {
			this.next.adds(newNumber);
		}
	 }
	 
	 public boolean containss (int n) {
		 if (n == this.value) {
			 return true;
		 }
		 else {
				 if (this.next == null) {
					return false; 
				 }
			     else {
				    return this.next.containss(n);
			     }	  
		 }		 
	 }
 
    public boolean containsv (int n) {
		 if (n == this.value) {
			 System.out.println(n);
			 return true;
		 }
		 else {
				 if (this.next == null) {
					System.out.println(n);
					return false; 
				 }
			     else {
				    return this.next.containss(n);
			     }	 			 
		 }		 
	 } 
 
 	 
	 public String printing2 (){
		 String result = "";
		 if (this == null ) {
			 return result;
		 }
		 else {
			 result = result +this.value +" , ";
			 if (this.next != null ){
				result = result + " " +this.next.printing2(); 
				 }
			 else {
				result = result; 
			 }
		 }
		 result = result +""; 
		return result;		 
	 }
	 	 
	 
	 public IntegerList getnext(){
		 return this.next;
	 }
	 	 
	 public int getvalue(){
		 return this.value;
	 }
	 
	 public void setnext(IntegerList next){
		 this.next = next;
	 }

	  public void setvalue(int value){
		 this.value = value;
	 }
	 
}