package basicprograms;

import java.util.Scanner;

public class TransposeAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3, n = 3;
		int matrix[][] = new int[m][n];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("our matrix is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		int transopse[][] = new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				transopse[j][i] = matrix[i][j];
			}
		}
		System.out.println("our transopse matrix is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(transopse[i][j] + " ");
			}
			System.out.println();
		}
	}
}
