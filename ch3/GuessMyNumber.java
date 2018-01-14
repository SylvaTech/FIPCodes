import java.util.Scanner;
import java.util.Random;

/** Ex 3.4.
	This program matches a user's entered value against an auto-generated number
	and returns the difference between the two numbers if they do not match.
*/
public class GuessMyNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("I'm thinking of a number between 0 and 100 (including both)\ncan you guess the number?");
		System.out.println("Type a number: ");
		int guessed = scan.nextInt();
		System.out.println("Your guess is "+guessed);
		//Generate a number
		int number = random.nextInt(100)+1;
		System.out.println("The number is "+number);

		int difference = Math.abs(guessed - number);
		System.out.println("You were of by: "+difference);



	}
}