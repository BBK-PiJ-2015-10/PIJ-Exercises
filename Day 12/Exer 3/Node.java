public class Node<T>
{
	public T n;
	public Node<T> next;
	public Node<T> prev;
	
	Node(T x)
	{
		this.n = x;
		this.next = null;
		this.prev = null;
	}
	
	public void add(Node<T> n)
	{
		if(next == null)
		{
			this.next = n;
			n.prev = this.next;
		}
		else
			this.next.add(n);
	}
	
	public Node<T> delete()
	{
		return null;
	}
	
	public String toString()
	{
		return n.toString();
	}
}