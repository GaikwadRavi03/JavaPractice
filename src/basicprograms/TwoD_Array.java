package basicprograms;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoD_ArrayForInteger();
		TwoD_ArrayForDouble();
		TwoD_ArrayForString();
	}

	private static void TwoD_ArrayForInteger() {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integers");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void TwoD_ArrayForDouble() {
		// TODO Auto-generated method stub
		double drr[][] = new double[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal integers");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				drr[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(drr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void TwoD_ArrayForString() {
		// TODO Auto-generated method stub
		String str[][] = new String[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				str[i][j] = sc.next();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}
}
