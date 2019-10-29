
package basicprograms;

import java.util.Scanner;

public class revTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, rev = 0, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no:");
		num = sc.nextInt();
		while (num > 0) {
			d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		System.out.println("the rev no is: " + rev);
	}
}
