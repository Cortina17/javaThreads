package claseThreads2;

public class PrintMe implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}

	}

}
