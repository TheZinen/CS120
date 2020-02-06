import java.util.Random;

public class CS220_Project4
{
	public static void main(String[] args)
	{
		///////////////////////////////////////////////////////////////////
		// ******************************NOTE******************************
		// DO NOT EDIT THE CODE IN THIS MAIN METHOD OTHER THAN YOUR NAME 
		// AND TO TEST DIFFERENT "randomGrades".
		///////////////////////////////////////////////////////////////////
		
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Project 4");
		System.out.println("");

		int [] ranGrades = generateRandomGrades(7);
			
		// Create new array of grades for testing
		// (NOTE: Feel free to change these grades or add new grades to
		//  	  test the functionality of your class)
		//int [] ranGrades = {45, 82, 67, 88, 93, 77, 95}; 		// Test case for grading
		//int [] ranGrades = {10, 30, 40, 20, 80, 90}; 			// Test case for grading 
		 		
		// Print out the grades
		printGradeArray(ranGrades); // Prints out array, e.g. 38 49 20 89 2 56 89

		///////////////////////////////////
		// BEFORE CURVE
		System.out.println("\nBEFORE CURVE:");
		
		// Print out the number of each letter (e.g., 2 A's, 2 B's, 1 C's, 1 D's, 1 F's)
		int [] gradeL = getLetterGradeArray(ranGrades);

		// Print out letter grades (e.g., 2A's, 2B's, 1C's, 1D's, 1F's)
		printLetterGradesArray(gradeL);

		// Prints out the total cost of the party
		System.out.println("Time for a $" + computePartyCost(gradeL) + " party!");
		
		///////////////////////////////////
		// AFTER CURVE
		System.out.println("\nAFTER CURVE:");

		// Curve the grades up 1 letter grade
		gradeL = curveLetterGradesUp(gradeL);
		//letterGrades = curveLetterGradesUp(letterGrades); // Uncomment to curve again
		
		// Print out letter grades (e.g., 2A's, 2B's, 1C's, 1D's, 1F's)
		printLetterGradesArray(gradeL);

		// Prints out the total cost of the party
		System.out.println("Time for a $" + computePartyCost(gradeL) + " party!");
	}

	///////////////////////////////////////////////////////
	// Randomly generates grades for the next method
	public static int  []generateRandomGrades(int numStudents){
		int [] ranGrades = new int [numStudents];
		
		Random random = new Random();
		
		while(numStudents > 0){
			numStudents--;
			ranGrades [numStudents] = random.nextInt(100);
		}
		return ranGrades;
	}
	///////////////////////////////////////////////////////
	// Lists the grades that we will be using for our curves
	public static void printGradeArray(int [] ranGrades){
		System.out.println("GRADES:");
		for (int numStudents = 0; numStudents < ranGrades.length; numStudents++){
			System.out.print(ranGrades[numStudents] + " ");
		}
		System.out.println();
	}

	///////////////////////////////////////////////////////
	// Puts all the grades within a certain range so we can categorize them
	public static int [] getLetterGradeArray(int []ranGrade){
		int [] grades = new int [ranGrade.length];
		for (int numStudents = 0; numStudents < ranGrade.length; numStudents++){
			if (ranGrade[numStudents] >= 90){
				grades[numStudents] = 0;
			}
			if (ranGrade[numStudents] >= 80 && ranGrade[numStudents] <= 89){
				grades[numStudents] = 1;
			}
			if (ranGrade[numStudents] >= 70 && ranGrade[numStudents] <= 79){
				grades[numStudents] = 2;
			}
			if (ranGrade[numStudents] >= 60 && ranGrade[numStudents] <= 69){
				grades[numStudents] = 3;
			}
			if (ranGrade[numStudents] <= 59){
				grades[numStudents] = 4;
			}
		}
	return grades;
	}
	
	///////////////////////////////////////////////////////
	// Categorizes the grades within letter groups so we can see how every person did
	// && prints the grades out
	public static void printLetterGradesArray(int [] ranGrades){
		
		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		int gradeD = 0;
		int gradeF = 0;
		
		for (int numStudents = 0; numStudents < ranGrades.length; numStudents++){
			if(ranGrades[numStudents] == 0){
				gradeA += 1;
			}
			if(ranGrades[numStudents] == 1){
				gradeB += 1;
			}
			if(ranGrades[numStudents] == 2){
				gradeC += 1;
			}
			if(ranGrades[numStudents] == 3){
				gradeD += 1;
			}
			if(ranGrades[numStudents] == 4){
				gradeF += 1;
			}
		}
		System.out.println(gradeA + "A's, " + gradeB +"B's, " + gradeC + "C's, " + gradeD + "D's, " + gradeF + "F's ");

	}
	
	///////////////////////////////////////////////////////
	// Calculates the amount of money we can use for the grades that were given
	public static int computePartyCost(int [] ranGrades){
		int partyCost = 0;
		for (int numStudents = 0; numStudents < ranGrades.length; numStudents++){
			if(ranGrades[numStudents] == 0){
				partyCost += 20;
			}
			if(ranGrades[numStudents] == 1){
				partyCost += 10;
			}
			if(ranGrades[numStudents] == 2){
				partyCost += 5;
			}
		}
		return partyCost;
	}
		
	///////////////////////////////////////////////////////
	// Curves the grades to get a better party & overall grade
	public static int[] curveLetterGradesUp (int [] ranGrades) {
		int [] curveGrade = new int [ranGrades.length];
	
		for (int numStudents = 0; numStudents < ranGrades.length; numStudents++){
			if(ranGrades[numStudents] == 1){
				curveGrade[numStudents] = 0;
			}
			if(ranGrades[numStudents] == 2){
				curveGrade[numStudents] = 1;
			}
			if(ranGrades[numStudents] == 3){
				curveGrade[numStudents] = 2;
			}
			if(ranGrades[numStudents] == 4){
				curveGrade[numStudents] = 3;
			}
		}
		return curveGrade;
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
Jaylen Quizon
Project 4

GRADES:
78 88 54 51 15 17 37 

BEFORE CURVE:
0A's, 1B's, 1C's, 0D's, 5F's 
Time for a $15 party!

AFTER CURVE:
1A's, 1B's, 0C's, 5D's, 0F's 
Time for a $30 party!

------------
Test Case 2:
------------
Jaylen Quizon
Project 4

GRADES:
58 62 37 88 28 85 42 

BEFORE CURVE:
0A's, 2B's, 0C's, 1D's, 4F's 
Time for a $20 party!

AFTER CURVE:
2A's, 0B's, 1C's, 4D's, 0F's 
Time for a $45 party!

******************************************************************************/