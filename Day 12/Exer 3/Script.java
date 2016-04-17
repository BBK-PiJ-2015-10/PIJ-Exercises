public class Script
{
	public static void main(String[] args)
	{
		DoublyLinkedList<Double> dl = new DoublyLinkedList<Double>();
		
		Double n1 = new Double(10);
		dl.add(n1);
		Double n2 = new Double(20);
		dl.add(n2);
		Double n3 = new Double(30.23);
		dl.add(n3);
		
		dl.printList();
	}
}