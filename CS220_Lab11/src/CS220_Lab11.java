import java.text.DecimalFormat;

/* CS 220 - Intro to Computer Science
 * File Name: CS220_Lab11.java
 * Java Programming
 * Lab 11 - Due MM/DD/YYYY
 * Instructor: Dr. Dan Grissom
 * 
 * Name 1: Jaylen Quizon
 * Name 2: FirstName2 LastName2
 * Description: This file contains the source code for Lab 11.
 */

///////////////////////////////////////////////////////////////////////////////
// INSTRUCTIONS: Update the header above EACH LAB with the correct due date,
// first/last names (remove the "Name 2" line if working alone) and description
// for this specific lab. You should also update the first/last names and problem
// number (if relevant) below in the "System.out.println" statement at the beginning
// of the "main()" method. Failure to do so will result in lost points. DO NOT change
// the name of the class or the autograder will give you 0 points.
//
// PHILOSOPHY: Lab is a chance to "get your feet wet" in a safe environment as it
// will be the first time you'll be trying to program new concepts. Thus, as you'll
// see below, the collaboration rules for LABS are very generous since the main idea
// is for you to learn programming with a lot of resources. To foster this 
// environment, you'll have access to a programming partner of your choice, your peers,
// experienced lab technicians and your instructor.
//
// COLLABORATION: Students may officially work with ONE (1) partner. Both names
// should be listed above in the header and below in the "System.out.println"
// statement. When you turn your lab in, BOTH partners may (and should) turn in the
// exact same submission, although they will be graded independently. Students MAY seek
// advice and look at other students' code DURING lab (including students who are not your
// direct partner), but may NOT copy/paste code from students other than your official
// partner.
//
// If you do not finish your lab assignment during the lab period, you may only seek help
// with your code from lab technicians (available whenever the lab is open) and the instructor
// to aid with any confusion.
///////////////////////////////////////////////////////////////////////////////
public class CS220_Lab11
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 11, Problem 3");
		System.out.println("");

		// Your code should go below this line

		// Decimal format....do not need cents b/c negligible
		// compared to hundreds of thousands of dollars
		DecimalFormat df = new DecimalFormat("$#,##0");

		// Testing default constructor and toString()
		House defaultHouse = new House();
		System.out.println(defaultHouse.toString());

		System.out.println(); // Spacing

		// Testing overloaded constructor and toString()
		House bigHouse = new House(1400000, "Pasadena", 6);
		System.out.println(bigHouse.toString());

		// Tests the getters
		System.out.println("Before modifying big house using setters: ");
		System.out.println("Big house value: " + df.format(bigHouse.getValue()));
		System.out.println("Big house location: " + bigHouse.getLocation());
		System.out.println("Big house bedrooms: " + bigHouse.getNumBedrooms());

		// Apply the setters....will test their functionality
		// by calling getters again next...
		bigHouse.setValue(3200000);
		bigHouse.setLocation("Hollywood");
		bigHouse.setNumBedrooms(14);

		System.out.println(); // Spacing

		// Tests that the setters did their jobs
		System.out.println("After modifying big house using setters:");
		System.out.println("Big house value: " + df.format(bigHouse.getValue()));
		System.out.println("Big house location: " + bigHouse.getLocation());
		System.out.println("Big house bedrooms: " + bigHouse.getNumBedrooms());

		System.out.println(); // Spacing

		// Test the equals() method on case that should return false
		System.out.println("The default house and big house ");
		if (defaultHouse.equals(bigHouse))
			System.out.println("are the SAME houses!");
		else
			System.out.println("are DIFFERENT houses!");

		System.out.println(); // Spacing

		// Test the equals() method on case that should return true
		House identicalBigHouse = new House(3200000, "Hollywood", 14);
		System.out.println("The identical big house and big house ");
		if (identicalBigHouse.equals(bigHouse))
			System.out.print("are the SAME houses!");
		else
			System.out.print("are DIFFERENT houses!");
	}
}