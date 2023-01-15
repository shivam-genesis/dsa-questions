package array;
public class Stock_buy_sel_many
{
    public static void main(String args[])
    {
        int[] arr = {5,2,7,3,6,1,2,4};
        int n = arr.length;
        int profit = cal_profit(arr, n);
        System.out.println(profit);
    }

    static int cal_profit(int[] arr, int n)
    {
        int max_profit = 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                max_profit += (arr[i]-arr[i-1]); 
            }
        }
        return max_profit;
    }
}
