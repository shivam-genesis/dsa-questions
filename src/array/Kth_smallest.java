package array;
import java.util.Arrays;
public class Kth_smallest 
{
    public static void main(String args[]) 
    {
        int[] arr = {3,5,1,9,10,67,21,54};
        int k = 7;
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e+" "));
        System.out.println();
        System.out.println(arr[k-1]);
    }
}
