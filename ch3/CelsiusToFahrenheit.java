
import java.util.Scanner;
/**
	(Ex 3.2) This program converts celsius temperature Fahrenheit
*/
public class CelsiusToFahrenheit{
	public static void main(String[] args){
		double tempInCelsius;
		double tempInFahrenheit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius");
		tempInCelsius = scan.nextDouble();
		tempInFahrenheit = (tempInCelsius * (9/5) + 32);
		System.out.printf("%.1f C = %.1f F\n", tempInCelsius, tempInFahrenheit);



	}
}