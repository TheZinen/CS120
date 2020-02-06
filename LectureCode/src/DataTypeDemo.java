import java.util.Scanner;

public class DataTypeDemo 
{

	public static void main(String[] args) 
	{
		// Whole numbers
		int i = -2000000000;
		int iBin = 0b1111; // Dec 15
		int iHex = 0xF; // Dec 15
		byte b = 127;
		short s = 32000;
		long l = 3000000000L;

		// Decimal numbers
		float f = 3.14F;
		double d = 3.14;
		
		// Other
		char c = 77;
		boolean bool = true;
		
		System.out.println(c);
		
		System.out.println(iBin);
		System.out.println(iHex);
		System.out.println(i);
		
		// After conversions
		s = 267;
		System.out.println("b before casting: " + b);
		System.out.println("s before casting: " + s);
		b = (byte)s;
		System.out.println("b after casting: " + b);
		s = b;
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int myNum = scan.nextInt();
		System.out.println(15 / myNum);
		
		System.out.println(5 / 10);
		System.out.println(5 / (double)10);
		System.out.println((double)5 / 10);

		
		
		
		
	}

}
