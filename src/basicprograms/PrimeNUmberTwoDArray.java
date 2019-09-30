package basicprograms;

public class PrimeNUmberTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] obj = new Object[11][26];
		obj[0][0] = "------Range--------";
		obj[0][1] = "------prime Numbers--------";
		obj[1][0] = "-----[  0-100]------";
		obj[2][0] = "-----[101-200]------";
		obj[3][0] = "-----[201-300]------";
		obj[4][0] = "-----[301-400]------";
		obj[5][0] = "-----[401-500]------";
		obj[6][0] = "-----[501-600]------";
		obj[7][0] = "-----[601-700]------";
		obj[8][0] = "-----[701-800]------";
		obj[9][0] = "-----[801-900]------";
		obj[10][0] = "----[901-1000]------";

		int rowIndex = 1;
		int columnIndex = 1;
		int range = 100;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i) && i <= range) {
				obj[rowIndex][columnIndex] = i;
				columnIndex++;
			}
			if (i > range) {
				range = range + 100;
				columnIndex = 1;
				rowIndex++;
			}
		}
		// display 2d array
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 26; j++) {
				if (obj[i][j] != null)
					System.out.print(obj[i][j] + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0)
				return false;
			i++;
		}
		return true;
	}
}
