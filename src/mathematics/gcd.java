package mathematics;

public class gcd {
	public static void main(String[] args) {
		int a = 8;
		int b = 10;

		System.out.println(gcdNaive(a, b));
		System.out.println(gcdBest(a, b));
	}

	// Time complexity is O(min(a,b))
	static int gcdNaive(int a, int b) {
		int res = Math.min(a, b);

		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}

	// Time complexity is O(log(min(a,b)))
	static int gcdBest(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcdBest(b, a % b);
	}
}
