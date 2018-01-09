/**Ex. 6.2.
	This program is about writing a method that returns a boolean value.
*/
public class BooleanMethod{
	/**
		Tests whether n is divisible by m
		@param n the integer to divide
		@param m the divisor
		@return true if n is divisble by m, false otherwise
	*/
	public static boolean isDivisible(int n, int m){
		if(n%m == 0){
			System.out.println(n + " is divisible by "+m);
			return true;
		}
		else{
			System.out.println(n + " is not divisible by "+m);
			return false;
		}

	}
	public static void main(String[] args){
		isDivisible(4,2);
		isDivisible(7,5);

	}
}