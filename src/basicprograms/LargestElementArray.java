package basicprograms;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 80, 50, 30, 100, 60, 40, 20 };
		int max = arr[0];
		int index = 1;
		int size = arr.length;
		for (int i = 1; i <= size - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index++;
			}
		}
		System.out.println(max);
	}
}
