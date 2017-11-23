import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputHelper {
	public static int testUserInputInt(InputStream in,PrintStream out) {
		Scanner inInt= new Scanner(System.in);
		System.out.println("Give a number between 1 and 10");
		int input = inInt.nextInt();
		while(input<1||input>10) {
			System.out.println("Wrong number, try again.");
			input=inInt.nextInt();
		}
		return input;
	}
	
	public String testUserInputString(String displayMessage) {
		
		System.out.println(displayMessage);
		
		Scanner inString=new Scanner(System.in);
		String input = inString.nextLine();
		
		return input;
	}
}
