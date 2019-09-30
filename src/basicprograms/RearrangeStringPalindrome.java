package basicprograms;

import java.util.Arrays;

//check if char of a given string can be rearranged to form a palindrome.
public class RearrangeStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcab";
		if (isPalindrome(str)) {
			System.out.println("palindrome arranged");
		} else {
			System.out.println("palindrome not arranged");
		}
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		int no_of_char = 256;
		int count[] = new int[no_of_char];
		Arrays.fill(count, 0);
		for (int i = 0; i < str.length(); i++)
			count[(int) (str.charAt(i))]++;

		int odd = 0;
		for (int i = 0; i < no_of_char; i++) {
			if ((count[i] & 1) == 1)
				odd++;
			if (odd > 1)
				return false;
		}

		return true;
	}

}
