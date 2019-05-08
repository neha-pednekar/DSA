package udemy.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 44, 88, 22, 11, 99, 55, 77, -33, -66 };

		
		for(int lastSortedIdx = intArray.length - 1; lastSortedIdx > 0; lastSortedIdx--)
		{
			int largest = 0;
			for (int i = 1; i <= lastSortedIdx; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, lastSortedIdx);
		}
			
		
		System.out.println("My selection sorted array is as follows");
		for(int k=0; k< intArray.length ; k++)
		{
			System.out.println(intArray[k]);
		}
	}
	
	private static void swap(int[] a, int i, int j)
	{
		if(i == j)
		{
			return;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
