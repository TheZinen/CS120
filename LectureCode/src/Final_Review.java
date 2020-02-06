
public class Final_Review
{
	// Set the range of problems you would like to output:
	static int minProbNumber = 1;  // Min problem number to output result for
	static int maxProbNumber = 23; // Min problem number to output result for
	
	enum Binary {ZERO, ONE};
	
	public static void main(String[] args) 
	{
		////////////////////////////////////////
		// Expressions
		int a = 3;
		int b = 4;
		int c = 5;
		
		p(11 % 6 + 4 == 8 || 22 <= 30 - 10 && true    , 1);	// 1 false
		p(a <= c - b             , 2);	//2 false
		p(a == b + c - 7         , 3);	//3 false
		p(a + 1 == b + c - 5     , 4);	//4 true
		p(c % 5 == a - 1         , 5);	//5 false
		p(c % a >= 2             , 6);	//6 true
		
		
		////////////////////////////////////////
		// For loop
		
		// 7
		int count = 0;
		for (int i = 0; i < 7; i++)
		{
			System.out.print(i + ", ");
			count++;
		}
		System.out.println();
		p(count   , 7);
		
		// 8
		count = 0;
		for (int i = 0; i < 14; i +=3)
		{
			System.out.print(i + ", ");
			count++;
		}
		System.out.println();
		p(count   , 8);
		
		// 9
		count = 0;
		for (int i = 5; i >= 5 -5; i -=2)
		{
			System.out.print(i + ", ");
			count++;
		}
		System.out.println();
		p(count   , 9);
		
		// 10
		count = 0;
		for (int i = 6; i < 54; i +=7)
		{
			System.out.print(i + ", ");
			count++;
		}
		System.out.println();
		p(count   , 10);
		
		// 11 
		count = 0;
		for (int i = 3; i < 14 && i != 7; i++)
		{
			System.out.print(i + ", ");
			count++;
		}
		System.out.println();
		p(count   , 11);
		
		
		////////////////////////////////////////////////
		// While / Do-While loop
		
		
		// 12
		count = 0;
		int k = 0;
		while (k != 33)
		{
			k++;
			count++;
		}
		p(count   , 12); // Count = 33
		
		// 13
		count = 0;
		k = 19;
		while (k != 33)
		{
			k = k + 4 - 2;
			count++;
		}
		p(count   , 13); // Count = 7
		
		// 14
		count = 0;
		k = 19;
		int m = 45;
		while (k < 24 && m > 39)
		{
			k++;
			m--;
			count++;
		}
		p(count   , 14); // Count = 5
		
		// 15
		count = 0;
		k = 19;
		m = 45;
		while (k < 24 || m > 39)
		{
			k++;
			m--;
			count++;
		}
		p(count   , 15); // Count = 6
		
		// 16
		count = 0;
		k = 10;
		while (k > 8)
		{
			k++;
			m--;
			count++;
		}
		p(count   , 16); // Count is infinite
		
		// 17
		count = 0;
		k = 10;
		while (k < 8)
		{
			k++;
			m--;
			count++;
		}
		p(count   , 17); // Count = 0
		
		// 18
		count = 0;
		k = 10;
		do
		{
			k++;
			m--;
			count++;
		} while (k < 8);
		p(count   , 18); // Count = 1
		
		
		////////////////////////////////////////////////
		// Nested	
		
		// 19
		count = 0;
		for (int i = 0; i < 5; i++)
			for (int j = 10; j <= 15; j++)
				count++;
		p(count   , 19); // Count = 30
			
		// 20
		count = 0;
		for (int i = 0; i < 5; i++)
			if (i <= 3)
				count++;
		p(count   , 20); // Count = 4
		
		// 21
		count = 0;
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < i; j++)
				count++;
		p(count   , 21); // Count = 10
		
		// 22
		count = 0;
		k = 0;
		for (int i = 0; i < 5; i++)
		{
			k = i;
			while (k++ < 3)
				count++; 
		}
		p(count   , 22); // Count = 6
				
		// 23
		count = 0;
		int s = 10;
		int t = 10;
		while (s < 13 && t > 6)
		{
			s++;
			t--;
			count++;
		}
		p(count   , 23); // Count = 3
		
		System.exit(0);
		
		////////////////////////////////////////////////
		// ENUM Types
		Binary bit = Binary.ZERO;
		// 24
		if (bit == Binary.ZERO)
			p("The signal is low", 24);
 
 		// 25
		switch(bit)
		{
			case ZERO:
				p("LOW!", 25);
				//break;
			case ONE:
				p("High!", 25);
		}
		
		////////////////////////////////////////////////
		// Classes
		// What are the elements of a class?
		// Think of a class and one instance variable.
		// Now, create the entire class.
		
		////////////////////////////////////////////////
		// Statistics - Know how to do this!
		
		////////////////////////////////////////////////
		// Arrays
		// Sequential search through the following array for value
		int value = 45;
		int [] array = {28, 39, 29, 30, 20, 93, 45, 39, 29, 24, 15};
		
		int index = -1;
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] == value)
			{
				index = i;
				break;
			}
		}
		
		if (index >= 0)
			System.out.println("The particular value " + value + " found at index " + index);
		else 
			System.out.println("The particular value " + value + " is not in the array ");
	}

	///////////////////////////////////////////////////////////////////
	// Quick print methods that take in a printable item and a problem
	// number. Only prints item if the given problem number is within
	// the range of the min/max global variable problem numbers at the
	// top of the file. Also prints the problem number before the actual
	// item.
	static void p(String s, int probNumber)
	{
		if (probNumber >= minProbNumber && probNumber <= maxProbNumber)
			System.out.println(probNumber + ": " + s);
	}
	static void p(int i, int probNumber)
	{
		if (probNumber >= minProbNumber && probNumber <= maxProbNumber)
			System.out.println(probNumber + ": " + i);
	}
	static void p(double d, int probNumber)
	{
		if (probNumber >= minProbNumber && probNumber <= maxProbNumber)
			System.out.println(probNumber + ": " + d);
	}
	static void p(boolean b, int probNumber)
	{
		if (probNumber >= minProbNumber && probNumber <= maxProbNumber)
			System.out.println(probNumber + ": " + b);
	}
}