
public class Q9 {
	
	public static int selectionSort(int arr[], int N) {
		int comparisons = 0;
		for(int i = 0 ; i < N-1 ; i++) {
			int minIndex = i;
			for(int j = i + 1 ; j < N ; j++) {
				comparisons++; 
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {

				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return comparisons;
	}

	public static void main(String[] args) {
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.print("Array before sort : ");
		printArray(arr);
		
		int comparisons = selectionSort(arr, arr.length);
		
		System.out.print("Array after sort : ");
		printArray(arr);
		
		System.out.println("Number of comparisons: " + comparisons);
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
