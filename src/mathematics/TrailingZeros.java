package mathematics;

public class TrailingZeros {
	public static void main(String[] args) {
		int n = 26;
		System.out.println(countTrailingZero(n));
		System.out.println(countTrailingZeroEfficiently(n));
	}

	//Time complexity is O(n) 
	static int countTrailingZero(int n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}

		int res = 0;
		while (fact % 10 == 0) {
			res++;
			fact /= 10;
		}

		return res;
	}

	//Time Complexity is O(log n)
	static int countTrailingZeroEfficiently(int n) {
		int res = 0;
		for (int i = 5; i <= n; i *= 5) {
			res += n / i;
		}
		return res;
	}
}
