package array;
public class Minimize_jumps
{
    public static void main(String args[])
    {
        int[] arr = {2,3,1,1,2,4,2,0,1,1};
        int n = arr.length;
        int jump = cal_jump(arr, n);
        System.out.println("Minimum num of jumps: "+jump);
    } 
    
    static int cal_jump(int[] arr,int n)
    {
        if (arr.length <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;
        
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        
        for (int i=1;i<n;i++)
        {
            if(i== n-1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0)
            {
                // we must have used a jump
                jump++;

                // Check if the current 
                // index/position or lesser index
                // is the maximum reach point 
                // from the previous indexes
                if (i >= maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }
        return -1;
    }
}



        /*int jump = 0;
        int i=a[0];
        while(i<n)
        {
            if(a[i]==0)
                return jump;
            jump++;
            i += a[i];
            if(i>=n-1)
            {
                jump++;
                return jump;
            }
        }
        return jump;*/