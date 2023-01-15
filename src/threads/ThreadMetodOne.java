package threads;

public class ThreadMetodOne { //By extending thread class
	public static void main(String[] args) {
		Studying s = new Studying();
		Playing p = new Playing();
		s.start();
		p.start();
	}
}

class Studying extends Thread {
	public void run() {
		int i = 1;
		while (i <= 500) {
			System.out.println("Studying!!");
			i++;
		}
	}
}

class Playing extends Thread {
	public void run() {
		int i = 1;
		while (i <= 500) {
			System.out.println("He is Playing Football!!");
			i++;
		}
	}
}