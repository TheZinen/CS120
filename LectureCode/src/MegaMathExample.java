import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MegaMathExample 
{

	public static void main(String[] args) 
	{
		final int dolVal = 100; // number of pennies in dollar
		final int qVal = 25; // number of pennies in quarter
		final int dVal = 10; // number of pennies in dime
		final int nVal = 5; // number of pennies in nickel
		final int pVal = 1; // number of pennies in penny
		
		// Create scanner and other helpers
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$0.00");
		DecimalFormat pdf = new DecimalFormat("0%");
		
		// Read in cart total and user payment total
		// System.out.println("How much does your cart cost (Ex: 4.52): ");
		// double cartCost = scan.nextDouble();
		
		// Random r = new Random();
		// double cartCost = r.nextDouble() * 10;
		// System.out.println("Your cart total is " + df.format(cartCost));
		
		// Ask user for 4 item prices
		double cartTotal = 0; 	// Track the running total of cost
		int numItems = 0;		// Track the running total of items
		double itemCost;
		
		// Ask/get price of next item
		System.out.println("What is the price of your item: ");
		itemCost = scan.nextDouble();
		cartTotal += itemCost;
		numItems++;
		System.out.println("After " + numItems + " items: " + df.format(cartTotal));
		System.out.println();
		
		// Ask/get price of next item
		System.out.println("What is the price of your item: ");
		cartTotal += scan.nextDouble();
		System.out.println("After " + ++numItems + " items: " + df.format(cartTotal));
		System.out.println();
				
		// Ask/get price of next item
		System.out.println("What is the price of your item: ");			
		cartTotal += scan.nextDouble();
		System.out.println("After " + ++numItems + " items: " + df.format(cartTotal));
		System.out.println();
		
		// Ask/get price of next item
		System.out.println("What is the price of your item: ");			
		cartTotal += scan.nextDouble();
		System.out.println("After " + ++numItems + " items: " + df.format(cartTotal));
		System.out.println();
		
		// Generate random discount
		Random r = new Random();
		double disc = r.nextDouble();
		cartTotal *= (1 - disc);
		System.out.println("After random " + pdf.format(disc) + " discount, cart total is: " + df.format(cartTotal));
		
		// Ask user for amount they are paying
		System.out.println("How much are you giving me (Ex: 4.52): ");
		double payment = scan.nextDouble();
		
		if (payment < cartTotal)
		{
			System.out.println("Dont rip me off!!! Security!!");
			System.out.println("Exiting program...");
			System.exit(0);
		}
		
		//Compute change (overall amount)
		double change = payment - cartTotal;
		System.out.println(df.format(payment) +" - " + df.format(cartTotal) + 
							" = " + df.format(change) + " (change)");
		
		// Output value of each denomination to return
		int centsLeftToReturn = (int)(Math.round(change * 100));
		System.out.println("Num cents to return: " + centsLeftToReturn);
		System.out.println();
		
		// Compute how many dollars to give back and how much remaining change to return
		int numDol = (centsLeftToReturn / dolVal);
		centsLeftToReturn = centsLeftToReturn % dolVal;
		System.out.println("Return " + numDol + " dollars; " + df.format(centsLeftToReturn / 100.0) + " remaining.");
		
		// Compute how many quarters to give back and how much remaining change to return
		int numQ = (centsLeftToReturn / qVal);
		centsLeftToReturn = centsLeftToReturn % qVal;
		System.out.println("Return " + numQ + " quarters; " + df.format(centsLeftToReturn / 100.0) + " remaining.");
		
		// Compute how many dimes to give back and how much remaining change to return
		int numD = (centsLeftToReturn / dVal);
		centsLeftToReturn = centsLeftToReturn % dVal;
		System.out.println("Return " + numD + " dimes; " + df.format(centsLeftToReturn / 100.0) + " remaining.");
		
		// Compute how many nickels to give back and how much remaining change to return
		int numN = (centsLeftToReturn / nVal);
		centsLeftToReturn = centsLeftToReturn % nVal;
		System.out.println("Return " + numN + " nickels; " + df.format(centsLeftToReturn / 100.0) + " remaining.");
		
		// Compute how many pennies to give back and confirm remaining cents to return is 0
		int numP = (centsLeftToReturn / pVal);
		centsLeftToReturn = centsLeftToReturn % pVal;
		System.out.println("Return " + numP + " pennies; " + df.format(centsLeftToReturn / 100.0) + " remaining.");
	}

}
