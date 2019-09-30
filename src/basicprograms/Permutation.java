package basicprograms;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		str = sc.next();
		int n = str.length();
		Permutation p1 = new Permutation();
		p1.permute(str, 0, n - 1);
	}

	private void permute(String str, int first, int last) {
		// TODO Auto-generated method stub
		if (first == last) {
			System.out.println(str);
		} else {
			for (int i = first; i <= last; i++) {
				str = swap(str, first, i);
				permute(str, first + 1, last);
				str = swap(str, first, i);
			}
		}
	}

	private String swap(String str, int first, int i) {
		// TODO Auto-generated method stub
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[first];
		ch[first] = ch[i];
		ch[i] = temp;
		return String.valueOf(ch);
	}
}
