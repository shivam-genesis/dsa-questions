package exception;

public class ExampleTwo {
	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j;
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(i / (j + 2));
		}
	}
}
