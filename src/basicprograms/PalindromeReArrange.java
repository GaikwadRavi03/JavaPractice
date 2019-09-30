package basicprograms;

public class PalindromeReArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabc";
		if (ispalindrome(str))
			System.out.println("yes");
		else
			System.out.println("no");
	}

	private static boolean ispalindrome(String str) {
		// TODO Auto-generated method stub
		int N = 256;
		int ch[] = new int[N];
		int l = str.length();
		for (int i = 0; i < l; i++) {
			ch[str.charAt(i)]++;
		}
		int odd = 0;
		for (int i = 0; i < N; i++) {
			if ((ch[i] & 1) == 1)
				odd++;

			if (odd > 1)
				return false;
		}
		return true;
	}
}


