package basicprograms;

import java.util.Scanner;

public class SumOfFirstAndLastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, f, l, d, rev = 0, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		num = sc.nextInt();
		l = num % 10;
		while (num > 0) {
			d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		f = rev % 10;
		sum = f + l;
		System.out.println("sum of 1st and last is: " + sum);
	}
}
