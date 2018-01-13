/**Ex. 7.3

*/
import java.util.Scanner;
public class IterativePower{
	private static double power(double x, int n){
		for(int i =1; i<n; i++){
			x+=x;
			//double y = x*x;
			System.out.println(x);
		}
		return x;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you want evaluate: ");
		double x = scan.nextDouble();
		System.out.print("Enter the power to which you want to raise this number: ");
		int n = scan.nextInt();
		//power(x,n);
		System.out.println(x+" raised to the power of "+n+ " is "+power(x,n));
	}
}