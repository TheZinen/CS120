import java.text.DecimalFormat;
import java.util.Scanner;

public class CS220_Project2
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Project 2");
		System.out.println("");

		// Enter the equation you want to find the answer too
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter your equation: ");

		// Setting values for our variables 
		DecimalFormat df = new DecimalFormat("0.00");
		double firstVar = 0.0;
		double secondVar = 0.0;
		firstVar = scnr.nextDouble();
		String signOfEqu = scnr.next();
		secondVar = scnr.nextDouble();

		// Create a switch statement for the possible outcome of an equation
		switch (signOfEqu)
		{
		// Situation that revolves around addition
		case "+":
			double addAnswer = firstVar + secondVar;
			System.out.println("Result of addition: " + df.format(firstVar)+ " + " + df.format(secondVar)
			+ " = " + df.format(addAnswer));
			break;
			// Situation that revolves around subtraction
		case "-":
			double subAnswer = firstVar - secondVar;
			System.out.println("Result of subtraction: " + df.format(firstVar)+ " - " + df.format(secondVar)
			+ " = " + df.format(subAnswer));
			break;
			// Situation that revolves around multiplication
		case "*":
			double multiAnswer = firstVar * secondVar;
			System.out.println("Result of multiplication: " + df.format(firstVar) + " * " + df.format(secondVar)
			+ " = " + df.format(multiAnswer));
			break;
			// Situation that revolves around division
		case "/":
			double divisAnswer = firstVar / secondVar;
			if (secondVar != 0)
			{
				System.out.println("Result of division: " + df.format(firstVar) + " / " + df.format(secondVar)
				+ " = " + df.format(divisAnswer));
			}
			else {
				// Just in case someone tries to divide using a zero
				System.out.println("Sorry, cannot divide by 0. ");
			}
			break;
			// Situation that revolves around power
		case "^":
			double powerAnswer = Math.pow(firstVar, secondVar);
			System.out.println("Result of power: " + df.format(firstVar) + " ^ " + df.format(secondVar)
			+ " = " + df.format(powerAnswer));
			break;
			// Situation that revolves around integer division remainder
		case "%":
			if (secondVar !=0){
				double idrAnswer = firstVar % secondVar;
				System.out.println("Result of integer division remainder: " + df.format(firstVar) + " % " + df.format(secondVar)
				+ " = " + df.format(idrAnswer));}
			else {
				// Just in case someone tries to divide using a zero
				System.out.println("Sorry, cannot divide by 0. ");
				break;
			}
		
		default:
			System.out.println("Sorry, the operation "+ signOfEqu +" is not valid.");
		}
	}
}

/******************************************************************************
Insert 2 test cases, which represent program input/output for two different
combinations of inputs. You may literally copy and paste your console contents,
but your two test cases should be DIFFERENT from any test cases given in the
Project description itself.

------------
Test Case 1:
------------
Please enter your equation: 16.0 + 22.0
Result of addition: 16.00 + 22.00 = 38.00

Please enter your equation: 16 – 22
Result of subtraction: 16.00 – 22.00 = –6.00

Please enter your equation: 16 * 22.0
Result of multiplication: 16.00 * 22.00 = 352.00

Please enter your equation: 16.0 / 22
Result of division: 16.00 / 22.00 = 0.73

Please enter your equation: 16.0 ^ 22.0
Result of power: 16.00 ^ 22.00 = 309485009821345070000000000.00

Please enter your equation: 16.0 % 22.0
Result of integer division remainder: 116.00 % 22.00 = 6.00

Please enter your equation: 16.0 # 22.0
Sorry, the operation # is not valid.

Please enter your equation: 16.0 / 0
Sorry, cannot divide by 0.

------------
Test Case 2:
------------
Please enter your equation: 17.0 + 26.0
Result of addition: 17.00 + 26.00 = 43.00

Please enter your equation: 17 – 26
Result of subtraction: 17.00 – 26.00 = –9.00

Please enter your equation: 17 * 26.0
Result of multiplication: 17.00 * 26.00 = 442.00

Please enter your equation: 17.0 / 26
Result of division: 17.00 / 26.00 = 0.65

Please enter your equation: 17.0 ^ 26.0
Result of power: 17.00 ^ 26.00 = 98100666009922840000000000000000.00

Please enter your equation: 127.0 % 26.0
Result of integer division remainder: 127.00 % 26.00 = 23.00

Please enter your equation: 127.0 # 26.0
Sorry, the operation # is not valid.

Please enter your equation: 17 / 0
Sorry, cannot divide by 0.

 ******************************************************************************/