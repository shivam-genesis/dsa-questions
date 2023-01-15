package exception;

public class Test {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("abc");
			System.out.println(i);
		} catch (NumberFormatException ex) {
			System.out.println("Number Format Exception occured");
		} catch (Exception ex) {
			System.out.println("Exception occured.");
		}
	}
}