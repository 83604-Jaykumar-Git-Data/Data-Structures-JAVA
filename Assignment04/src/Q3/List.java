package Q3;

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
	
	public void addafternode(int data,int value)
	{
		Node newnode=new Node(value);
		
	   if(isEmpty())
	   {
		   head=newnode;
	   }
	   else
	   {
		   int flag=0;
		   Node trap=head;
		   while(trap!=null)
		   {
				if(trap.data==data)
				{
				  flag=1;
				  break;
				}
				trap=trap.next;
		   }
		   
		   if(flag==1)
		   {
			   Node trav=head;
			   
			   while(trav.data!=data)
			   {
				 trav=trav.next;   
			   }
		     
			   newnode.next=trav.next;
			   trav.next=newnode;
		   }
		   else
		   {
			   System.out.println("enter a valid data");
		   }
	   }
		
	}

	public void addbeforenode(int data,int value)
	{
		Node newnode=new Node(value);
		Node first=head;
	   if(isEmpty())
	   {
		   head=newnode;
	   }
	   else if(first.data==data)
	   {
		 newnode.next=head;
		 head=newnode;
	   }
	   else
	   {
		   int flag=0;
		   Node trap=head;
	
		   while(trap!=null)
		   {
				if(trap.data==data)
				{
				  flag=1;
				  break;
				}
				trap=trap.next;
		   }
		   
		   if(flag==1)
		   {
			   Node trav=head;
			   Node tras=null;
			   while(trav.next.data!=data)
			   {				 
				 trav=trav.next;  
			   }
		     
			   newnode.next=trav.next;
			   trav.next=newnode;
		   }
		   else
		   {
			   System.out.println("enter a valid data");
		   }
	   }
		
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