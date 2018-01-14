import java.util.Scanner;
/** Ex. 7.4 - 7.5.
*/
public class Factorial{
	static Scanner scan = new Scanner(System.in);
	//method for calculating the factorial function
	private static int calcFactorial(int n){
		int factorial = 1;
		if(n == 0){
			factorial = 1;
		}
		else{
			while(n!=0){
				factorial *= n;
				n--;
				//System.out.println(n+"! is "+factorial);
			}
		}
		return factorial;
	}
	//method for calculating the exponential function
	static double myexp(double x, int n){
		double exp = 0;

	     for(int i = 0; i < n; i++){
	         exp += Math.pow(x, i)/(calcFactorial(i));
	     }

	     return exp;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	/*	//The Factorial Function
		System.out.println("Enter a number to find its factorial: ");
		int n  = scan.nextInt();
		System.out.println(n+"! = "+calcFactorial(n));

		//The exponential Function
		System.out.println("Enter the  number you want to expand exponentially: ");
		double x = scan.nextDouble();
		System.out.println("Enter the num of times to expand: ");
		int j = scan.nextInt();

		double exp = myexp(x,j);
		System.out.println("The exponential expansion is: "+exp);*/
		//check(1);

		////////////////////////////////////////////////////////////////////

		/*I know these does the work but what really is the importance of this whole maths?
		It's just bursting my brain
		*/

		/*for (double i=0.1; i<=100; i*=10){
		      check(i); // 1+14 -> 1+15 -> 5+1 -> ?
		   }*/
		    for (double i=-0.1; i>=-100; i*=10){
		       check(i); // 1+15 -> 1+15 -> ? -> ?
		    }

		 ////////////////////////////////////////////////////////////////

	}
	 public static void check(double x){
	      int i = 28;
	      // double interval = 0;
	      // do{
	         // i++;
	         // interval = Math.abs(myexp(x,i) - Math.exp(x));
	         // System.out.println(i+"\t"+interval);
	      // }
	      // while (interval > 0.0000000000000001);
	      System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));
   }
}