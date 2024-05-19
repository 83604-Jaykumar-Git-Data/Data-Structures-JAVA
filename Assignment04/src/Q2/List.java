package Q2;
public class List 
{
	static class Node
	{
		private char data;
		private Node next;
	
		public Node(char value)
		{
			data = value;
			next = null;
		}
	}


	private Node tail;
	private int count;
	
	public List()
	{
		
	    tail=null;
		count = 0;
	}
	
	public boolean isEmpty()
	{
		return tail == null;
	}
	
	public void addFirst(char value) 
	{
		
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			tail=newnode;
			newnode.next = newnode;
		}
	
		else
		{
			
			newnode.next = tail.next;
			tail.next=newnode;

		}
		count++;
	}
	
	public void addLast(char value) 
	{
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
		{
			tail = newnode;
			newnode.next = newnode;
		}
		
		else 
		{
		  
		   newnode.next=tail.next;
		   tail.next=newnode;
		   tail=newnode;
		}
		count++;
	}
	
	public void addPosition(char value, int pos)
	{
		// valid positions : 1 to count + 1
		// invalid positions : < 1 and > count + 1
		if(pos < 1 || pos > count + 1) 
		{
			System.out.println("Invalid position");
			return;
		}
		else
		{
			if(pos==1)
			{
			 addFirst(value);
			 
			}
			else
			{
				Node newnode=new Node(value);
				Node trav=tail.next;
				for(int i=1;i<pos-1;i++)
				{
				  trav=trav.next;	
				}
				newnode.next=trav.next;
				trav.next=newnode;
				if(trav==tail)
				{
				  tail=newnode;	
				}
				count++;
			}			
		}
	}

	public void deleteFirst() 
	{
		
		if(isEmpty())
		{
			return;
		}
		else if(tail == tail.next)
		{
			tail = null;
		}
			
		else 
		{
			tail.next=tail.next.next;
		}
		count--;
	}
	
	public void deleteLast()
	{
	
		if(isEmpty())
		{
			return;
		}
		
		else if(tail == tail.next)
		{	
			tail = null;
		}
		else 
		{
			
			Node trav = tail.next;
			while(trav.next != tail)
				{
				trav = trav.next;
				}
			
			trav.next = tail.next;
			tail=trav;
		}
		count--;
	}
	public void deletePosition(int pos)
	{
		if(pos < 1 || pos > count) 
		{
			System.out.println("Invalid position");
			return;
		}
		else
		{
			if(pos==1)
			{
			  deleteFirst();	
			}
			else if(pos==count)
			{
			 deleteLast();	
			}
			else
			{
				Node trav=tail.next;
				for(int i=1;i<pos-1;i++)
				{
				 trav=trav.next;	
				}
				
				if(trav.next==tail)
				{
				  tail=trav;
				  trav.next=trav.next.next;
				}
				else
				{
					trav.next=trav.next.next;
				}
				
				count--;
			}
		}
	}
	
	public void display() 
	{
		if(isEmpty())
			return;
		Node trav = tail.next;
		System.out.print("List :: ");
		do 
		{
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != tail);
		System.out.println(" " +trav.data);
		System.out.println("");
		System.out.println("Node count : " + count);
	}
	
	public void deleteAll() {
		tail = null;
	}	
}