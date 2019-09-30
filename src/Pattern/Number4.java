package Pattern;

public class Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
//1 
//2 1 
//3 2 1 
//4 3 2 1 