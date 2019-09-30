package Pattern;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, value = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
	}
}
//1 
//2 3 
//4 5 6 
//7 8 9 10
