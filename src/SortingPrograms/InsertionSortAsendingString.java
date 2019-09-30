package SortingPrograms;

public class InsertionSortAsendingString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "AAA", "DDD", "CCC", "FFF", "BBB", "EEE" };
		System.out.println("before the insertion sort:");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

		insertionsort(str);

		System.out.println("after the insertion sort:");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}

	private static void insertionsort(String[] str) {
		// TODO Auto-generated method stub
		int n = str.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareToIgnoreCase(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

}
