package sorting_algo;
public class Insertion_sort
{
    public static void main(String args[])
    {
        int[] a = {7,2,5,1,9,6};
        int n = a.length;
        for(int i=1;i<n;i++)
        {
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }

        for(int item : a)
        {
            System.out.print(item+" ");
        }
    }    
}
