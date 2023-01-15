package sievealgo;
import java.util.*;
public class Sieve_of_eratosthenes
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to find prime numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        Boolean[] isPrime = new Boolean[end+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=end;i++)
        {
            for(int j=i*2;j<=end;j=j+i)
            {
                isPrime[j] = false;       
            }
        }
        
        for(int i=start;i<=end;i++)
        {
            if(isPrime[i])
            {
                System.out.print(i+"\t");
            }
        }
    }
}