package basicprograms;

//second largest element in array..
public class secondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("second largest no is:" + findNumber(arr));
	}

	private static int findNumber(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr[n - 2];
	}
}
