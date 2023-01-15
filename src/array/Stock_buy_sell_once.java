package array;
public class Stock_buy_sell_once
{
    public static void main(String args[])
    {
        int[] arr={5,2,7,3,6,1,2,4};
        int n = arr.length;
        int profit = cal_profit(arr, n);
        System.out.println(profit);
    }

    static int cal_profit(int[] arr, int n)
    {
        int max_profit = 0;
        int min_so_far = 0;
        for(int i=0;i<n;i++)
        {
            min_so_far = Math.min(min_so_far,arr[i]);
            int profit = arr[i] - min_so_far;
            max_profit = Math.max(profit,max_profit);
        }
        return max_profit;
    }
}
