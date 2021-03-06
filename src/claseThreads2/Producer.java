package claseThreads2;

public class Producer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter = 1;

	public Producer(SyncStack s) {
		theStack = s;
		num = counter++;
	}

	public void run() {
		char c;

		for (int i = 0; i < 200; i++) {
			c = (char) (Math.random() * 26 + 'A');
			theStack.push(c);
			System.out.println("Producer" + num + ": " + c);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// ignore it
			}
		}
	} // END run method

}