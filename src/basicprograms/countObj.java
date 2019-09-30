package basicprograms;

public class countObj {

	static int counter = 0;

	public countObj() {
		counter++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countObj o1 = new countObj();
		countObj o2 = new countObj();
		System.out.println(counter);
	}
}
 