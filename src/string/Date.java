package string;

import java.util.Scanner;

public class Date {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();

		String day = s.substring(3, 5);
		String month = s.substring(0, 2);
		String year = s.substring(6);

		System.out.println("Year: " + Integer.parseInt(year) + ", Month: " + Integer.parseInt(month) + ", Day: "
				+ Integer.parseInt(day));

	}

}