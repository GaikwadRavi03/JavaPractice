package basicprograms;

//string sub string.
public class Combination {
	public static void main(String[] args) {
		String str = "fun", sub;
		int n = str.length();
		System.out.println("given string is:" + str);
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				sub = str.substring(i, i + j);
				System.out.println(sub);
			}
		}
	}
}
