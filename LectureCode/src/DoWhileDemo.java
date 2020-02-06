import java.util.Scanner;

public class DoWhileDemo
{

	public static void main(String[] args)
	{
		// Scanner init
		Scanner scan = new Scanner(System.in);

		// Variable to set which tells whether the user wants to play again
		boolean again;
		
		// DO (play the game) WHILE the user says "Yes" to playing "again"
		// Always want to play at least once
		do
		{
			// My game code
			System.out.println("Yayyyyy this game is so fun to play!!!! :-P");
			
			// Prompt the user to play again
			System.out.println("Do you want to play the game again (Y or N):");
			again = scan.next().toUpperCase().charAt(0) == 'Y' ? true : false;
		} while (again);
		
		// Print out that the game is over
		System.out.println("Game over!");

	}

}






//System.out.println("Do you want to play the game (Y or N):");
//boolean again = scan.next().toUpperCase().charAt(0) == 'Y' ? true : false;


//String input = scan.next().toUpperCase();
//boolean again = input.charAt(0) == 'Y';