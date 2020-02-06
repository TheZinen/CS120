
public class NestedForLoopDemo 
{

	public static void main(String[] args) 
	{
		int maxR = 5;
		int maxC = 1;
		for (int r = 0; r < maxR; r++)
		{
			if ((r + 1) % 3 == 0)
				continue;
			
			for (int c = 0; c < maxC; c++)
				System.out.print((r + 1) + "	");
			System.out.println();
			
			if (r == 9)
				break;
		}
		System.out.println("Goodbye.");
		
//		for (int r = 0; r < maxR; r++)
//		{
//			for (int c = 0; c < r + 1; c++)
//				System.out.print((c + 1) + " ");
//			System.out.println();
//		}
		
		
		// Print out a String such that each character on it's own line
//		String hd = "Hump day!";
//		System.out.println("Printing \"" + hd + "\", each character on own line:");
//		for (int i = 0; i < hd.length(); i++)
//		{
//			for(int j = 0; j < i ; j++)
//				System.out.print(" ");
//			System.out.println(hd.charAt(i));
//		}

	}

}
