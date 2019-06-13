package udemy.quicksort;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {22, 99, 55, 11};
		
		quickSort(a, 0, a.length);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
			
		
	}
	
	private static void quickSort(int[] a, int start, int end)
	{
		if((end - start) < 2)
			return;
		
		int pivotIndex = partition(a, start, end);
		
		quickSort(a, start, pivotIndex);
		quickSort(a, pivotIndex + 1, end);
		
	}
	
	public static int partition(int[] a, int start, int end)
	{
		int pivotElement = a[start];
		int i = start;
		int j = end;
		
		while(i < j)
		{
			//EMPTY LOOP
			while(i < j && a[--j] >= pivotElement);
			
			if(i < j)
			{
				a[i] = a[j];
			}
			
			while(i < j && a[++i] <= pivotElement);
			
			if(i < j)
			{
				a[j] = a[i];
			}
		}
		
		a[j] = pivotElement;
		return j;
		
	}

}
