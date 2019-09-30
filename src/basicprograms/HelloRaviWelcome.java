package basicprograms;

public class HelloRaviWelcome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello ravi welcome";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		String words[] = str.split(" ");
		String reverseword = " ";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseword += sb.toString() + " ";
		}
		return reverseword.trim();
	}

}
