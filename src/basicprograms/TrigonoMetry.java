package basicprograms;

import java.util.Scanner;

public class TrigonoMetry {
	public static void main(String args[]) {
		double d;
		System.out.println("Enter angle in degrees : ");
		Scanner sc = new Scanner(System.in);
		d = sc.nextDouble();

		double r = Math.toRadians(d);

		System.out.print("Sin : " + Math.sin(r) + "\nCos : " + Math.cos(r) + "\nTan : " + Math.tan(r));
		sc.close();
	}
}