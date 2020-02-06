import java.text.DecimalFormat;

/* CS 220 - Intro to Computer Science I
 * File Name: Car.java
 * Project 5 - Due 12/11/2016
 * Instructor: Dr. Dan Grissom
 * 
 * Name: Jaylen Quizon
 * Description: .......
 */

///////////////////////////////////////////////////////////////////////////////
// INSTRUCTIONS: Update the header above EACH LAB with the correct due date,
// first/last name and description for this specific project. You should also update
// the first/last name below in the "System.out.println" statement at the beginning
// of the "main()" method. Failure to do so will result in lost points. DO NOT change
// the name of the class or the autograder will give you 0 points.
//
// PHILOSOPHY: Projects provide a chance to solidify your skills on a harder problem.
// Whereas labs are meant to expose you to concepts in a safe environment with a lot
// of help, projects are meant to strengthen your skills and confidence as an independent
// programmer. They will be challenging as everything feels so new, but you'll also 
// experience a lot of growth as you "fight" through the projects.
//
// COLLABORATION: Students MUST work alone on programming projects. It is OKAY to discuss
// the high-level concepts of the programming project and very general coding strategies 
// with classmates, but AT NO POINT should you ever look at the code of your classmate's
// project OR show your code to help another classmate. However, you MAY obtain help from 
// the lab technicians (available whenever the lab is open). If you do so, you MUST add 
// comments to your code declaring which portions of code you received help on and you 
// MUST include which lab technician helped you for that portion. You will not be penalized
// for utilizing lab technicians and this documentation is for your protection in case
// the autograder determines that you cheated, when it is really detecting code that is
// very similar because two students were independently helped by the same lab technician.
// Lab technicians MAY be consulted to ensure they did offer the support that is being claimed
// by your code.
//
// CHEATING: Your projects will be automatically and algorithmically checked for cheating
// by the online submission system. These algorithms are very good and will check against
// each of your classmate's submissions (in this section and other sections), projects that
// have been submitted in the past by previous students at this university and other
// universities, as well as content and code found on the internet. In short, if you cheat,
// EXPECT TO BE CAUGHT.
//
// Be aware that being caught for cheating can result in a 0% on the project for you AND the
// person that gave their code (it is your responsibility to not share your code, too). By the
// course breakdown, this will result in an automatic loss in 8% of your entire course grade.
//
// The lab technicians and instructor are available for help and there is NO REASON to take
// the risk in cheating.
///////////////////////////////////////////////////////////////////////////////

