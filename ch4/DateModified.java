public class DateModified{
	/** Ex 4.3.
		The purpose of this exercise is to take code from a previous
		exercise (Ex 2.2) and encapsulate it in a method that takes parameters.
	*/
	public static void printAmerican(String day, String month, String date, int year){
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year + ".");

	}
	public static void main(String[] args){
		String day = "Monday";
		String date = "8th";
		String month = "January";
		int year = 2018;

		//Invoking the created methods
		printAmerican(day,month,date,year);
		System.out.println("\n***   ***   ***\n");
		printEuropean(day,date,month,year);


	}//End of the main Method
	private static void printEuropean(String day,String date, String month, int year){
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
	}
}