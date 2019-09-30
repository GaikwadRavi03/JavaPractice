package basicprograms;

import java.util.Scanner;

public class sqrt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num: ");
		c = sc.nextInt();
		sqrt(c);
	}

	private static void sqrt(double c) {
		// TODO Auto-generated method stub
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}
		System.out.println(t);
	}
}
