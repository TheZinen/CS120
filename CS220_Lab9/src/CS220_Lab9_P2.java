import java.util.Scanner;

public class CS220_Lab9_P2
{
	public enum Coin {PENNY, NICKEL, DIME, QUARTER}; 
	
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 9, Problem 2");
		System.out.println("");

		System.out.println("Please enter a coin (e.g. P, N, D, Q): ");
		Scanner scan = new Scanner(System.in);
		
		char charRead = scan.next().charAt(0);
			Coin userCoin;

			if (charRead == 'P')
				userCoin = Coin.PENNY;

			else if (charRead == 'N')
				userCoin = Coin.NICKEL;

			else if (charRead == 'D')
				userCoin = Coin.DIME;

			else
				userCoin = Coin.QUARTER;

		switch(userCoin)
		{
		case PENNY:
			System.out.println("A penny is worth $0.01");
			break;
		case NICKEL:
			System.out.println("A nickel is worth $0.05");
			break;
		case DIME:
			System.out.println("A dime is worth $0.10");
			break;
		default:
			System.out.println("A quarter is worth $0.25");
			break;
		}


	}
}