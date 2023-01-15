package lambda;

public class LambdaExp {
	public static void main(String[] args) {
		MyInterface i = () -> {
			System.out.println("Hello! I'm using Lambda...");
		};

		SumInterface s = (a, b) -> a + b;

		LengthInterface l = str -> str.length();

		i.hello();
		System.out.println(s.sum(4, 5));
		System.out.println(l.stringLength("Shivam"));

	}
}