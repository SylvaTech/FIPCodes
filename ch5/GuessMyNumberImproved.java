import java.util.Scanner;
import java.util.Random;
/** Ex. 5.7.
	This Program is a modification of the "Guess My Number Game" written in Ex 3.4 (GuessMyNumber)
*/
public class GuessMyNumberImproved{
	private static Scanner scan = new Scanner(System.in);
	private static Random random = new Random();

	private static void guessNumber(){
		System.out.print("Type a number: ");
		int guessed = scan.nextInt();
		System.out.println("Your guess is "+guessed);
		checkGuess(guessed);
		//Generate a number
		int number = random.nextInt(100)+1;
		System.out.println("The number is "+number);
		if(number != guessed){
			int difference = Math.abs(guessed - number);
			System.out.println("You were of by: "+difference);
			System.out.println("\nTry Again");
			guessNumber();

		}
		else{
			System.out.println("Congrats! You guessed right");
		}

	}
	private static void checkGuess(int guessed){
		if(guessed > 100){
			System.out.println("That guess is too high");
			System.out.println("Do not guess a number above 100");
			System.out.println("\nTry Again");
			guessNumber();
		}
		else if(guessed < 1){
			System.out.println("That guess is too low");
			System.out.println("Do not guess a number below 1");
			System.out.println("\nTry Again");
			guessNumber();
		}
	}

	public static void main (String[] args){

		System.out.println("I'm thinking of a number between 0 and 100 (including both)\ncan you guess the number?");

			guessNumber();


	}
}