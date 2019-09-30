package basicprograms;

import java.util.Random;

public class SumOfTwoDices {
	public static void main(String args[]) {
		Random rand = new Random();

		int a = rand.nextInt(6) + 1;
		int b = rand.nextInt(6) + 1;

		System.out.println("SUM : " + (a + b));
	}
}
