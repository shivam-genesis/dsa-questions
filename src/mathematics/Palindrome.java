// Check a number is palindrome or not
package mathematics;

public class Palindrome {
	public static void main(String[] args) {
		long num = 123215;

		System.out.println("Number is palindrome: " + checkPalindrome(num));
	}

	//Time complexity is O(log n)
	static Boolean checkPalindrome(long num) {
		long temp = num;
		long rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		return (rev == num) ? true : false;
	}
}
