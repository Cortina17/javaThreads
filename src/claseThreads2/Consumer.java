package claseThreads2;

public class Consumer implements Runnable {

	private SyncStack theStack;
	private int num;
	private static int counter = 1;

	public Consumer(SyncStack s) {
		theStack = s;
		num = counter++;
	}

	public void run() {
		char c;
		for (int i = 0; i < 200; i++) {
			c = theStack.pop();
			System.out.println("Consumer" + num + ": " + c);

			try {
				Thread.sleep((int) (Math.random() * 2000));
			} catch (InterruptedException e) {
				// ignore it
			}
		}
	} // END run method

}