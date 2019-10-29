package basicprograms;

public class palindromeReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcabc", b = "";
		StringBuffer sb1 = new StringBuffer();
		sb1.append(a);
		StringBuffer sb2 = new StringBuffer();
		sb2 = sb1.reverse();
		if (sb1.equals(sb2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
