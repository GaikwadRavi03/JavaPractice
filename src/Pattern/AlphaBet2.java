package Pattern;

public class AlphaBet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			ch = 'A';
			System.out.println();
		}
	}
}
//A 
//A B 
//A B C 
//A B C D 