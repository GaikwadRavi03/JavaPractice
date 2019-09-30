package SortingPrograms;

public class BinarySearch_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int item = 2;
		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] == item) {
				System.out.println(arr[middle] + ": found at index : " + middle);
				break;
			} else if (arr[middle] < item) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("not found item");
		}
	}
}
