import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayAsCounters 
{
	public static void main(String[] args) 
	{
		// Init helper classes
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		// Create array of doubles for gift prices
		// MAPPING: Index0 : # low cost items; Index1 : # of middle-cost items; 
		// 			Index2: # extravagant-cost items
		int [] gPrices = new int[3];
		
		// Read in gift prices until I read a -1
		System.out.println("How much is you gift: ");
		double price = scan.nextDouble();
		
		while (price >= 0)
		{
			// Process the gift price
			if (price <= 4.99){
				gPrices[0]++;
			}
			else if (price < 25){
				gPrices[1]++;
			}	
			else {
				gPrices[2]++;
			}
			
			// Loop-update read
			System.out.println("How much is your next gift: ");
			price = scan.nextDouble();
		}
		
		System.out.println("The number of low, middle-, and high-cost gifts are: ");
		for (int i = 0; i < gPrices.length; i++)
			System.out.println("\t" + gPrices[i]);
		
		System.out.println("Thank you for your wonderful gifts!!!");
	}
}
