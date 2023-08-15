package mathematics;

public class lcm {
	public static void main(String[] args) {
		int a = 3, b = 7;

		System.out.println(lcmNaive(a, b));
		System.out.println(lcmBest(a, b));
	}

	static int lcmNaive(int a, int b) {
		int res = Math.max(a, b);
		while (true) {
			if (res % a == 0 && res % b == 0) {
				break;
			}
			res++;
		}
		return res;
	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	//Time complexity is O(log(min(a,b)))
	static int lcmBest(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
