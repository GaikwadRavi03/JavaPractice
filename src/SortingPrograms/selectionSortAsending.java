package SortingPrograms;

public class selectionSortAsending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 5, 90, 35, 45, 150, 3 };
		System.out.println("after the bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		selectionsort(arr);

		System.out.println("before the bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionsort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

	}

}
