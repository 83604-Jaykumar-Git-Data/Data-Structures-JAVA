package Q1;

public class stack 
{
    List l1;
   
   
   public stack()
   {
	   l1=new List();
   }
   public void push(int value)
   {
	   l1.addLast(value);
   }
   public void pop()
   {
	   l1.deleteLast();
   }
   public void peek()
   {
	   if(!l1.isEmpty())
	   {
		   System.out.println("peek element is : "+l1.peek());
		// l1.peek();   
	   }
	   else
	   {
		   System.out.println("stack is empty");
	   }
   }
   public boolean isempty()
   {
	   return l1.isEmpty();
   }
}
