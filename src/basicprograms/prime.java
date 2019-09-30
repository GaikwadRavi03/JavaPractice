package basicprograms;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int num, flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enetr the no:");
		num = input.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (num == 0) {
			System.out.println("no is not prime nor composite");
		} else {
			if (flag == 0)
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
	}
}
