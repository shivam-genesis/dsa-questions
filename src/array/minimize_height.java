package array;
import java.util.*;
public class minimize_height
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,6,3,4,7,2,10,3,2,1};
        int n = arr.length;
        System.out.println("Enter K: ");
        int k = sc.nextInt();
        int min = getMinDiff(arr,n,k);
        System.out.println(min);
    }   
    
    static int getMinDiff(int[] arr, int n, int k) 
    {
        // code here
        int output[] = new int[n];

        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
 
        int count[] = new int[max+1];
        for (int i=0;i<max+1;i++)
        {
            count[i] = 0;
        }
 
        for (int i=0;i<n;i++)
        {
            ++count[arr[i]];
        }
 
        for (int i=1;i<max+1;i++)
        {
            count[i]+=count[i-1];
        }
 
        for (int i=n-1;i>=0;i--)
        {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

        for (int i=0;i<n;i++)
        {
            arr[i] = output[i];
        }

        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        arr[0] += k;
        System.out.println(arr[0]);
        arr[n-1] -= k;
        System.out.println(arr[n-1]);
        return arr[n-1]-arr[0];
    }
}
