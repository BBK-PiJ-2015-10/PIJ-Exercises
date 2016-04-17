public class IntegerListSet implements IntSortedList {

	IntegerList head;
	
	public void add (int newnumber) {
		if (head == null) {
			head = new IntegerList(newnumber);
		}
		else {
			head.adds(newnumber);
		}
	}
	
	public boolean contains(int n) {
		return head.containss(n);
	}
	
	
	public boolean containsVerbose(int n){
		return head.containsv(n);
	}
	
	public String toString() {
		return head.printing2();
	}
	
	
}