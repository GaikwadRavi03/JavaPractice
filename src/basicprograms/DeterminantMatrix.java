package basicprograms;

import java.util.Scanner;

public class DeterminantMatrix {

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
		int det, x, y, z;
		x = (matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]));
		y = (matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]));
		z = (matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]));
		det = x - y + z;
		System.out.println("modulus of given matrix is:" + det);
	}
}
