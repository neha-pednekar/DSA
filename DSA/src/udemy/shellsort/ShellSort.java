package udemy.shellsort;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 88, 44, 22, 11, 99, 55, 77, -33, -66};
		
		for(int gap = intArray.length/2; gap>0; gap/=2)
		{
			for (int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				
				int j = i;
				
				while(j >= gap && intArray[j-gap] > newElement)
				{
					intArray[j] = intArray[j-gap];
					j -= gap;
				}
				intArray[j] = newElement;
				
			}
		}
		
		
		System.out.println("My shell sorted array is as follows");
		for(int k=0; k < intArray.length ; k++)
		{
			System.out.println(intArray[k]);
		}
	}

}
