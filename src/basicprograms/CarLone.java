package basicprograms;

public class CarLone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P = 1000;
		double Y = 3;
		double R = 6;

		double n = 12 * Y;
		double r = R / (12 * 100);
		double a = (double) Math.pow((1 + r), -n);
		double payment = (P * r) / 1 - a;

		System.out.println("payment is: " + payment);
	}
}
