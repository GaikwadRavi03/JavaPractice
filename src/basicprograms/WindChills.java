package basicprograms;

import java.util.Scanner;

public class WindChills {
	public static void main(String args[]) {
		double t, v;
		System.out.println("Enter temperature in fahrenheit : ");
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextDouble();
		System.out.println("Enter speed of the wind(miles per hour) : ");
		v = scanner.nextDouble();

		if (t < 50 && (v < 120 && v > 3)) {
			double w = 35.74 + 0.6215 + (0.4275 * t + 35.75) * Math.pow(v, 0.16);
			System.out.println("\nWind Chill = " + w);

		} else {
			System.out.println(
					"\nPlease enter the temperature in less than 50 Fahrenheit\n and speed is between 3 to 120 (miles per hour)");

		}
	}
}
