package udemy.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 88, 44, 22, 11, 99, 55, 77, -33, -66};
	
		for(int lastSortedIndex = intArray.length - 1; lastSortedIndex > 0; lastSortedIndex--)
		{
			for(int i=0; i < lastSortedIndex; i++)
			{
				if(intArray[i] > intArray[i+1])
				{
					swap(intArray, i, i+1);
				}
			}
		}
		
		System.out.println("Time Complexity is O(n^2), The sorted array is as follows: ");
		for(int k=0; k < intArray.length; k++)
		{
			System.out.println("Value at index " + k + " is " + intArray[k]);
		}
		
	}
	
	private static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
