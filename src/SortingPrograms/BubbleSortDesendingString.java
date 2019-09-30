package SortingPrograms;

public class BubbleSortDesendingString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "AAA", "CCC", "EEE", "DDD", "BBB", "FFF" };
		System.out.println("before the bubble sort:");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

		bubblesort(str);

		System.out.println("after the bubble sort:");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

	}

	private static void bubblesort(String[] str) {
		// TODO Auto-generated method stub
		int n = str.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

}
