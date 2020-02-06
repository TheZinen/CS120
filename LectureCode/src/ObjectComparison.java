import java.util.Scanner;

public class ObjectComparison {

	public static void main(String[] args)
	{
		////////////////////////////////////////////
		// Comparison of float/double numbers

		// Compute 11 * .1 two ways
		// Way 1: Multiplication
		float f1 = 11.0f * 0.1f;

		// Way 2: Add 0.1, 11 times
		float f2 = 0f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;
		f2 += .1f;


		// FYI, way 2 can be done with less code, as we
		// will see in Chapter 6
		//float f2 = 0f;
		//for (int i = 1; i <= 11; i++)
			f2 += .1f;

		prnt("Does " + f1 + " equal " + f2 + "?");
		prnt( "Direct comparison: " + (f1 == f2) );
		float threshold = .0001f;
		prnt( "Threshold comparison: " + (Math.abs(f1-f2) <= threshold) );
		
		/*
		if (Math.abs(f1-f2) <= threshold)
		{
			// Take some action in response to f1 and f2 being equal
		}

		////////////////////////////////////////////
		// Comparison two objects
		// == only works as we expect (so far) on primitives
		// On objects, == compares the address of the data, and
		// not data itself. Must use .equals operator


		// Two strings (objects) with same data, one with slightly different data
		String s1 = new String("CS220");
		String s2 = new String("CS220");
		String s3 = new String("cs220");

		prnt("s1==s2: " + (s1 == s2)); // DO NOT USE (behavior can be unpredictable)
		prnt("s1.equals(s2): " + (s1.equals(s2)));
		prnt("s1.equals(s3): " + (s1.equals(s3)));
		prnt("s1.equalsIgnoreCase(s3): " + (s1.equalsIgnoreCase(s3)));
		 */

		////////////////////////////////////////////
		// Conditional operator
		// Just a fancy way to do an IF/ELSE assignment

		/*
		int a = 2;
		int b = 4;

		// Way 1: Traditional IF/ELSE
		if (a < b)
			a += 2;
		else
			a -= 2;
		prnt("a=" + a + ", b=" + b);

		// Way 2: Conditional Operator ?:
		// returnVar = (condition ? trueRet : falseRet);
		a = 2;
		b = 4;
		a = (a < b) ? a+2 : a-2;
		prnt("a=" + a + ", b=" + b);
		 */

		// Conditional Op for absolute value
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers (on 1 line):");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		//int abs = Math.abs(n1 - n2);
		int abs = (n1 > n2) ? n1-n2 : n2-n1;
		System.out.println("Abs(" + n1 + " - " + n2 + ") = " + abs);
	}

	static void prnt(String s)
	{
		System.out.println(s);
	}

}