/** Ex 6.4.
	This program takes three doubles and return the value of a * b + c.
	One of the purposes of this exercise is to practice pattern-matching: the ability
	to recognize a specic problem as an instance of a general category of problems.
*/
public class Multadd{
	/**
		Takes three doubles, multiply the first two and add the third to the result
		@param a required one of the values to multiply
		@param b required one of the values to multiply
		@param c required the third value to be added the multiplied values
		@return a*b+c of type double
	*/
	public static double multadd(double a, double b, double c){
		return (a*b)+c;
	}
	public static void main (String[] args){
		double test = multadd(1.0,2.0,3.0);
		System.out.println("The return value of the multadd method is: "+test);
		//Using multadd to compute the given trig function
		double theTrigFxn = (multadd(1.0,((Math.sqrt(2))/2),((Math.sqrt(2))/4)));
		System.out.printf("The value of the trig function is: %.6f\n",theTrigFxn);

		//Using multadd to solve the log function
		double sumOfLogs = multadd(1.0, Math.log10(10),Math.log10(20));
		System.out.printf("The sum of the two logs is: %.6f \n", sumOfLogs);

		//calling the expSum method
		double sum = expSum(2.0);
		System.out.printf("The result of the exponential sum function is: %.6f \n", sum);

	}
	/**Uses multadd to calculate the given exponential function
		@param x the value to be used in the exponential function
		@return the value computed from the function
	*/
	private static double expSum(double x){
		double xRaise = Math.exp(-x);
		double solution = multadd(x, xRaise,Math.sqrt(1 - xRaise)); //Using the multadd method
		return solution;

	}
}