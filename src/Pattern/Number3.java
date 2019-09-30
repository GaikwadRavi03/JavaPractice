package Pattern;

public class Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
//1 
//2 2 
//3 3 3 
//4 4 4 4