//Car class
public class Car 
{
	private String carModel; // The model of the car 
	private double milesPerGallon; // Car's average mpg rating 
	private double gasTankSize; // Car's gas tank size (in gallons)
	private double gallonsInTank; // Gas (in gallons) remaining in gas tank 
	DecimalFormat df = new DecimalFormat("0.00");

// Default constructor
public Car(){ 
	carModel = "";
	milesPerGallon = 0.0; 
	gasTankSize = 0.0;
	gallonsInTank = 0.0;
}

//Overloaded constructor
public Car(String carM, double mpg, double tankSize, double galT){ 
	carModel = carM;
	milesPerGallon = mpg; 
	gasTankSize = tankSize;
	gallonsInTank = galT;
}

// String representing CarModel will be placed
public String getCarModel() { 
	return carModel;
}

// Sets carModel to carM
public void setCarModel(String carM) { 
	this.carModel = carM;
}

// Double representing milesPerGallon will be placed
public double getMilesPerGallon() { 
	return milesPerGallon;
}

// Sets MilesPerGallon to mpg
public void setMilesPerGallon(double mpg) { 
	this.milesPerGallon = mpg;
}

// Double representing gasTankSize will be placed
public double getGasTankSize() { 
	return gasTankSize;
}

// Sets gasTankSize to tankSize
public void setGasTankSize(double tankSize) { 
	this.gasTankSize = tankSize;
}

// Double representing gallonsInTank will be placed
public double getGallonsInTank() { 
	return gallonsInTank;
}

// Sets gallonsInTank to galT and also if the gallonsInTank 
// is bigger than gasTankSize, set the number of gallons in the tank to the tank size.
public void setGallonsInTank(double galT) { 
	if(galT > gasTankSize){
		galT = gasTankSize;
	}
	this.gallonsInTank = galT;
	
}

// Checks if we have enough gas to drive and prints how many gallons 
// were used. Also, how many miles we can go with the remaining gas. Returns False.
public boolean driveDistance(double m){ 
	if(m < milesPerGallon * gallonsInTank){
		System.out.println((df.format(m / milesPerGallon)) + " gallons burnt. Can travel " + (df.format((gallonsInTank - (m / milesPerGallon)) * milesPerGallon)) + " more miles on this tank.");
		gallonsInTank -= (m / milesPerGallon);
		return true;
	}
// Checks if there's not enough gas to go where we want go and 
// prints out how many miles driven. Returns True.
	else { 
		System.out.println((df.format(gallonsInTank * milesPerGallon)) + " miles were travelled before running out of fuel.");
		gallonsInTank -= (m / milesPerGallon);
		if(gallonsInTank < 0)
			gallonsInTank = 0;
		return false;
	}
}
// Adds gallonsInTank to fill it to the gasTankSize, then prints out how much gas
// were added and how many more miles we had in the tank. Returns the number of gallons added as a double.
public double fillTank(){ 
	double galAddToTank = gasTankSize - gallonsInTank;
	gallonsInTank = gasTankSize;
	System.out.println(df.format(galAddToTank) + " gallons were added to your tank.");
	System.out.println("Can travel " + (df.format(gasTankSize * milesPerGallon)) + " more miles on this tank.");
	return galAddToTank;
}

// Adds "Hybrid" to carModel and increases the milesPerGallon by 10 then returns a new car object.
public Car convertToHybrid(){ 
	Car temp = new Car();
	temp.carModel = carModel + " Hybrid";
	temp.milesPerGallon = milesPerGallon + 10;
	return temp;
	
}

// Returns a String with instance variables that contains all the information
public String toString(){
	String temp = "The " + carModel + " gets " + milesPerGallon + " mpg and has " + gallonsInTank + " gallons of gas in its " + gasTankSize + " gallon tank.";
	return temp;
}

// If o is an instanceof a Car and has the same values, then it returns true.
// Checking each instance variable to see if there are the same. 
// Returns False if they do not match.

public boolean equals(Object o){ 
	if(!(o instanceof Car)){
	return false;
	}
	Car c = (Car)o;
	if(c.carModel != this.carModel){
		return false;
	}
	if(c.milesPerGallon != this.milesPerGallon){
		return false;
	}
	if(c.gasTankSize != this.gasTankSize){
		return false;
	}
	if(c.gallonsInTank != this.gallonsInTank){
		return false;
	}
	return true;
}
}

/******************************************************************************
Insert 1 test case, which represent program input/output for the auto-grader
client you were given. You may literally copy and paste your console contents.
NOTE: For this project, your test case will be the same as the case in
the auto-grader...so you don't have to create a new case like you normally would.

------------
Test Case 1:
------------

Jaylen Quizon
Project 5 (Car)

**** [Check 5] BEGIN MANUAL-CHECK: Should print 12.5 gal burnt, 152 more miles on tank (-2pts if not)
12.50 gallons burnt. Can travel 152.00 more miles on this tank.
------------------------------END MANUAL CHECK------------------------------------

**** [Check 7] BEGIN MANUAL-CHECK: Should print that 152 miles travelled before running out of gas (-2pts if not)
152.00 miles were travelled before running out of fuel.
------------------------------END MANUAL CHECK------------------------------------
22.00 gallons were added to your tank.
Can travel 352.00 more miles on this tank.
6.25 gallons burnt. Can travel 252.00 more miles on this tank.

**** [Check 10] BEGIN MANUAL-CHECK: Should print that 6.25 gallons were added to your tank and can travel 352 more miles (-2pts if not)
6.25 gallons were added to your tank.
Can travel 352.00 more miles on this tank.
------------------------------END MANUAL CHECK------------------------------------

**** [Check 12] BEGIN MANUAL-CHECK: Should print out some form of "Dodge Viper GTS, 16mpg, 22 gallons gas, & 22 gallon tank" (-2pts)
The Dodge Viper GTS gets 16.0 mpg and has 22.0 gallons of gas in its 22.0 gallon tank.
------------------------------END MANUAL CHECK------------------------------------


******************************************************************************/