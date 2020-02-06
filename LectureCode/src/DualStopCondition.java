import java.util.Scanner;

public class DualStopCondition
{

	public static void main(String[] args)
	{
		// Prompt user for input command
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a command (S for stop): ");
		String s = scan.next();
		
		// Get the first character
		char cmd = s.charAt(0);
		
		// Update this condition so it will exit on the 'S' and 's' commands
		while (cmd != 'S')
		{
			System.out.println("Processing the \'" + cmd + "\' command...");
			
			// Get next command to process
			System.out.println("Please enter another command (S for stop): ");
			s = scan.next();
			cmd = s.charAt(0);
		}
		
		// Exit program
		System.out.println("Exiting program...");
	}

}