import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MovieTheaterIfElse 
{

	public static void main(String[] args) 
	{
		// Init some objects
		Scanner scan = new Scanner(System.in);

		// Init variables
		double ticketPrice = 12.50; // Default adult ticket price
		// DecimalFormat mdf = new DecimalFormat("$#,##0.00");
		NumberFormat mnf = NumberFormat.getCurrencyInstance();

		// Prompt user for their age and movie rating
		System.out.println("What is your age?");
		int age = scan.nextInt();
		System.out.println("What is the rating of the movie you'd like to see?");
		scan.nextLine();
		String rating = scan.nextLine();

		if ((rating.contains("13") && age < 13) || 
				(rating.toUpperCase().contains("R") && age < 17))
		{
			// Can't charge ticket b/c of age restriction

			// Get required age for movie type
			int reqAge = 17;
			if (rating.contains("13"))
				reqAge = 13;

			// Print out message to patron
			System.out.println("You are not old enough to watch a " + rating + " movie.");
			System.out.println("You need to be at least " + reqAge + " years old.");

		}
		else // Can change ticket
		{
			// Compute the price of the ticket, depending on age
			if (age <= 12) // age < 13
				ticketPrice = 9.00;
			else if (age >= 65)
				ticketPrice = 7.50;

			// Print out ticket price for user
			System.out.println("Please pay " + mnf.format(ticketPrice));
		}

		// Exit message
		System.out.println("Thank you, please come again!");
	}
}

//int a = 1;
//int b = 2;
//int c;
//
//  if (a < b)
//  	c = a + b;
//  else
//		c = a - b;


