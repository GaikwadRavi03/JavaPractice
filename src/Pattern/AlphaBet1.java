package Pattern;

public class AlphaBet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
//A 
//B C 
//D E F 
//G H I J