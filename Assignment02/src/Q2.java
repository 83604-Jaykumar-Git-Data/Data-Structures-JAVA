//Modify the insertion sort algorithm to sort the array in descending order
import java.util.Arrays;

public class Q2
{

	public static void insertionSortdescending(int arr[], int N)
	{
		int comp=0;
		int flag;
		for(int i = 1 ; i < N ; i++) 
		{
			flag=0;
		
			int temp = arr[i];
			
			int j = i - 1;
			
			
			while(j >= 0 && arr[j] < temp) 
			{							
				arr[j + 1] = arr[j];
				j--;
				comp++;
		        flag=1;
			}
			if(flag==0)
			{
			    comp++;
			}
			arr[j + 1] = temp;
		}
		
		System.out.println("NO of comparisons = "+comp);
	}

	
	
	public static void main(String[] args)
	{

		int arr[] = {22,11,33,44};
		
		System.out.println("Before sort array : " + Arrays.toString(arr));
		insertionSortdescending(arr, arr.length);
		System.out.println("After sort array : " + Arrays.toString(arr));
	}
}
