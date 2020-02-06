import java.util.Scanner;

public class CS220_Lab6_P2
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 6, Problem 2");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		System.out.println("How many times would you like to print \"Hello World\"? ");
		int userInput = 0;
		userInput = scan.nextInt();
		
		do {
			for (int i = 1; i <= userInput; i++)
			System.out.println("Hello World " + i);
			break;
		}
		while
			(userInput < 6);
		
		System.out.println("Goodbye.");
		
		
	}
}