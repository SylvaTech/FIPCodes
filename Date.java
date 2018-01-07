public class Date{
	/** This exercise is aimed at using string concantenation
		and to practice developing programs gradually by adding few statements
	*/
	public static void main(String[] args){
		System.out.println("This is chapter two exercise");
		String day, date, month;
		int year;

		day = "Friday";
		date = "6th";
		month = "January";
		year = 2018;

		//Printing out the variables to ensure correctness
		System.out.println("The day is " + day);
		System.out.println("The date is " + date);
		System.out.println("The Month is " + month);
		System.out.println("The year is " + year);

		//Displaying the date in American format
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year + ".");
		//Displaying the date in European format
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);


	}
}