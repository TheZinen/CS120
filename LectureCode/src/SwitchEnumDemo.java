import java.util.Scanner;

// Enum for days of week as a better "data type" than integers
enum day { SUN, MON, TUE, WED, THU, FRI, SAT }

public class SwitchEnumDemo
{
	public static void main(String[] args)
	{
		// Create scanner and read in day of week as a String
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day of the week: ");
		String dayOfWeekStr = scan.next();
		
		// Parse the user input version of the day (e.g., "Monday") into
		// the enum type variable names (e.g., "MON")
		dayOfWeekStr = dayOfWeekStr.toUpperCase().substring(0, 3);
		DaysOfWeek day = DaysOfWeek.valueOf(dayOfWeekStr);

		// Switch on dayOfWeek to print out weekend (Sat/Sun), school day (MWF)
		// or work day (TuTh). Should also have a default case to cover invalid
		// input.
		switch (day)
		{
			case Sun:
			case Sat:
				System.out.println("Weekend mode!!!");
				break;
			case Mon: 
			case Wed:
			case Fri:
				System.out.println("School day :-)");
				break;
			case Thu:
				System.out.println("Work week almost over....but still a...");
			case Tue:
				System.out.println("Work day :-(");
				break;
			default:
				System.out.println("Invalid input");
		}

		// Exit message
		System.out.println("Exiting program...");
	}
}