import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CS220_Project1 {

	public static void main(String[] args) {
	
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Project 1");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.0%");
		DecimalFormat pdf = new DecimalFormat ("000,000.00");
		NumberFormat mnf = NumberFormat.getCurrencyInstance();
		
		// Input the values to use for our problems
		System.out.println("What is your annual interest rate as a decimal? (ex: 0.045):");
		double annualInt = scan.nextDouble();
		System.out.println("How many years will your mortgage be held? ");
		double mortYears = scan.nextDouble();
		System.out.println("What amount of the mortgage did you borrow? ");
		double mortAmount = scan.nextDouble();
		
		// Finding out the annual Interest and mortgage amount
		System.out.println("The number " + annualInt + " can be represented as " + df.format(annualInt));
		System.out.println("The mortgage amount is $" + pdf.format(mortAmount));
		
		// Finding out the monthly payment and total payment in dollars 
		double mIR = (annualInt / 12);
		double M = mortAmount; 
		double monthPay = (((mIR * M) / ((1 - (1/(Math.pow(((1 + mIR)),(12 * mortYears))))))));
		System.out.println("The monthly payment in dollars is " + mnf.format(monthPay));
		
		double totalPay = ((monthPay * 12) * mortYears);
		System.out.println("The total payment in over the years in dollars is " + mnf.format(totalPay));
		
		// Finding out the overpayment and its percentage of the mortgage
		double overPay = (totalPay - mortAmount);
		System.out.println("The overpayment is " + mnf.format(overPay));
		double overPercent = (((overPay * 100) / mortAmount) / 100);
		System.out.println("The overpayment as a percentage of the mortgage is " + df.format(overPercent));
		


/******************************************************************************
Insert 2 test cases, which represent program input/output for two different
combinations of inputs. You may literally copy and paste your console contents,
but your two test cases should be DIFFERENT from any test cases given in the
Project description itself.

NOTE: Two example test cases are given below as an example; you should generate
your own cases.
 
------------
Test Case 1:
------------
Jaylen Quizon
Project 1

What is your annual interest rate as a decimal? (ex: 0.045):
.066
How many years will your mortgage be held? 
10
What amount of the mortgage did you borrow? 
400000
The number 0.066 can be represented as 6.6%
The mortgage amount is $400,000.00
The monthly payment in dollars is $4,562.30
The total payment in over the years in dollars is $547,475.73
The overpayment is $147,475.73
The overpayment as a percentage of the mortgage is 36.9%

------------
Test Case 2:
------------
Jaylen Quizon
Project 1

What is your annual interest rate as a decimal? (ex: 0.045):
.011
How many years will your mortgage be held? 
30
What amount of the mortgage did you borrow? 
500500
The number 0.011 can be represented as 1.1%
The mortgage amount is $500,500.00
The monthly payment in dollars is $1,632.90
The total payment in over the years in dollars is $587,843.61
The overpayment is $87,343.61
The overpayment as a percentage of the mortgage is 17.5%
******************************************************************************/
		
		      return;

	}

}
