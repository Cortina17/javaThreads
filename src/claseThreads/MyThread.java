package claseThreads;

public class MyThread extends Thread {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.run();
	}

	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(0001);
				System.out.println("Hello " + i++);
				if (i == 50) {
					break;
				}
			} catch (InterruptedException e) {
				System.out.println("hilo interrumpido" + e.getMessage());
			}
		}
	}
}
