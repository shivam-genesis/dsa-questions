package threads;

public class ThreadMethodTwo { // By implementing runnable interface
	public static void main(String[] args) {
		Cooking c = new Cooking();
		Thread t1 = new Thread(c);

		Gaming g = new Gaming();
		Thread t2 = new Thread(g);

		t1.start();
		t2.start();
	}
}

class Cooking implements Runnable {
	public void run() {
		int i = 1;
		while (i <= 100) {
			System.out.println("He is cooking");
			i++;
		}
	}
}

class Gaming implements Runnable {
	public void run() {
		int i = 1;
		while (i <= 100) {
			System.out.println("He is Playing games");
			i++;
		}
	}
}