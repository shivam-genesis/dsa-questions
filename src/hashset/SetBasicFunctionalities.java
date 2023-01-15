package hashset;

import java.util.*;

public class SetBasicFunctionalities {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 2, 6, 8, 6, 9 };
		int arr2[] = { 3, 5, 2, 7, 8, 9 };

		int distinct_elements = dis_ele(arr1);
		int un = union(arr1, arr2);
		int inter = intersect(arr1, arr2);
		System.out.println("Count of distinct elements in array one is: " + distinct_elements);
		System.out.println("Union count of these array is: " + un);
		System.out.println("Intersection count of these array is: " + inter);
	}

	static int dis_ele(int[] arr1) {
		Set<Integer> distinct_set = new HashSet<>();
		for (int x : arr1) {
			distinct_set.add(x);
		}
		System.out.println(distinct_set);
		return distinct_set.size();
	}

	static int union(int[] arr1, int[] arr2) {
		HashSet<Integer> union_set = new HashSet<>();
		for (int x : arr1) {
			union_set.add(x);
		}

		for (int x : arr2) {
			union_set.add(x);
		}
		System.out.println(union_set);
		return union_set.size();
	}

	public static int intersect(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> intersect_list = new ArrayList<>();

		for (int x : arr1) {
			set.add(x);
		}
		for (int x : arr2) {
			if (set.contains(x)) {
				set.remove(x);
				intersect_list.add(x);
			}
		}
		System.out.println(intersect_list);
		return intersect_list.size();
	}
}