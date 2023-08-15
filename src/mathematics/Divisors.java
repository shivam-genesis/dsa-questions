// All dividors of a number
package mathematics;

public class Divisors {
	public static void main(String[] args) {
		int num = 16;
		divisorsNaive(num);
		System.out.println();
		divisorsBest(num);
		System.out.println();
		divisorsBestSorted(num);
	}

	// Time complexity is O(n)
	static void divisorsNaive(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// Time complexity is O(sqrt n)
	static void divisorsBest(int num) {
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				if (i != num / i) {
					System.out.print(num / i + " ");
				}
			}
		}
	}

	// Time complexity is O(sqrt n)
	static void divisorsBestSorted(int num) {
		int i;
		for (i = 1; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

		for (; i >= 1; i--) {
			if (num % i == 0) {
				System.out.print(num / i + " ");
			}
		}
	}
}
