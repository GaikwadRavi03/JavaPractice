package basicprograms;

public class swap {
	public static void main(String[] args) {
		int a = 5, b = 6;
		System.out.println("a is:" + a + " b is:" + b);
		b = a + b - (a = b);
		System.out.println("a is:" + a + " b is:" + b);
	}
}
