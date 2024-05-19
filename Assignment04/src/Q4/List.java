package Q4;

public class List 
{
	static class Node
	{
		
		private int data;
		private Node next;
		public Node(int value) 
		{
			data = value;
			next = null;
		}
		
	}
	
	private Node head;
	public List() 
	{
		head = null;
	}
	
	public boolean isEmpty() 
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public void rev()
	{
		System.out.println("reverese of linked list is : ");
	  reverse(head);	
	}
	
	public void reverse(Node head)
	{
	  int data;	
	  if(head==null)
	  {
		return;  
	  }
	  
	  data=head.data;
	  reverse(head.next);
	  System.out.print(data +" ");
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			return;
		else
			head = head.next;
	}

	public void deleteAll() 
	{
		head = null;
	}
	
	public void display() 
	{
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) 
		{
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}	
}