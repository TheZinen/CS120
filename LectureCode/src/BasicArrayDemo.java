import java.util.Scanner;

public class BasicArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		// Way 1 of creating an array - Hardcoded Array
		String [] coolPeopleInCS220 = { "Tommy", "Erick", "Tabitha", "Tyler" };

		for (int i = 0; i < coolPeopleInCS220.length; i++)
			System.out.println("Person at index " + i + " is " + coolPeopleInCS220[i]);
		System.out.println("");

		
		// Way 2 of creating an array - Using new operator
//		String [] favCandy = new String[5];
//		System.out.println("favCandy holds " + favCandy.length + " elements.");

		//Initialize specific values
//		favCandy[1] = "Gummy Worms"; //David's fav candy
//		favCandy[2] = "Starbucks"; //Kory's fav candy
//		favCandy[1] = "Twix";

//		System.out.println("The element at hardcoded index 2 is " + favCandy[2]);

//		for (int i = 0; i < favCandy.length; i++)
//			System.out.println("Candy at index " + i + " is " + favCandy[i]);
//		System.out.println("");
		
		String [] favCandy = new String[coolPeopleInCS220.length];
		System.out.println("favCandy holds " + favCandy.length + " elements.");
		
		// Read in each person's favorite candy
		for (int i = 0; i < coolPeopleInCS220.length; i++)
		{
			System.out.println(coolPeopleInCS220[i] + ", what is your favorite candy?");
			favCandy[i] = scan.nextLine();
		}
		
		//Print out results
		for (int i = 0; i < coolPeopleInCS220.length; i++)
		{
			System.out.println(coolPeopleInCS220[i] + "'s favorite candy is " + favCandy[i]);
		}
		
	}
}
