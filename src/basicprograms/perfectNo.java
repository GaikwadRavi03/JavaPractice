package basicprograms;

public class perfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28;
		boolean b = isperfect(n);
		if (b)
			System.out.println("perfect");
		else
			System.out.println("not perfect");
	}

	public static boolean isperfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (n == sum)
			return true;
		return false;
	}

}
