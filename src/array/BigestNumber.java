package array;

import java.util.Arrays;

public class BigestNumber {
	public static void main(String[] args) {
		int[] a = { 3, 30, 34, 5, 9 };

		for (int i = 0; i < a.length; i++) {
			boolean sorted = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				sorted = false;
				String x = String.valueOf(a[j]) + String.valueOf(a[j + 1]);
				String y = String.valueOf(a[j + 1]) + String.valueOf(a[j]);
				int temp = 0;
				if (Integer.parseInt(y) > Integer.parseInt(x)) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (sorted) {
				break;
			}
		}

		for (int item : a) {
			System.out.print(item);
		}

		System.out.println();

		Arrays.stream(a).forEach(e -> System.out.print(e));
	}
}
