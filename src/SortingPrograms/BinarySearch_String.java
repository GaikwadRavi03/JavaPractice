package SortingPrograms;

public class BinarySearch_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
		String item = "AAA";
		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle] == (item)) {
				System.out.println(str[middle] + ": found at index : " + middle);
				break;
			} else if (str[middle].compareTo(item) < 0) {
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
