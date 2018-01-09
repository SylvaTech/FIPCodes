/**Ex 6.2.
	The point of this exercise is to use conditional statements to write a value method.
	This program checks if three given sticks of specified lengths
	can be combined together form a triangle.
*/
public class FormTriangle{

	/**
		Checks if the three lengths can build a triangle
		@param a one of the lengths of the intended triangle
		@param b the other length for the intended triangle
		@param c the other side/length of the intended triangle
		@return true if the lengths can form a triangle, fale otherwise
	*/
	public static boolean isTriangle(int a, int b, int c){
		int sumAB = a+b;
		int sumAC = a+c;
		int sumBC = b+c;
		if(c > sumAB || b > sumAC || a > sumBC){
			System.out.println(" oops! these lengths cannot form a Triangle\n");
			return false;
		}
		else{
			System.out.println(" Hooray! These lengths can form a triangle.\n ");
			return true;
		}
	}

	public static void main(String[] args){

		isTriangle(1,2,3);
		isTriangle(2,3,6);

	}
}