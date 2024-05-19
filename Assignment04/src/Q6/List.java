package Q6;

public class List 
{
	static class Node
	{
		
		private Employee data;
		private Node next;

		public Node(Employee value) 
		{
			data =value ;
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
	

	
	public void addLast(Employee value) 
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{	
			head = newnode;
		}
		else 
		{
		
			Node trav = head;
			
			while(trav.next != null)
				{
					trav = trav.next;
				}
		
			trav.next = newnode;
		}
	}
	
	public void deleteFirst()
	{
		
		if(isEmpty())
		 {
				return;
		 }
		else
		{
			head = head.next;
		}
		
	}
	
	public void delete(int empid)
	{
		
	if(head.data.getId()==empid)
	{
    	 deleteFirst();	
	}
	else
	{
		Node trav=head;
	    int flag=0;
	    
		while(trav!=null)
		{
		  if(trav.data.getId()==empid)
		  {
			flag=1;  
		    break;
		  }
		  trav=trav.next;
		}
		if(flag==1)
		{
		   Node trap=head;
		   while(trap.next.data.getId()!=empid)
		   {
			 trap=trap.next;   
		   }
		   trap.next=trap.next.next;
		}
		else
		{
			System.out.println("employee not found");
		}
		
	 }
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
			System.out.print("  " + trav.data.toString());		
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void searchemp(String name)
	{
		if(isEmpty())
		{
		  return;	
		}
	 
		Node trav=head;
	    while(trav!=null)
	    {
	      if(trav.data.getName().compareTo(name)==0)
	      {
	    	  System.out.println("employee found");  
	         
	          System.out.println( trav.data.toString());
	    	 
	      }
	      trav=trav.next;
	    }
	}	
}