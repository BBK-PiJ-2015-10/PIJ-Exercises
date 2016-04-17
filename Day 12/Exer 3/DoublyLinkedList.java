public class DoublyLinkedList<T> implements LinkedList<T>
{
	private Node<T> head;
	
	public DoublyLinkedList()
	{
		this.head = null;
	}
	
	public void add(T n)
	{
		if(head==null)
		{
			this.head = new Node<T>(n);			
		}
		else
		{
			head.add(new Node<T>(n));
		}
	}
	
	public T remove()
	{
		// This I am going to leave to you to complete
		return null;
	}
	
	public void printList()
	{
		Node<T> temp = head;
		while(temp != null)
		{
			System.out.println(temp);
			temp = temp.next;
		}
	}
	
	

}