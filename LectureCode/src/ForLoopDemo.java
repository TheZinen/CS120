import java.util.Scanner;

public class ForLoopDemo
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// While loop that counts		
		System.out.println("WHILE LOOP:");
		int w = 0;
		while (w < 10)
		{
			System.out.println(w);
			w++;
		}
		
		// For loop that counts (equivalent to while loop above)
		System.out.println("\nFOR LOOP:");
		for (int f = 0; f < 10; f++)
			System.out.println(f);
		
		// Print even numbers from 0 to 30 by incrementing by two each iteration
		System.out.println("\nPrinting even numbers from [0, 30]");
		for (int i = 0; i <= 30; i+=2)
			System.out.println(i);
		
		// Print numbers from 15 down to 0 by decrementing each iteration
		System.out.println("\nPrinting from 15 down to 0");
		for (int i = 15; i >= 0; i--)
			System.out.println(i);
		
		// Print out a String such that each character on it's own line
		String hd = "Hump day!";
		System.out.println("Printing \"" + hd + "\", each character on own line:");
		for (int i = 0; i < hd.length(); i++)
			System.out.println(hd.charAt(i));
		
		// Prompting user for number of grades and then...
		System.out.println("\nRead X number of values and average");
		System.out.println("How many students in your class: ");
		int numStudents = scan.nextInt();
		int runningTotal = 0;
		
		// ...running a FOR-loop with that reads in that many values and
		// adds to our running total
		for (int i = 0; i < numStudents; i++)
		{
			System.out.println("Please enter grade " + (i+1) + ": ");
			int nextGrade = scan.nextInt();
			runningTotal += nextGrade;
		}
		System.out.println("The average of " + numStudents + " grades is: " + (runningTotal / numStudents));
	}
}