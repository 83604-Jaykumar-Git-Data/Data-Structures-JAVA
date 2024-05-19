
public class Q23LinearSearch {
	
	public static int linearsearch(int arr[],int key)
	{
		for (int i = (arr.length-1); i >=0; i--)
		{
			if(arr[i]==key)
			{
			  return i;	
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {20,10,20,80,90,20,70,50,90};
		   int index=linearsearch(arr,20);
		   if(index!=-1)
		   {
			   System.out.println("last occurrence is at index :"+index);
			   System.out.println("no of comparisons="+(arr.length-index));
		   }
		   else
		   {
			   System.out.println("element not found");
		   }

	}

}
