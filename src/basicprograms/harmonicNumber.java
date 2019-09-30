
package basicprograms;

public class harmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1;
		int n = 8;
		for (int i = 2; i <= n; i++) {
			sum += 1.0 / i;
			System.out.print(sum + " ");
		}
		System.out.println("total is:" + sum);
	}

}
