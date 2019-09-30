package SortingPrograms;

public class MergeSort_String {
	String[] myArray;
	int[] tempArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[] { "bbb", "zzz", "ppp", "ggg", "iii", "xxx", "aaa" };
		System.out.println("string list is:");
		for (String i : str) {
			System.out.print(i + " ");
		}

		MergeSort_String ms = new MergeSort_String();
		ms.mergeSort(str, 0, str.length - 1);
		System.out.println("now list is:");
		for (String i : str) {
			System.out.print(i + " ");
		}
	}

	private void mergeSort(String[] str, int low, int hi) {
		// TODO Auto-generated method stub
		if (low == hi) {
			return;
		}
		int mid = (low + hi) / 2;
		// sort the first and the second half
		mergeSort(str, low, mid);
		mergeSort(str, mid + 1, hi);
		merge(str, low, mid, hi);
	}

	private void merge(String[] str, int low, int mid, int hi) {
		// TODO Auto-generated method stub
		int n = hi - low + 1;
		String[] b = new String[n];
		int i1 = low;
		int i2 = mid + 1;
		int j = 0;
		while (i1 <= mid && i2 <= hi) {
			if (str[i1].compareTo(str[i2]) < 0) {
				b[j] = str[i1];
				i1++;
			} else {
				b[j] = str[i2];
				i2++;
			}
			j++;
		}
		while (i1 <= mid) {
			b[j] = str[i1];
			i1++;
			j++;
		}
		while (i2 <= hi) {
			b[j] = str[i2];
			i2++;
			j++;
		}

		for (j = 0; j < n; j++) {
			str[low + j] = b[j];
		}
	}
}
