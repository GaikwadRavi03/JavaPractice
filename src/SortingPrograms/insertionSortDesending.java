package SortingPrograms;

public class insertionSortDesending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 5, 4, 10, 1, 6, 2 };
		System.out.println("before insertion  sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		insertionsortdesc(arr);
		System.out.println("after insertion  sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void insertionsortdesc(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		for (int i = 1; i < n; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
