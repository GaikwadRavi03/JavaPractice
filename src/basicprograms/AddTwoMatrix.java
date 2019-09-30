package basicprograms;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2, n = 2;
		Scanner sc = new Scanner(System.in);
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.println("enter for first matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				first[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter for Second matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				second[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("sum is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
