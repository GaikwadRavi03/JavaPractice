package basicprograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] str1 = { 'r', 'a', 'v', 'e', 'e' };
		char[] str2 = { 'v', 'e', 'e', 'r', 'a' };
		if (isAnagram(str1, str2)) {
			System.out.println("strings are anagram");
		} else {
			System.out.println("strings are not anagrams");
		}
	}

	private static boolean isAnagram(char[] str1, char[] str2) {
		// TODO Auto-generated method stub
		int n1 = str1.length;
		int n2 = str2.length;
		
		if (n1 != n2)
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i <n1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}
		return true;
	}
}
