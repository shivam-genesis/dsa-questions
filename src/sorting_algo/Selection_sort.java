package sorting_algo;
public class Selection_sort
{
    public static void main(String args[])
    {
        int[] a={4,2,9,1,4,8,3};
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j] < a[min_index])
                {
                    min_index = j;
                }
            }
            if(min_index != i)
            {
                int temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
            }
        }

        for(int item:a)
        {
            System.out.print(item+" ");
        }
    }    
}
