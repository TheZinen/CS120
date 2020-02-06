import java.util.Scanner;

public class CS220_Lab10
{
	public static char[] strToCharArray(String usrStr) {
		char [] charArray = new char [usrStr.length()];
			for (int i = 0; i < charArray.length; i++){
				charArray[i] = usrStr.charAt(i);
			}
		return charArray;
	}
	
	public static void reversePrint(char [] charArray) {
		
		for (int i = charArray.length; i > 0; i--){
			System.out.print(charArray[i-1]);
		}
	}
	
	public static void main(String[] args)
	{
		// Your program should always output your name and the lab/problem
		// number. DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Jaylen Quizon");
		System.out.println("Lab 10, Problem X");
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String userInput = scan.nextLine();
		reversePrint(strToCharArray(userInput));
	}
}