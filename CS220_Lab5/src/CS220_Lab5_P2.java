import java.util.Scanner;

public class CS220_Lab5_P2 
{

	public static void main(String[] args) 
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 5, Problem 2");
		System.out.println("");

		// Enter a website address
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a website address: ");
		String webAddress = scan.nextLine();
		
		// Reads the last part of the url and scans it as domainName
		int beginIndex = webAddress.lastIndexOf('.');
		String domainName = webAddress.substring(beginIndex);

		// Lists all the possibilities for domainName and narrows it down to one choice
		switch (domainName)
		{
			case ".gov":
				System.out.println("The address is a government address.");
				break;
			case ".edu":
				System.out.println("This address is a university address.");
				break;
			case ".com":
				System.out.println("This address is a business address.");
				break;
			case ".org":
				System.out.println("This address is a organization address.");
				break;
			default:
				System.out.println("The address is from an unknown entity.");
		}
			
	}

}
