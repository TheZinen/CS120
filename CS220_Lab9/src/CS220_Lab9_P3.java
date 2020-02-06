import java.util.Scanner;

public class CS220_Lab9_P3
{
	public enum shape {SQUARE, PARALLELOGRAM, TRIANGLE};
	public static void printArea(shape shapeType, double shapeBase, double shapeHeight) {

		switch(shapeType) {
		case SQUARE:
			double shapeArea = shapeBase * shapeHeight;
			System.out.println("The " + shapeType + " with base of " + shapeBase + " and height of "
					+ shapeHeight + " has an area of " + shapeArea);
			break;
		case PARALLELOGRAM:
			shapeArea = shapeBase * shapeHeight;
			System.out.println("The " + shapeType + " with base of " + shapeBase + " and height of "
					+ shapeHeight + " has an area of " + shapeArea);
			break;
		case TRIANGLE:
			shapeArea = (shapeBase * shapeHeight) * .50;
			System.out.println("The " + shapeType + " with base of " + shapeBase + " and height of "
					+ shapeHeight + " has an area of " + shapeArea);
			break;

		}
	}

	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 9, Problem 3");
		System.out.println("");

		// Your code should go below this line
		{
			Scanner scan = new Scanner(System.in);

			System.out.println("Please enter a shape (e.g. Square, Parallelogram, Triangle): ");
			char shapeType = scan.next().charAt(0);
			System.out.println("Please enter the base value: ");
			double shapeBase = scan.nextDouble();
			System.out.println("Please enter the height value: ");
			double shapeHeight = scan.nextDouble();


			if (shapeType == 'S')
				printArea(shape.SQUARE, shapeBase , shapeHeight);
			else if (shapeType == 'P')
				printArea(shape.PARALLELOGRAM, shapeBase, shapeHeight);
			else
				printArea(shape.TRIANGLE, shapeBase, shapeHeight);

		}
	}
}