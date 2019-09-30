package basicprograms;

import java.util.Scanner;

public class GamlingSimulator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake, goal, trails;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter stakes:");
		stake = sc.nextInt();
		System.out.println("enter goals: ");
		goal = sc.nextInt();
		System.out.println("enter no of trails: ");
		trails = sc.nextInt();
		int WinCount = 0, LossCount = 0;
		for (int i = 1; i <= trails; i++) {
			if (Math.random() > 0.5) {
				if ((stake == goal) || (stake == 0))
					break;
				WinCount++;
				stake++;
			} else {
				if ((stake == goal) || (stake == 0))
					break;
				LossCount++;
				stake++;
			}
		}
		System.out.println("win" + WinCount);
		System.out.println("loss" + LossCount);

		System.out.println("win %" + (WinCount * 100) / (WinCount + LossCount));
		System.out.println("loss %" + (LossCount * 100) / (WinCount + LossCount));
	}
}
