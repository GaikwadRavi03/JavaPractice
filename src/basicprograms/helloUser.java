package basicprograms;

import java.util.Scanner;

public class helloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user name");
		String str = sc.nextLine();
		System.out.println("hello " + str + ", how are you?");
	}

}
