package array;
public class Cyclically_rotate 
{
    public static void main(String args[])
    {
        int arr[] = {3,9,5,6,8,7};
        int n = arr.length;
        System.out.print("Elements before rotate: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int a[] = rotate(arr,n);
        System.out.print("Elements after rotate: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    static int[] rotate(int[] arr, int n)
    {
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}


