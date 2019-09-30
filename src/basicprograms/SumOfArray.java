package basicprograms;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 10, 20, 30, 40 };
		int sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
