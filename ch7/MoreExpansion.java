import java.util.Scanner;
/**Ex. 7.6
*/
public class MoreExpansion{

	public static double gauss(double x, int n){
      double result = 1;
      int j = 1;
      double k = 1;
      int pre = 1; //They are initialized to 1 as multiplicative identities. initializing to 0 will not work
      for (int i=1;i<n;i++){
         result += ((pre*=-1)*(j*=x*x))/(k*=i); //((-1)^i*(x^2i))/i!.
      }
      return result;
   }
   	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x: \n");
		double x = scan.nextDouble();
		System.out.print("Enter n: \n");
		int n = scan.nextInt();
		double gaussValue = gauss(x,n);
		System.out.println("The Gauss value is: "+gaussValue);
	}
}