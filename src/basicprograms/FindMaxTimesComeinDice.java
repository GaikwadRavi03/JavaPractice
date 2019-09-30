package basicprograms;

import java.util.Random;

public class FindMaxTimesComeinDice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int faces = 6, count = 0, max = 0, index = 0;
		int times = 8;
		int arr[] = new int[10];
		Random r = new Random();
		System.out.println("dice no. are: ");
		for (int i = 1; i <= times; i++) {
			int a = r.nextInt(faces) + 1;
			arr[i] = a;
			System.out.print(arr[i] + " ");
		}
		int n = arr.length;
		System.out.println();
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				if (count > max) {
					max = count;
					index = i;
				}
			}
		}
		System.out.println("max no. is: " + arr[index]);
	}
}
