package basicprograms;

import java.util.Scanner;

public class FibonacchiSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, n1 = 0, n2 = 1, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no: ");
		n = sc.nextInt();
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
}
