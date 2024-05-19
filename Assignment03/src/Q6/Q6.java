package Q6;

public class Q6 {	
	public static int prio(char opr) 
	{
		switch(opr)  
		{
			case '$': return 11;
			case '/': return 10;
			case '*': return 10;
			case '%': return 10;
			case '+': return 9;
			case '-': return 9;
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		
		String infix ="10 + 20 - 30 * 40 ";
		
		String postfix  = infixToPostfix(infix);
		System.out.println("Infix : " + infix);
		System.out.println("Postfix : " + postfix);	 
	}
	
	
	public static String infixToPostfix(String infix) 
	{

		Stack st = new Stack(20);

		StringBuilder postfix = new StringBuilder();

		for(int i = 0 ; i < infix.length() ; i++) 
		{

			char ele = infix.charAt(i);
			
	        if(ele==' ')
	        {
	         continue;	
	        }
			
	        else if(Character.isDigit(ele))
			{
			    while(infix.charAt(i)!=' ')
			    {
			    	postfix.append(infix.charAt(i));
			        i++;
			    }
			    i--;
			}
				
			else if(ele == '(')  
			{	
				st.push(ele);
			}
			else if(ele == ')') 
			{
		
				while(st.peek() != '(')
				{
					postfix.append(st.pop());
				}
				st.pop();
			}
			else 
			{ 
				while(!st.isEmpty() && prio(st.peek()) >= prio(ele)) 
				{
					postfix.append(st.pop());
				}

				st.push(ele);
			}
		}
		while(!st.isEmpty())
		{
			postfix.append(st.pop());
		}
		
		
		return postfix.toString();
	}
}