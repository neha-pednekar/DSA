package udemy.recursion.factorial_iterative;

public class FactorialIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int factorial = calculateFactorial(n);
		System.out.println("The factorial result for integer n " + n + " is: " + factorial);
	}
	
	private static int calculateFactorial(int n)
	{
		int factorial = 1;
		
		if(n == 0)
		{
			return 1;
		}
		
		for(int i=1; i<=n; i++)	
		{
			factorial = factorial*i;
		}
		
		return factorial;
				
	}

}
