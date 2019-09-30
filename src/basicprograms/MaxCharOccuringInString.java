package basicprograms;

public class MaxCharOccuringInString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ravi gaikwad";
		System.out.println("The given string is: " + str);
		System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str));
	}

	private static char MaxOccuringChar(String str) {
		// TODO Auto-generated method stub
		int N = 256;
		int ch[] = new int[N];
		int l = str.length();
		for (int i = 0; i < l; i++) {
			ch[str.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for (int i = 0; i < l; i++) {
			if (max < ch[str.charAt(i)]) {
				max = ch[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}
