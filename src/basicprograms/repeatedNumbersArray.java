package basicprograms;

public class repeatedNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 4, 7, 5, 1, 4, 3, 9, 3 };
		myRepeatedArray(arr);
	}

	private static void myRepeatedArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
