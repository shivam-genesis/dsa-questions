package hashset;
import java.util.HashMap;
import java.util.Scanner;
public class Given_sum_subarray 
{
   public static void main(String[] args)
   {
       @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter length of array: ");
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++)
       {
           a[i] = sc.nextInt();
       }
       System.out.println("Enter the sum you want: ");
       int sum = sc.nextInt();
       given_sum_subarray(a,n,sum);
   }

   static void given_sum_subarray(int a[], int n, int sum)
   {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        
        for(int i=0;i<n;i++)
        {
            cur_sum += a[i];

            if((cur_sum - sum) == 0)
            {
                start = 0;
                end = i;
                break;
            }

            if(map.containsKey(cur_sum-sum))
            {
                start = map.get(cur_sum-sum)+1;
                end = i;
                break;
            }
            map.put(cur_sum,i);
        }

        if(end == -1)
        {
            System.out.println("Not Found!!");
        }
        else
        {
            System.out.println(start+","+end);
        }
    }
}
