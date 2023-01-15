package array;
public class Max_sum_subarray 
{
    public static void main(String args[])
    {
        int arr[] = {5,-4,-2,6,-1};
        int max = kadane(arr);
        System.out.print("Max. sum of sub array is: "+max);
    }

    static int kadane(int[] arr)
    {
        int n = arr.length;
        int cur_sum=0,max_sum=0;
        for(int i=0;i<n;i++)
        {
            cur_sum += arr[i];
            if(cur_sum>max_sum)
            {
                max_sum = cur_sum;
            }
            
            if(cur_sum<0)
            {
                cur_sum=0;
            }
        }
        return max_sum;
    }
}
