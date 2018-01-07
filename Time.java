public class Time{

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
		int elapsedHour = (hour2 - hour);
		int elapsedMinutes =(minute2 - minute);
		int elapsedSeconds = (second2 - second);
		String elapsedTime = elapsedHour +":"+ elapsedMinutes + ":" + elapsedSeconds;
		System.out.println("The elapsed time since this exercise is: " + elapsedTime);
		//To calculate percentage of day spent
		int totalSecsInDay = secFromMidnight + secToMidnight;
		double percentageSpent = (double)(100 * secFromMidnight) / totalSecsInDay;
		System.out.printf("The percentage of the day spent so far is: %.2f", percentageSpent);
		System.out.println("%");

	}
}