
public class IntegerTreeNode {
     
	 private int value;
	 private IntegerTreeNode left;
	 private IntegerTreeNode right;
	 
	 public IntegerTreeNode(int value){
		 this.value = value;
	 }
	 
	 public void adds(int newNumber){
		 if (newNumber > this.value) {
			 if (right == null) {
				 right = new IntegerTreeNode(newNumber);
			 }
			 else {
				 right.adds(newNumber);
			 }
		 }
		 else {
			 if (left == null) {
				 left = new IntegerTreeNode(newNumber);
			 }
			 else {
				 left.adds(newNumber);
			 }
		 } 
	 }
	 
	 public boolean containss (int n) {
		 if (n == this.value) {
			 return true;
		 }
		 else {
			 if (n > this.value) {
				 if (right == null) {
					return false; 
				 }
			     else {
				    return right.containss(n);
			     }	 
			 }
		     else {
				 if (left == null) {
					 return false;
				 }
				 else {
					 return left.containss(n);
				 }			 
			 } 
		 }		 
	 }
 
    public boolean containsv (int n) {
		 if (n == this.value) {
			 System.out.println(n);
			 return true;
		 }
		 else {
			 if (n > this.value) {
				 if (right == null) {
					System.out.println(n);
					return false; 
				 }
			     else {
				    return right.containss(n);
			     }	 
			 }
		     else {
				 if (left == null) {
					 System.out.println(n);
					 return false;
				 }
				 else {
					 return left.containss(n);
				 }			 
			 } 
		 }		 
	 } 
 
 
 
 
 
 
 
 
 
 
 
 
 
     public int getMax(){
		 if (right == null) {
			 return this.value;
		 }
		 else {
			 return right.getMax();
		 }
	 }
	 
	 public int getMin(){
		 if (left == null) {
			 return this.value;
		 }
		 else {
			 return left.getMax();
		 }
	 }
	 
	 
	 public String printing2 (){
		 String result = "";
		 if (this == null ) {
			 return result;
		 }
		 else {
			 result = result +this.value +" , ";
			 if (this.left != null ){
				result = result + " " +this.left.printing2(); 
				 }
			 else {
				result = result; 
			 }
			 if (this.right != null) {
				result = result + " " +this.right.printing2();
			 }
			 else {
				 result = result;
			 }
		 }
		 result = result +""; 
		return result;		 
	 }
	 	 
	 
	 public IntegerTreeNode getright(){
		 return this.right;
	 }
	 
	 public IntegerTreeNode getleft(){
		 return this.left;
	 }	 
	 
	 public int getvalue(){
		 return this.value;
	 }
	 
	 public void setright(IntegerTreeNode right){
		 this.right = right;
	 }
	 
	 public void setleft(IntegerTreeNode left){
		 this.left = left;
	 }
	 
	  public void setvalue(int value){
		 this.value = value;
	 }
	 
	 public int depth (int count){
		 int leftdepth = count;
		 int rightdepth = count;
		 if(this.left != null) {
			 leftdepth = this.left.depth(count+1);
		 }
		 if(this.right != null) {
			 rightdepth = this.right.depth(count+1);
		 }
		 return leftdepth > rightdepth ? leftdepth : rightdepth;		 
	 }
	 
}