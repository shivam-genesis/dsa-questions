package mathematics;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 18;

		System.out.println("Number is prime: " + checkPrimeNaive(n));
		System.out.println("Number is prime: " + checkPrimeEffective(n));
		System.out.println("Number is prime: " + checkPrimeBest(n));
	}

	// Time complexity is O(n)
	static boolean checkPrimeNaive(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Time complexity is O(sqrt n)
	static boolean checkPrimeEffective(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Time complexity is O(sqrt n)
	static boolean checkPrimeBest(int n) {
		if (n == 1 || n == 0) {
			return false;
		}

		else if (n == 2 || n == 3) {
			return true;
		}

		else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i <= Math.sqrt(n); i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;

	}
}
