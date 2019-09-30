package basicprograms;

class SecondLargest {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 30, 50, 40, 20, 60 };
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("list is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println();
		System.out.println("the 2nd largest element is: " + secondLargest);
	}
}