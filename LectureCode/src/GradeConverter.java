import java.util.Scanner;

public class GradeConverter
{
	public static void main(String[] args)
	{
		// Create scanner object to read console
		Scanner scan = new Scanner(System.in);
		
		// Prompt and read in user grade
		System.out.println("Please enter a grade: ");
		int grade = scan.nextInt();
		
		// Finish the program (HINT: Use IF-ELSE IF-ELSE structure) so that we write
		// a the program will print out your grade according to the following scale:
		// [90+] ==> "A
		// [80, 90) ==> "B"
		// [70, 80) ==> "C"
		// [60, 70) ==> "D"
		// [0, 60) ==> "F"
		// [Negative infinity, 0) ==> "Invalid grade"
	
		if (grade >=90)
			System.out.println("A");
		else if (grade > 79 && grade < 90)
			System.out.println("B");
		else if (grade > 69 && grade < 80)
			System.out.println("C");
		else if (grade > 59 && grade < 70)
			System.out.println("D");
		else if (grade <60 && grade > 0)
			System.out.println("F");
		else if (grade < 0)
			System.out.println("Invalid number");
		
	}
}
