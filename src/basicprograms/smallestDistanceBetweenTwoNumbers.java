package basicprograms;

public class smallestDistanceBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 4, 8, 1, 6, 2, 9, 4 };
		int x = 1, y = 2;
		System.out.println(foundDistance(arr, x, y));
	}

	private static int foundDistance(int[] arr, int x, int y) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int min_dist = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (x == arr[i] && y == arr[j] || y == arr[i] && x == arr[j] && min_dist > Math.abs(i - j)) {
					min_dist = Math.abs(i - j);
				}
			}
		}
		return min_dist;
	}
}
