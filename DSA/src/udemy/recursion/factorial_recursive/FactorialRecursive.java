package udemy.recursion.factorial_recursive;

public class FactorialRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int factorial = calculateFactorial(n);
		System.out.println("The factorial result for integer n " + n + " is: " + factorial);
	}
	
	private static int calculateFactorial(int num)
	{
		if(num == 0) return 1;
		if(num > 0)
		{
			num = num * calculateFactorial(num - 1);
		}
		return num;
	}

}
