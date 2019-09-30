package basicprograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no: ");
		num = sc.nextInt();

		powerOfTwo(num);
	}

	private static void powerOfTwo(int num) {
		// TODO Auto-generated method stub
		int power = 1;
		for (int i = 0; i <= num; i++) {
			System.out.println("2^" + i + "=" + power);
			power *= 2;
		}
	}
}
