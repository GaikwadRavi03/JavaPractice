package basicprograms;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 371, sum = 0, temp, d;
		temp = num;
		while (num > 0) {
			d = num % 10;
			sum = sum + (d * d * d);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("amstrong");
		else
			System.out.println("not amstrong");
	}

}
