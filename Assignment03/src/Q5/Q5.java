package Q5;

public class Q5
{

	public static int postfixEva(String postfix)
	{
		Stack st=new Stack(25); 
		int n,p;
		
		for (int i = 0; i < postfix.length(); i++)
		{
			n=0;
		    char ele=postfix.charAt(i);
		    
		    if(ele==' ')
		    {
		      continue;	
		    }
		    else if(Character.isDigit(ele))
		    {

		    	while(postfix.charAt(i)!=' ')
		    	{	
		           n=n*10+(postfix.charAt(i)-'0');
		           i++;
		    	}
		    	i--;
		    	st.push(n);
		    }
		    else
		    {
		    	int op2=st.pop();
		    	int op1=st.pop();
		         
		    	int result=calc(op1,ele,op2);
		    	st.push(result);
		    }
		}
		if(!st.isEmpty())
		{
		  return st.peek();	
		}
		return 0;		
	}
	
	public static int prefixEva(String prefix)
	{
		Stack st=new Stack(25); 
		int n,p;
		
		for (int i = prefix.length()-1; i >=0 ; i--)
		{
			n=0;
		    char ele=prefix.charAt(i);
		    
		    if(ele==' ')
		    {
		      continue;	
		    }
		    else if(Character.isDigit(ele))
		    {
		       
		    	
		    	int arr[]=new int[5];
		    	int k,j=0;
		    	while(prefix.charAt(i)!=' ')
		    	{
		    	    arr[j]=	prefix.charAt(i)-'0';
		    	    j++;
		    		i--;
		    	}
		    	for(k=j;k>=0;k--)
		    	{
		    	  n=n*10+arr[k];	
		    	}
		    	st.push(n);
		    	i++;
		    	
		    }
		    else
		    {
		    	int op1=st.pop();
		    	int op2=st.pop();
		         
		    	int result=calc(op1,ele,op2);
		    	st.push(result);
		    }
		}
		if(!st.isEmpty())
		{
		  return st.peek();	
		}
		return 0;		
	}
	
  
	public static int calc(int op1,char opr,int op2)
	{

		switch(opr) 
		{
			case '+': return op1 + op2;				
			case '-': return op1 - op2;
			case '/': return op1 / op2;
			case '*': return op1 * op2;
			case '%': return op1 % op2;
			case '$': return (int)Math.pow(op1, op2);
		}
		
		return 0;
	}
	
	public static void main(String[] args) 
	{

		String postfix="10 12 + 3 4 - +";
		int result1=postfixEva(postfix);
		System.out.println("POSTFIX:"+postfix );
		System.out.println("reult is : "+result1);
     
     
     
		String prefix="+ 25 50";
		int result2=prefixEva(prefix);
		System.out.println("PRETFIX:"+prefix);
		System.out.println("reult is : "+result2);
	}

}
