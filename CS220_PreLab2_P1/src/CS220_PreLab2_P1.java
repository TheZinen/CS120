import java.util.Scanner;

/* CS 220 - Intro to Computer Science
 * File Name: CS220_PreLab2_P1.java
 * Java Programming
 * PreLab 2 - Due 9/1/2025
 * Instructor: Dr. Dan Grissom
 * 
 * Name 1: Jon Doe
 * Name 2: Jane Doe
 * Description: Generic description that is different from the skeleton description
 * to help auto-grader testing.
 */

///////////////////////////////////////////////////////////////////////////////
// INSTRUCTIONS: Update the header above EACH LAB with the correct due date,
// first/last names (remove the "Name 2" line if working alone) and description
// for this specific lab. You should also update the first/last names and problem
// number (if relevant) below in the "System.out.println" statement at the beginning
// of the "main()" method. Failure to do so will result in lost points. DO NOT change
// the name of the class or the autograder will give you 0 points.
//
// PHILOSOPHY: Lab is a chance to "get your feet wet" in a safe environment as it
// will be the first time you'll be trying to program new concepts. Thus, as you'll
// see below, the collaboration rules for LABS are very generous since the main idea
// is for you to learn programming with a lot of resources. To foster this 
// environment, you'll have access to a programming partner of your choice, your peers,
// experienced lab technicians and your instructor.
//
// COLLABORATION: Students may officially work with ONE (1) partner. Both names
// should be listed above in the header and below in the "System.out.println"
// statement. When you turn your lab in, BOTH partners may (and should) turn in the
// exact same submission, although they will be graded independently. Students MAY seek
// advice and look at other students' code DURING lab (including students who are not your
// direct partner), but may NOT copy/paste code from students other than your official
// partner.
//
// If you do not finish your lab assignment during the lab period, you may only seek help
// with your code from lab technicians (available whenever the lab is open) and the instructor
// to aid with any confusion.
///////////////////////////////////////////////////////////////////////////////
public class CS220_PreLab2_P1
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon & Kory Joe");
		System.out.println("PreLab 2, Problem 1");
		System.out.println("");
		
		// Your code should go below this line
		
		// Create a scanner, which can read in user input from the console
		Scanner scan = new Scanner(System.in);
		
		// Ask the user their name and save in a variable called name
		System.out.print("What is your name? ");
		String name = scan.next();
		
		// Print user's name and ask them how many dollars they have in their pocket
		System.out.print("Hello " + name + ", How many dollars do you have in your pocket (not including change, just bills)?");
		int numDollars = scan.nextInt();
		
		//Compute some basic statistics about the number of coins that are equivalent
		//to the number of dollars you have
		int numQuarters = numDollars * 4; // Multiply by the number of quarters in a dollar
		int numDimes = numDollars * 10; //Multiply by the number of dimes in a dollar
		int numNickels = numDollars * 20; // Multiply by the number of nickles in a dollar
		
		// Print out the results
		System.out.println("You have " + numDollars + " dollars, OR");
		System.out.println("You have " + numQuarters + " quarters, OR");
		System.out.println("You have " + numDimes + " dimes, OR");
		System.out.println("You have " + numNickels + " nickels, OR");
		System.out.println("You have " + (numDollars * 100) + " pennies, OR");
		
	}
}