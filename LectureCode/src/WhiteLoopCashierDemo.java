import java.text.DecimalFormat;
import java.util.Scanner;

public class WhiteLoopCashierDemo
{
	final static double CA_TAX_RATE = 0.0925;
	public static void main(String[] args)
	{
		// Create scanner
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#,##0.00");

		// Get the first item
		//System.out.println("Please enter the price of your first item (Ex: 4.99; -1 for DONE): ");
		//double itemPrice = scan.nextDouble();

		System.out.println("Please enter the price of your first item (Ex: 4.99; -1 for DONE): ");
		while (!scan.hasNextDouble())
		{
			scan.nextLine(); // There was no double, so flush out what was there
			System.out.println("ERROR: Invalid input");
			System.out.println("Please re-enter the price of your first item (Ex: 4.99; -1 for DONE): ");
		}
		double itemPrice = scan.nextDouble();

		// Initialize grocery variables
		double runningTotal = 0;
		int totalItems = 0;
		double minItemCost = Double.MAX_VALUE;
		double maxItemCost = Double.MIN_VALUE;

		// While the item price is non-negative,...
		while (itemPrice >= 0)
		{
			//  Process item
			runningTotal += itemPrice;
			totalItems++;
			minItemCost = Math.min(minItemCost, itemPrice);
			maxItemCost = Math.max(maxItemCost, itemPrice);
			System.out.println("Item " + totalItems + " price: " + df.format(itemPrice) + " (" + df.format(runningTotal) + ")");


			// Prompt user for next item
			//System.out.println("Please enter the price of next item (Ex: 4.99; -1 for DONE): ");
			//itemPrice = scan.nextDouble();

			System.out.println("Please enter the price of your first item (Ex: 4.99; -1 for DONE): ");
			while (!scan.hasNextDouble())
			{
				scan.nextLine(); // There was no double, so flush out what was there
				System.out.println("ERROR: Invalid input");
				System.out.println("Please re-enter the price of your first item (Ex: 4.99; -1 for DONE): ");
			}
			//double itemPrice = scan.nextDouble();
		}

		// Compute statistics and other values
		double taxAmount = runningTotal * CA_TAX_RATE;
		double totalWithTax = runningTotal + taxAmount;
		double average =  runningTotal / totalItems;

		// Print summary of grocery patron - if they bought anything
		if (totalItems > 0)
		{
			System.out.println("You purchased " + totalItems + " items.");
			System.out.println("Your cheapest item cost: " + df.format(minItemCost));
			System.out.println("Your most expensive item cost: " + df.format(maxItemCost));
			System.out.println("Your average item cost: " + df.format(average));
			System.out.println("You owe: " + df.format(runningTotal) + " + " + df.format(taxAmount) +
					" (tax) = " + df.format(totalWithTax));
		}
		else
			System.out.println("Ummmm what are you doing here???? Security!!!");
	}
}





//int i = 1;
//int j = 1;
//while (i <= 10000000)
//{
//	//System.out.println("LOOP " + i++);
//	i++;
//	if (i % 100000 == 0)
//		System.out.println("LOOP " + i++);
//	
//}
//System.out.println("Exiting program...");




//System.out.println("Please enter the price of your first item (Ex: 4.99; -1 for DONE): ");
//while (!scan.hasNextDouble())
//{
//	scan.nextLine();
//	System.out.println("Invalid input; please re-enter the price of your first item (Ex: 4.99; -1 for DONE): ");
//}
//double itemPrice = scan.nextDouble();