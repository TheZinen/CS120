import java.util.Scanner;

public class MethodsArrayDemo 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//Prompt user for number of values
		System.out.println("How many values would you like to enter?");
		int numPrices = scan.nextInt();
		
		//Read in values
		int [] prices = new int [numPrices];
		for (int i = 0; i < numPrices; i++)
		{
			System.out.println("Please enter next price: ");
			prices[i] = scan.nextInt();
		}

		printPriceArray(prices);
		
		System.out.println("How much of a discount do you want?");
		int discount = scan.nextInt();
		int [] discPrices = computeDiscountPrices(prices,discount);
		
		printPriceArray(discPrices);
	}
	
	public static int[] computeDiscountPrices(int[] pArray, int disc)
	{
		int [] dArray = new int [pArray.length];
		for (int i = 0; i < pArray.length; i++)
			dArray[i] = pArray[i] - (int) (pArray[i] * (disc/100.0));
		return dArray;
	}
	
	public static void printPriceArray(int[] pArray)
	{
		System.out.println("Prices:");
		for (int i = 0; i < pArray.length; i++)
			System.out.print("$" + pArray[i] + " ");
		System.out.println();
	}
}
