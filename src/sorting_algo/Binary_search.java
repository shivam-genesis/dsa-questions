package sorting_algo;
import java.util.Arrays;
import java.util.Scanner;
public class Binary_search
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] a ={5,1,3,7,4,12,9,0,8,43,65,23,67,87,45};
        Arrays.sort(a);
        for(int item:a) {
        	System.out.print(item+" ");
        }
        
        int n = a.length;
        int low =0, high = n-1;
        System.out.println("Enter element want to search: ");
        int key = sc.nextInt();
        while(low<high)
        {
            int mid = (low+high)/2;
            if(a[mid]==key)
            {
                System.out.println(mid);
                break;
            }
            else if(key < a[mid])
            {
                high = mid -1;
            }
            else
            {
                low = mid+1;
            }
        }
        System.out.println("Element not found!!");
    }    
}