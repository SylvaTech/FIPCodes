
import java.util.Scanner;
/**
	This program gets the full time from the number of seconds given to it
*/
public class SecondsToTime{
	private static final int SEC_IN_HOUR = 3600;
	private static final int SEC_IN_MINUTE = 60;

	public static void main(String[] args){
		int seconds,hour,minutes,remSeconds;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of seconds \nI will display full time for you");
		seconds = scan.nextInt();

		//Breaking down to component hours, minutes and seconds
		hour = (seconds / SEC_IN_HOUR);
		int remainder = (seconds % SEC_IN_HOUR);
		minutes = (remainder/SEC_IN_MINUTE);
		remSeconds = (remainder % SEC_IN_MINUTE);
		System.out.print(seconds + " Seconds translates to: ");
		System.out.println(hour +" hour(s) "+minutes + " minute(s) " + remSeconds+ " second(s)" );

	}
}