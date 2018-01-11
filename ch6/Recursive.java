/** Ex.. 6.7. to 6.9
	The aim of these exercise is to write and understand the flow of recursive methods
*/
public class Recursive{
	//Some Recursive Methods
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
	//A method for the power function
	static double power(double x, int n){
		double solution = Math.pow(x,n);
		if(n==0){
			//solution = 1;
			return 1;
		}
		else if (n>0){
			System.out.println("x is: "+ x);
			System.out.println("n is: "+ n);
			solution = x * (power(x,n-1));
			return solution;
		}

		return solution;
	}
	public static void main(String[] args){
		//System.out.println("The sum is:"+oddSum(7));
		//System.out.println(ack(20,1));
		System.out.println(power((1.0/3.0),2));
	}
}