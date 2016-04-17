
public class IntegerTreeNode {
     
	 private int value;
	 private IntegerTreeNode left;
	 private IntegerTreeNode right;
	 
	 public IntegerTreeNode(int value){
		 this.value = value;
	 }
	 
	 public void add(int newNumber){
		 if (newNumber > this.value) {
			 if (right == null) {
				 right = new IntegerTreeNode(newNumber);
			 }
			 else {
				 right.add(newNumber);
			 }
		 }
		 else {
			 if (left == null) {
				 left = new IntegerTreeNode(newNumber);
			 }
			 else {
				 left.add(newNumber);
			 }
		 } 
	 }
	 
	 public boolean contains (int n) {
		 if (n == this.value) {
			 return true;
		 }
		 else {
			 if (n > this.value) {
				 if (right == null) {
					return false; 
				 }
			     else {
				    return right.contains(n);
			     }	 
			 }
		     else {
				 if (left == null) {
					 return false;
				 }
				 else {
					 return left.contains(n);
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
	 
	 public String toString (){
		 String result = "[";
		 if (this == null ) {
			 return result;
		 }
		 else {
			 result = result +this.value +" ";
			 if (this.left != null ){
				result = result + "L" +this.left.toString(); 
				 }
			 else {
				result = result +"L[]"; 
			 }
			 if (this.right != null) {
				result = result + "R" +this.right.toString();
			 }
			 else {
				 result = result +"R[]";
			 }
		 }
		 result = result +"]"; 
		return result;		 
	 }
	 
	 
	 public String toString2 (){
		 String result = "[";
		 if (this == null ) {
			 return result;
		 }
		 else {
			 result = result +this.value +" ";
			 if (this.left != null ){
				result = result + " " +this.left.toString2(); 
				 }
			 else {
				result = result; 
			 }
			 if (this.right != null) {
				result = result + " " +this.right.toString2();
			 }
			 else {
				 result = result;
			 }
		 }
		 result = result +"]"; 
		return result;		 
	 }
	 	 
	 
	 public IntegerTreeNode getright(){
		 return this.right;
	 }
	 
	 public IntegerTreeNode getleft(){
		 return this.left;
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