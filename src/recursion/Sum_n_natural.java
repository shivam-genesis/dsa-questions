package recursion;
import java.util.Scanner;
public class Sum_n_natural
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = natural(n);
        System.out.println(sum);
    }
    
    static int natural(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return natural(n-1)+n;
        }
    }
}
