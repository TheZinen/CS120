/* CS 220 - Intro to Computer Science I
 * File Name: CarAutograderClient.java
 * Project 5 - Due X/XX/XXXX
 * Instructor: Dr. Dan Grissom
 * 
 * Name: Dr. Dan Grissom
 * Description: This class is provided to the student as an aid
 * to assist in testing their class. The actual tester may be 
 * different. But, if your Car class does well with this personal
 * autograder, it should do well when graded online.
 * 
 * YOU SHOULD NOT EDIT OR CHANGE THIS FILE (other than to put your
 * name in the output.)
 */
 
public class CarAutograderClient {

	public static void main(String[] args)
	{
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Project 5 (Car)");
		System.out.println("");
		/////////////////////////////////////////////////////////////////
		// Compilation Penalties
		// -5pts for each method that has an incorrect method header. That is,
		// if you get an error here for a function b/c of mismatching
		// return type or name, take off 5pts for each instance.
		//
		// The following 15 logical errors (2pt penalty each) have been accounted for below.
		// If an error is detected, it will be printed out to the console
		// with its corresponding "Check" number; if the specific test
		// passes, NOTHING will be output. Some of the tests are "Manual
		// Check" tests. For these tests, the expected results will be printed,
		// following by your results. Your results should match the expected 
		// output (the numbers must be the same) or you will be deducted for
		// this "Check" number.
		//
		// [Check 1] carModel getter/setter
        // [Check 2] milesPerGallongetter/setter
        // [Check 3] gasTankSize getter/setter
        // [Check 4] gallonsInTank getter/setter
        // [Check 5] driveDistance() good drive output
        // [Check 6] driveDistance() true return
        // [Check 7] driveDistance() bad drive output
        // [Check 8] driveDistance() false return
        // [Check 9] fillTank() normal fill return
        // [Check 10] fillTank() overfill output
        // [Check 11] fillTank() overfill return
        // [Check 12] toString() output
        // [Check 13] convertToHybrid() return & toString() print
        // [Check 14] equals() false return
        // [Check 15] equals() true return
		
		/////////////////////////////////////////////////////////////////
		// Correctness Penalties
		// Run the program with their car class type and read the output of
		// the program.
		
		//////////////////////////////////////
		// Car initializers
		Car generic = new Car();
		Car viper = new Car("Dodge Viper", 18, 20, 15);
		Car viperHybrid; // Will use later
		Car drivenViper = new Car("Dodge Viper GTS", 16, 22, 22); // Will use later
		
		//////////////////////////////////////
		// Testing getters/setters (8 pts total)
		viper.setCarModel("Dodge Viper GTS");
		viper.setMilesPerGallon(16);
		viper.setGasTankSize(22);
		viper.setGallonsInTank(25);
		if (!viper.getCarModel().equals("Dodge Viper GTS"))
			AGP("-2pts for model getter/setter mismatch", 1); // Check #1
		if (!doubleEquals(viper.getMilesPerGallon(), 16))
			AGP("-2pts for mpg getter/setter mismatch", 2); // Check #2
		if (!doubleEquals(viper.getGasTankSize(), 22))
			AGP("-2pts for gasTankSize getter/setter mismatch", 3); // Check #3
		if (!doubleEquals(viper.getGallonsInTank(), 22)) // Should realize tried to overfill
			AGP("-2pts for gallonsInTank getter/setter mismatch", 4); // Check #4
		
		//////////////////////////////////////
		// Test driveDistance() function (8 pts total)
		AGMCP("Should print 12.5 gal burnt, 152 more miles on tank (-2pts if not)", 5);  // Check #5
		if(!viper.driveDistance(200))
			AGP("-2pts for driveDistance improper return (should be true)", 6); // Check #6
		EMC();
		AGMCP("Should print that 152 miles travelled before running out of gas (-2pts if not)", 7);  // Check #7
		if (viper.driveDistance(200))
			AGP("-2pts for driveDistance improper return (should be false)", 8);  // Check #8
		EMC();
		
		//////////////////////////////////////
		// Test fillTank() function (6pts)
		if(!doubleEquals(viper.fillTank(), 22))
			AGP("-2pts for fillTank improper return (should be 22)", 9); // Check #9
		viper.driveDistance(100); // burn some fuel to test half-fill
		AGMCP("Should print that 6.25 gallons were added to your tank and can travel 352 more miles (-2pts if not)", 10); // Check #10
		if (!doubleEquals(viper.fillTank(), 6.25))
			AGP("-2pts for fillTank improper return (should be 6.25)", 11); // Check #11
		EMC();
		
		//////////////////////////////////////
		// Test toString() function (2pts)
		AGMCP("Should print out some form of \"Dodge Viper GTS, 16mpg, 22 gallons gas, & 22 gallon tank\" (-2pts)", 12); // Check #12
		System.out.println(viper.toString());
		EMC();
		
		//////////////////////////////////////
		// Test convertToHybrid() function (2pts)
		viperHybrid = viper.convertToHybrid();
		if ( !((viperHybrid.getCarModel().equalsIgnoreCase(viper.getCarModel() + " Hybrid") || viperHybrid.getCarModel().equalsIgnoreCase(viper.getCarModel() + "Hybrid"))
				&& doubleEquals(viper.getMilesPerGallon()+10, viperHybrid.getMilesPerGallon())) )
		{
			AGP("-2pts for convertToHybrid hybrid conversion (should be Dodge Viper GTS Hybrid @ 26mpg)", 13);  // Check #13
			System.out.print("Converted to: " + viperHybrid.toString());
		}
		
		//////////////////////////////////////
		// Test equals() function (4pts)
		//AGMCP("Grader: Please rename their Equals function to equals, if necessary, for no penalty.", -1);
		//EMC();
		if (viper.equals(viperHybrid))
			AGP("-2pts for equals check (should be false)", 14); // Check #14
		if (!viper.equals(drivenViper))
			AGP("-2pts for equals check (should be true)", 15); // Check #15
	}
		
	///////////////////////////////////////////////////////////////////////
	// Autograder helper functions: AGP = "Auto-Grader Print";
	// AGMCP = "Auto-Grader Manual Check Print"
	// EMC = "End Manual Check"
	static void AGP(String s, int checkNum)
	{
		System.out.flush();
		try { Thread.sleep(300); } catch (InterruptedException e) {	e.printStackTrace(); }
		if (checkNum >= 0)
			System.err.println("** [Check " + checkNum + "] AG: " + s);
		else
			System.err.println("** [INFO] AG: " + s);
		System.err.flush();
	}
	static void AGMCP(String s, int checkNum)
	{
		System.out.flush();
		try { Thread.sleep(300); } catch (InterruptedException e) {	e.printStackTrace(); }
		if (checkNum >= 0)
			System.err.println("\n**** [Check " + checkNum + "] BEGIN MANUAL-CHECK: " + s);
		else
			System.err.println("\n**** [INFO] BEGIN MANUAL-CHECK: " + s);
		System.err.flush();
	}
	static void EMC()
	{
		System.out.flush();
		try { Thread.sleep(300); } catch (InterruptedException e) {	e.printStackTrace(); }
		System.err.println("------------------------------END MANUAL CHECK------------------------------------");
		System.err.flush();
	}
	static boolean doubleEquals(double d1, double d2)
	{
		double thresh = .1;
		return (Math.abs(d1 - d2) < thresh);
	}
}