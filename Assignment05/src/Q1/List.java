package Q1;

public class List
{
	
	public static class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value) 
		{
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	public List() 
	{
		head = null;
	}
	
	public int getHeadData() 
	{
		return head.data;
	}
		
	public void addLast(int value) 
	{
	
		Node nn = new Node(value);
		if(head == null)
		{	
			head = nn;
			nn.next = nn.prev = nn;
		}
		else
		{
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
		}
	}
		
	public void deleteLast() 
	{
		
		if(isEmpty())
			return;
		
		if(head == head.next)
		{
			head = null;
		}
		else {
			
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	public int peek()
	{
		Node trav=head;
		
		while(trav.next!=null)
		{
			trav=trav.next;
		}
		return trav.data;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void deleteAll() {
		head = null;
	}
}