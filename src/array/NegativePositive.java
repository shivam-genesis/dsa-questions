package array;

public class NegativePositive {
	public static void main(String[] args) {
		int[] arr = {-4,2,8,-9,1,-3,-7,2,5,-8};
		int low=0,high=arr.length-1,temp=0;
		
		while(low<=high) {
			if(arr[low]<0 && arr[high]<0) {
				low++;
			}
			else if(arr[low]>=0 && arr[high]>=0) {
				high--;
			}
			else if(arr[low]>=0 && arr[high]<0) {
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
			else {
				low++;
				high--;
			}
		}
		for(int item:arr) {
			System.out.print(item+" ");
		}
		
	}
}
