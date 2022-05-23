package claseThreads;

public class ThreadTest {
	//main es el hilo principal
	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		Thread t = new Thread(r);//Se usa patron Decorator
		t.start();
	}
}
//la clase Thread tiene start, pero no run.

//Al ser main el hilo principal, 
//este crea un hilo paralelo para lanzar la segunda funcion del programa
class HelloRunner implements Runnable {
	int i;

	public void run() {
		i = 0;
		while (true) {
			System.out.println("Hello " + i++);
			if (i == 50) {
				break;
			}
		}
	}
}