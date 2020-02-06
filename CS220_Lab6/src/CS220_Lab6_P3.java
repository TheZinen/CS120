import java.text.DecimalFormat;
import java.util.Scanner;

public class CS220_Lab6_P3
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 6, Problem 3");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.000");
		double userInput = 0;
		int counter = 0;
		
		while (userInput <= 10){
			System.out.println("Please enter a number greater than 10: ");
			userInput = scan.nextDouble();
		}
		
		double i = userInput;
		
		do {
			System.out.println("The square root of " + df.format(i) + " is " + df.format(Math.sqrt(i)));
			i = Math.sqrt(i);
			counter++;
		}
		while
			(i >= 1.01);
		
		System.out.println("You performed " + counter + " square root operations.");
	}
}