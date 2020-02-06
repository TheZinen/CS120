import java.util.Scanner;

public class CS220_Lab7_P3
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 7, Problem 2");
		System.out.println("");

		// Your code should go below this line
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a positive integer: ");
		int n = 0;

		// Keep a boolean variable which is made false
		// only when we have an integer AND its positive
		boolean badInput = true;
		// Keep trying until we get good input...
		while (badInput)
		{
			// If we have an integer....
			if (scan.hasNextInt())
			{
				// ...it's safe to read it in and check...
				n = scan.nextInt();
				// ...if it is positive.
				if (n > 0)
					badInput = false; // If so, then we have good input
			}
			else
				scan.next(); // Flush the invalid input
			// If we still have invalid input, then ask again!
			if (badInput)
				System.out.print("That is not a positive integer. Please try again: ");
		}
		
		int i = 0;
		int nfact = n;
		int totalSum = n;
		for (i = 1; i < n; i++){
			nfact = n - i;
			totalSum = totalSum * nfact;
		}
		System.out.println("The product of these numbers is " + totalSum);
	}
}