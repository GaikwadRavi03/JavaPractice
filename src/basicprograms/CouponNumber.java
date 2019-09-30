package basicprograms;

public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		int n = chars.length;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();
		while (random > 0) {
			sb.append(chars[random % n]);
			random /= n;
		}
		System.out.println("coupon number: " + sb.toString());
	}
}
 