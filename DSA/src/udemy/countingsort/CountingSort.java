package udemy.countingsort;

public class CountingSort {
	public static void main(String[] args)
	{
		int[] a = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		
		countingSort(a, 1, 10);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	private static void countingSort(int[] a, int min, int max)
	{
		int[] cntArray = new int[(max - min) + 1];
		
		for(int i =0; i<cntArray.length ; i++)
		{
			cntArray[a[i] - min]++;
		}
		
		int j=0;
		for(int i = min; i<=max; i++)
		{
			while(cntArray[i - min] > 0)
			{
				a[j++] = i;
				cntArray[i - min]--;
			}
		}
	}
}
