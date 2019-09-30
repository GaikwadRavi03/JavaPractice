package basicprograms;

public class sumOf1000PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag;
		int sum = 0;
		for (int num = 2; num <= 10; num++) {
			flag = 0;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}
