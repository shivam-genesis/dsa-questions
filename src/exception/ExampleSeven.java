package exception;

public class ExampleSeven {
	public static void main(String args[]) {

		try {
			System.out.println("Inside try block");
			int data = 25 / 0;
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
