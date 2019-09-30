package basicprograms;

class hi extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class hello extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class hiHelloThreading {
	public static void main(String[] args) {
		hi obj1 = new hi();
		hello obj2 = new hello();
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		obj2.start();
	}
}
