package SortingPrograms;

public class MergeSort_Inthger {
	int[] myArray;
	int[] tempArr;
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 3, 6, 5, 4, 1, 9, 8, 7 };
		System.out.println("list is:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		MergeSort_Inthger ms = new MergeSort_Inthger();
		ms.sort(arr);
		System.out.println("now list is:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		this.myArray = arr;
		n = arr.length;
		this.tempArr = new int[n];
		divideArray(0, n - 1);
	}

	private void divideArray(int low, int hi) {
		// TODO Auto-generated method stub
		if (low < hi) {
			int mid = low + (hi - low) / 2;

			divideArray(low, mid);
			divideArray(mid + 1, hi);

			mergeArray(low, mid, hi);
		}
	}

	private void mergeArray(int low, int mid, int hi) {
		// TODO Auto-generated method stub
		for (int i = low; i <= hi; i++) {
			tempArr[i] = myArray[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= hi) {
			if (tempArr[i] <= tempArr[j]) {
				myArray[k] = tempArr[i];
				i++;
			} else {
				myArray[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			myArray[k] = tempArr[i];
			k++;
			i++;
		}
	}
}
