import java.util.Scanner;

public class CS220_Lab5_P3 
{

	public static void main(String[] args) 
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 5, Problem 3");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender (Male or Female): ");
		String yourGender = scan.next();

		System.out.println("Please enter your weight in pounds: ");
		int userWeight = scan.nextInt();
		if (yourGender.equalsIgnoreCase("Male"))
		{
			if (userWeight <= 169.9999999999)
				System.out.println("You have been placed in the men's lightweight class.");

			else if (userWeight >= 170 && userWeight < 220){
				System.out.println("You have been placed in the men's middleweight class.");
			}
			else if (userWeight >= 220)
				System.out.println("You have been placed in the men's heavyweight class.");

		}
		else
		{
			if (userWeight <= 129.9999999999)
				System.out.println("You have been placed in the women's lightweight class.");

			else if (userWeight >= 130 && userWeight < 184.9999999999)
				System.out.println("You have been placed in the women's middleweight class.");

			else if (userWeight >= 185)
				System.out.println("You have been placed in the women's heavyweight class.");
		}
	}

}
