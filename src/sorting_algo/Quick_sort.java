package sorting_algo;
public class Quick_sort 
{
    public static void main(String args[])
    {
        int[] a = {4,2,7,5,1,9,8};
        int n = a.length;
        int low = 0, high = n-1;
        sort(a,low,high);
        System.out.print("Sorted array: ");
        for(int item:a)
        {
            System.out.print(item+ " ");
        }
    }

    static void sort(int[] a, int low, int high)
    {
        if(low<high)
        {
            int pivot_index = partition(a,low,high);
            sort(a,low,pivot_index-1);
            sort(a,pivot_index+1,high);
        }
        
    }

    static int partition(int[] a, int low, int high)
    {
        int pivot = a[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int t=a[i];
                a[i] = a[j];
                a[j] = t;
             }
         }
        int t = a[i+1];
        a[i+1] = a[high];
        a[high] = t;
        return (i+1);
    }
}
