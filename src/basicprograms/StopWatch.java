package basicprograms;

public class StopWatch {
	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch sw = new StopWatch();
		sw.start();
		for (int i = 0; i < 1000; i++) {
			System.out.print(i + " ");
		}
		sw.stop();
		long time = sw.elapsedTime();
		System.out.println("total time elapsed(in millisec) is: " + time);
	}

	public void start() {
		// TODO Auto-generated method stub
		startTimer = System.currentTimeMillis();
		System.out.println("start time is: " + startTimer);
	}

	private void stop() {
		// TODO Auto-generated method stub
		stopTimer = System.currentTimeMillis();
		System.out.println("stop time is: " + stopTimer);
	}

	private long elapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
		// TODO Auto-generated method stub

	}
}
