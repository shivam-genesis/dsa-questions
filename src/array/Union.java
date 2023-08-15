package array;

import java.util.HashSet;
import java.util.Set;

public class Union {
	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 6, 7, 9, 3, 4, 5 };
		int[] b = { 4, 0, 1, 7, 4, 8 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
		}

		for (int item : set) {
			System.out.print(item + " ");
		}
	}
}
