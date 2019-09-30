package basicprograms;

public class ConvertStringToIntWitoutParseInt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "786786";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = (sum * 10) + (int) str.charAt(i) - (int) '0';
		}
		System.out.println(sum);
	}
}
