import java.util.Scanner;
/** Ex.. 6.7. to 6.9
	The aim of these exercise is to write and understand the flow of recursive methods
*/
public class Recursive{
	//Some Recursive Methods
	/**Calculates the sum of odd integers from one to a given odd integer n
	@param n an odd integer to which we want to add odd numbers from 1 to.
	@return the sum of odd integers from 1 to n.
	*/
	private static Scanner scan = new Scanner(System.in);
	static int oddSum(int n){
		int sum = 0;
		if(n % 2 !=0){
			if(n<=0){
				return 0;
			}
			else{
				sum = n + oddSum(n-2);
				System.out.println(n);
				return sum;
			}
		}
		else{
			System.out.println(n + " is an even number.\nEnter an odd integer");
		}
		return sum;
	}
	//A method for the ackerman Function
	static int ack(int m, int n){
		int ackValue = 0;
		if(m==0){
			ackValue += n+1;
		}
		else if(m>0 && n==0){
			ackValue += ack((m-1),1);

		}
		else if(m>0 && n>0){
			ackValue += ack((m-1),ack(m,n-1));
		}

		return ackValue;
	}
	//A Recursive power function
	static double power(double x, int n){
		double solution = 0.0; //Math.pow(x,n);
		if(n==0){
			return 1;
		}
		double powOfHalfN = power(x,(n/2));
		//For odd numbers
		 if (n%2 != 0){
			System.out.println("x is: "+ x);
			System.out.println("n is: "+ n);
			//solution = x * (power(x,n-1));
			solution = x*(powOfHalfN *powOfHalfN);
			return solution;
		}
		//For even numbers
		else if(n%2==0){
			//solution = power(x,n/2) * power(x,n/2);
			System.out.println("x is: "+ x);
			System.out.println("n is: "+ n);
			solution = powOfHalfN * powOfHalfN;
			return solution;
		}

		return solution;
	}
	public static void main(String[] args){
		//Value for the oddSum method
		System.out.println("For the oddSum function Enter an odd integer for n: ");
		int c = scan.nextInt();
		System.out.println("The sum is:"+oddSum(c));

		//Values for the ack function;
		System.out.println("Next is the Ackerman function.                                                                                                           \nN/B: The Ackerman function gets large quickly.                                                                                          \nHence, Use small values for m and n to avoid overflow.");
		System.out.println("Enter an integer for m: ");
		int m = scan.nextInt();
		System.out.println("Enter an integer for n: ");
		int n = scan.nextInt();
		System.out.println(ack(m,n));
		//Values for the power function
		System.out.println("You are about to use the power function");
		System.out.println("Enter x (It can be a decimal): ");
		double x = scan.nextDouble();
		System.out.println("Enter n: ");
		int a = scan.nextInt();
		System.out.println(power(x,a));
	}
}