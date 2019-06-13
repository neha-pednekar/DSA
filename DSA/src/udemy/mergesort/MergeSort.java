package udemy.mergesort;

public class MergeSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {22, 99, 55, 11};
		
		int start = 0;
		int end = a.length;
		mergeSort(a, start, end);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
				
		
	}
	
	private static void mergeSort(int[] a, int start, int end)
	{
		if((end - start) < 2)
		{
			return;
		}
		
		int mid = (start+end)/2;
		
		mergeSort(a, start, mid);
		mergeSort(a, mid, end);
		merge(a, start, mid, end);
	}
	
	private static void merge(int[] a, int start, int mid, int end)
	{
		//Because we assume that all elements of the left array will be less than all elements in the right array
		if(a[mid - 1] <= a[mid])
		{
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] tempArray = new int[end-start];
		
		while(i<mid && j<end)
		{
			tempArray[tempIndex++] = a[i] <= a[j] ? a[i++] : a[j++];
		}
		
		System.arraycopy(a, i, a, start+tempIndex, mid-i);
		System.arraycopy(tempArray, 0, a, start, tempIndex);
		
		
	}

}
