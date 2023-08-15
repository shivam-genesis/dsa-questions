package mathematics;

public class PowerComputation {
	public static void main(String[] args) {
		int x = 2, y = 3;

		System.out.println(powerNaive(x, y));
		System.out.println(powerBest(x, y));
	}

	// Time complexity is O(n)
	static int powerNaive(int x, int y) {
		int res = 1;
		if (y == 1) {
			return 1;
		}
		for (int i = 1; i <= y; i++) {
			res = res * x;
		}
		return res;
	}

	// Time complexity is O(log n)
	static int powerBest(int x, int y) {
		if (y == 0) {
			return 1;
		}

		int temp = powerBest(x, y / 2);
		temp *= temp;

		if (y % 2 == 0) {
			return temp;
		} else {
			return temp * x;
		}
	}
}
