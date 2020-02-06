import java.util.Arrays;

public class ArrayCopyAndCompare
{
	public static void main(String[] args)
	{
		// Create multiple arrays with values
		int [] prices = { 3, 6, 9, 12 };
		int [] prices2 = { 3, 6, 9, 13 }; // Last value differs
		int [] prices3 = { 3, 6, 9, 12 }; // Same values as prices

		//////////////////////////////////////////////////////////////
		// Basic comparisons
		System.out.println("Basic comparisons: ");

		// Compare prices w/ prices2 (false b/c variables point to different arrays)
		if (prices == prices2)
			System.out.println("\tprices == prices2");
		else
			System.out.println("\tprices != prices2");

		// Compare prices w/ prices3 (false b/c variables point to different arrays)
		if (prices == prices3)
			System.out.println("\tprices == prices3");
		else
			System.out.println("\tprices != prices3");

		// Compare prices w/ prices3 (false b/c arrays hold DIFFERENT data)
		if (prices.equals(prices3))
			System.out.println("\tprices.equals(prices3)");
		else
			System.out.println("\t!prices.equals(prices3)");

		//////////////////////////////////////////////////////////////
		// Perform comparison between two arrays
		System.out.println("\nFOR-LOOP element-by-element comparisons: ");

		boolean arraysEqual = true;
		if (prices.length != prices3.length)
		{
			arraysEqual = false;
		}
		else // iterate through each element
		{
			for (int i = 0; i < prices.length; i++)
			{
				System.out.println("\tComparing " + prices[i] + " to " + prices3[i]);
				if (prices[i] != prices3[i])
				{
					arraysEqual = false;
					break;
				}
			}
		}

		// Comparing prices w/ prices3 using a for loop to check each element
		// (true b/c arrays hold SAME values)
		if (arraysEqual)
			System.out.println("\tprices contains same values as prices3");
		else
			System.out.println("\tprices does NOT contain same values as prices3");

		//////////////////////////////////////////////////////////////
		// Make prices4 as a copy of prices
		System.out.println("Copying arrays using the '=' operator:");
		int [] prices4 = prices;
		System.out.println("\tprices content BEFORE: " + Arrays.toString(prices));
		System.out.println("\tprices4 content BEFORE: " + Arrays.toString(prices4));

		// Change prices4 and print out both arrays - notice that they both
		// contain the change we just made; this is because prices 4 and prices
		// are really pointing to the same array (due to the = operator that was used)
		prices4[0] = 999;		
		System.out.println("\tprices content AFTER: " + Arrays.toString(prices));
		System.out.println("\tprices4 content AFTER: " + Arrays.toString(prices4));

		//////////////////////////////////////////////////////////////
		// Make prices4 as a copy of prices using a FOR LOOP
		System.out.println("\nCopying arrays using the FOR LOOP:");
		prices[0] = 3; // Re-init back to the original prices array
		
		// Create new array and copy values/ elements from prices
		int [] prices5 = new int[prices.length];
		for (int i = 0; i < prices.length; i++)
			prices5[i] = prices[i];
			
			
		System.out.println("\tprices content BEFORE: " + Arrays.toString(prices));
		System.out.println("\tprices4 content BEFORE: " + Arrays.toString(prices5));

		// Change prices4 and print out both arrays - notice that they both
		// contain the change we just made; this is because prices 4 and prices
		// are really pointing to the same array (due to the = operator that was used)
		prices5[0] = 999;		
		System.out.println("\tprices content AFTER: " + Arrays.toString(prices));
		System.out.println("\tprices5 content AFTER: " + Arrays.toString(prices5));


	}

}
