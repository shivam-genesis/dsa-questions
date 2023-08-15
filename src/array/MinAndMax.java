package array;

import java.util.Arrays;

public class MinAndMax {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 7, 9, 6 };
		
		Arrays.sort(arr);
		
		System.out.println("Minimum element: "+arr[0]);
		System.out.println("Maximun element: "+arr[arr.length-1]);
		
		
		
	}
}
