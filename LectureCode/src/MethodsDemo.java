public class MethodsDemo 
{

	public static void main(String[] args) 
	{
		double d1 = 9;
		double d2 = 20;
		double d3 = 25;
		double d4 = 38;
		double d5 = 1000000000;

		double max = findMax(d1, d2, d3);
		System.out.println("The max number is: " + max);

		max = findMax(d2, d3, d4);
		System.out.println("The max number is: " + max);

		max = findMax(27, d1, d3);
		System.out.println("The max number is: " + max);

		max = Math.max(d2, findMax(d1, 33, d3));
		System.out.println("The max number is: " + max);
	}

	////////////////////////////////////////////////////////////
	// findMax: Takes in 3 doubles and return the number
	// (double) representing the maximum number of the 3.
	public static double findMax(double num1, double num2, double num3) 
	{	// Curly braces are never optional for methods

		double max = Math.max(num1, Math.max(num2, num3));
		return max;
	}

	////////////////////////////////////////////////////////////
	// findMax: Takes in 4 doubles and return the number
	// (double) representing the maximum number of the 4.
	//
	// NOTE: This is an OVERLOADED of the findMax
	// method above because it has the same method name,
	// but different parameters; however, the purpose/action
	// of the two methods are the same.
	public static double findMax(double num1, double num2, double num3, double num4) 
	{	// Curly braces are never optional for methods

		double max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
		return max;
	}
}
