// Program to find number of digits of a given number
package mathematics;

public class CountDigits {
	public static void main(String[] args) {
		long n = 12345;
		countDigits(n);
		System.out.println("Number of digits by Recursion: "+countDigitsByRecursion(n));
	}

	// Uses more time O(d), where d is number of digits
	static void countDigits(long n) {
		int digits = 0;

		while (n > 0) {
			n = n / 10;
			digits++;
		}

		System.out.println("NUmber of digits are: " + digits);
	}
	
	// Efficient method uses less time O(log n)
	static int countDigitsByRecursion(long n) {
		if(n/10 == 0) {
			return 1;
		}
		return 1 + countDigitsByRecursion(n/10);
	}
}
