package array;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 0, 2, 0, 1, 0, 2, 2, 1, 0 };
		int low = 0, mid = 0, high = arr.length - 1, temp = 0;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			}
		}

		for (int item : arr) {
			System.out.print(item + " ");
		}
	}
}
