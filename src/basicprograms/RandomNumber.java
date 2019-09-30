package basicprograms;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		int maxRange;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("entrer the  max range :");
		maxRange = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.print(rand.nextInt(maxRange) + " ");
		}
		
	}
}
