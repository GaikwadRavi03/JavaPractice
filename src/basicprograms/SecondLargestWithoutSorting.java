package basicprograms;

public class SecondLargestWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 80, 10, 30, 20, 50, 60, 40, 70 };
		int largest = Integer.MIN_VALUE;
		int Secondlargest = Integer.MIN_VALUE;
		System.out.println("list is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				Secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > Secondlargest) {
				Secondlargest = arr[i];
			}
		}
		System.out.println("2nd largest element is: " + Secondlargest);
	}
}
