package udemy.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 88, 44, 22, 11, 99, 55, 77, -33, -66};
		
		for(int firstIndexUnsortedPar = 1; firstIndexUnsortedPar < intArray.length; firstIndexUnsortedPar++)
		{
			int newElement = intArray[firstIndexUnsortedPar];
			int j;
			for(j = firstIndexUnsortedPar; j>0 && newElement < intArray[j-1]; j--)
			{
				intArray[j] = intArray[j-1];
			}
			intArray[j] = newElement;
		}
		
		System.out.println("My insertion sorted array is as follows");
		for(int k=0; k< intArray.length ; k++)
		{
			System.out.println(intArray[k]);
		}
		
	}

}
