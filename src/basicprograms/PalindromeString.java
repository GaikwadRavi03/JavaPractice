package basicprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = sc.next();
		int n = str.length();
		String rev = "";

		for (int i = n - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
