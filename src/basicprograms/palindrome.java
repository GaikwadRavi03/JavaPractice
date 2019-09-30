package basicprograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0, num, d, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the to cheach palindrome:");
		num = sc.nextInt();
		temp = num;
		while (num > 0) {
			d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		if (temp == rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
