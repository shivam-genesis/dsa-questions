package array;
import java.util.*;
class Merge_array
{
    public static void main(String args[])
    {
        int[] arr1={1,3,5,7,9};
        int n = arr1.length;
        int[] arr2={2,4,6,8,10};
        int m = arr2.length;

        int[] final_array = merge(arr1, arr2, n, m);
        for(int i=0;i<final_array.length;i++)
	    {
	        System.out.print(final_array[i]+" ");
	    }
    }

    static int[] merge(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> merge_list = new ArrayList<Integer>();
	    for(int i=0;i<n;i++)
	    {
	        merge_list.add(arr1[i]);
	    }
	    
	    for(int i=0;i<m;i++)
	    {
	        merge_list.add(arr2[i]);
	    }
	    Collections.sort(merge_list);
	    int[] temp = new int[merge_list.size()];
        for(int i=0;i<temp.length;i++)
        {
            temp[i] = merge_list.get(i);
        }
	    return temp;
    }
}