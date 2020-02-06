import java.util.Scanner;

public class StringParsingDemo 
{

	public static void main(String[] args) 
	{
		// chars: |w|w|w|.|a|p|u|.|e|d|u
		// index: |0|1|2|3|4|5|6|7|8|9|10
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a website: ");
		String url = scan.nextLine();
		
		int begIndex = url.indexOf('.');
		int endIndex = url.lastIndexOf('.');
		String domainName = url.substring(begIndex + 1, endIndex);
		System.out.println("Length of " + url + ":" + url.length());
		System.out.println("Original url: " + url);
		System.out.println("Parsed domain name: " + domainName);

	}

}
