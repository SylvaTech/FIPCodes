public class CheckingPrintf{
	/** This program shows that the compiler does not check
		the format string when we use printf method. This program compiles successfully
		but crashes i.e throws exception at runtime
	*/
	public static void main(String[] args){
		int number = 25;
		System.out.printf("%f \n", number);
		double number2 = 2.5;
		System.out.printf("%d \n", number2);
		System.out.printf("%d %f",number);
	}
}