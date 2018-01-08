public class Time{
	/** (Ex 2.3)The point of this exercise is to (1) use some of the arithmetic
	operators, and (2) start thinking about compound entities (like time of day)
	that are represented with multiple values.
	*/
	final static int SEC_IN_MIN = 60;
	final static int SEC_IN_HOUR = SEC_IN_MIN * 60; //this means 60secs *60mins = 3,600secs in hour

	public static void main (String[] args){
		int hour, minute, second;
		hour = 22;
		minute = 26;
		second = 20;
		//Calculating the number of seconds since midnight

		int secFromMidnight = (hour * SEC_IN_HOUR) + (minute * SEC_IN_MIN) + second;
		int secToMidnight = (24 * SEC_IN_HOUR) - secFromMidnight; //i.e the number of seconds remaining in the day

		System.out.println("The current time is "+ hour + ":" + minute + ":" + second);
		System.out.println("The number of seconds since midnight is: "+ secFromMidnight);
		System.out.println("The number of seconds remaining in the day is: "+ secToMidnight);

		int hour2 = 22;
		int minute2 = 53;
		int second2 = 12;
		int elapsedHour = Math.abs(hour2 - hour);
		int elapsedMinutes = Math.abs(minute2 - minute);
		int elapsedSeconds = Math.abs(second2 - second);
		String elapsedTime = elapsedHour +" hour(s) "+ elapsedMinutes + " minutes(s) " + elapsedSeconds + " second(s)";
		System.out.println("The elapsed time since this exercise is: " + elapsedTime);
		//To calculate percentage of day spent
		int totalSecsInDay = secFromMidnight + secToMidnight;
		double percentageSpent = (double)(100 * secFromMidnight) / totalSecsInDay;
		System.out.printf("The percentage of the day spent so far is: %.2f", percentageSpent);
		System.out.println("%");

	}
}