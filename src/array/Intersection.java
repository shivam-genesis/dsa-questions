package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 6, 7, 9, 3, 4, 5, 4 };
		int[] b = { 4, 0, 1, 7, 4, 8 };
		Set<Integer> set = new HashSet<>();
		List<Integer> intersect_list = new ArrayList<>();
		for (int x : a) {
			set.add(x);
		}
		for (int x : b) {
			if (set.contains(x)) {
				set.remove(x);
				intersect_list.add(x);
			}
		}
		System.out.println(intersect_list);
	}
}
