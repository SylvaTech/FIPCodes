import java.util.Scanner;
/** Ex. 7.2.
	This exercise is about automating calculation of square root
	using guessing technique with the use of loop
*/

public class ComputeRoot{

	/**
	uses guess technique to compute the square root of the given number
	@param a the number whose square root you want to calculate type double
	@return the closest square root of the entered number with 0.0001 precision
	*/

	public static double SquareRoot(double a){
		double initGuess = (a/2.0);
		System.out.println(initGuess + " is the initial guess");
		double guessResult = (initGuess + (a/initGuess))/2.0;
		System.out.println(guessResult + " is the first iteration");

		while(Math.abs(initGuess-guessResult)>0.0001){

			initGuess = guessResult;
			guessResult = (initGuess+(a/initGuess))/2.0;
			//System.out.println(initGuess+ " is the current but not correct root");
			//System.out.println(guessResult+ " is the closer but not correct root");
		}
		//If you want to see verbosed form of the iterations you can uncommment the above two lines to see what happens at each step
		System.out.println(guessResult + " is the closest correct root of the number "+ a);
		return guessResult;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer whose square root you want to calculate: ");
		double a = scan.nextDouble();
		SquareRoot(a);


	}
}