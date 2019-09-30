package basicprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times;
		System.out.println("enter the number of toss the coin: ");
		Scanner sc = new Scanner(System.in);
		times = sc.nextInt();
		tossCoin(times);
	}

	private static void tossCoin(int times) {
		// TODO Auto-generated method stub
		double head = 0;
		for (int i = 0; i < times; i++) {
			if (Math.random() > 0.5) {
				head++;
			}
		}
		System.out.println(head);
		System.out.println("head % =" + (float) (head / times) * 100);
		System.out.println("tails % =" + (float) (times - head) / times * 100);
	}
}
