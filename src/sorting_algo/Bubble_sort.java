package sorting_algo;
public class Bubble_sort
{
    public static void main(String args[])
    {
        int[] a = {12,35,1,10,34,1,999,-1};
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            boolean sorted = true;
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    sorted = false;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(sorted)
            {
                break;
            }
        }
        for(int item:a)
        {
            System.out.print(item+" ");
        }
    }
}
