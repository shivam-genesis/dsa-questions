package basic;

public class random {
	public static void main(String args[]) {
		int b = value(10);
		System.out.println(--b);
	}
	
	static int value(int n) {
		return n++;
	}
}
