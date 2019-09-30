package SortingPrograms;

public class bubbleSortDesending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 5, 90, 35, 150, 45, 3 };
		System.out.println("before bubble desending sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		bubblSortDesc(arr);
		System.out.println("after bubble desending sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubblSortDesc(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
