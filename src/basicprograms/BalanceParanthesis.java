package basicprograms;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParanthesis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stk = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the expression:");
		String str = sc.next();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (ch == '(')
				stk.push(i);
			else if (ch == ')') {
				try {
					int p = stk.pop() + 1;
					System.out.println("balanced");
				} catch (Exception e) {
					System.out.println("unBalaned");
				}
			}
		}
		while (!stk.isEmpty())
			System.out.println((stk.pop() + 1) + " is unBalaned");
	}
}
