package basicprograms;

import java.util.Scanner;

public class sumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no:");
		num = sc.nextInt();
		while (num > 0) {
			d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		System.out.println("sum of no is:" + sum);
	}

}
