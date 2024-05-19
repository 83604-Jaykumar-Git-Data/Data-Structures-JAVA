package Q5;
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
		
		public void addsorted(int value)
		{
			
			Node newnode = new Node(value);
		    
			if(head==null)
			{
			 head=newnode;	
			}
			else if(head.next==null)
			{
			 if(newnode.data>head.data)
			 {
				head.next=newnode; 
			 }
			 else
			 {
				 newnode.next=head;
				 head=newnode;
			 }
			}
				
			else
			{
				     Node trar=head;
				    if(newnode.data<trar.data)
				    {
				      newnode.next=head;
				      head=newnode;
				    }
					else 
					{	
						Node trav=head;
						Node big=null;
						int flag=0;
						while(newnode.data>trav.data)
						{
						  if( trav.next!=null && trav.next.data>newnode.data)
						  {
							big=trav;  
						  }
						  else if(trav.next==null)
						  {
							trav.next=newnode;
						    flag=1;	
							break;
						  }
						 trav=trav.next;
						}
						if(flag!=1)
						{
						newnode.next=big.next;
						big.next=newnode;
						}
						
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