package basic;
import java.util.Scanner;
public class Prime_Number
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range you want to check of prime numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("List of all prime number between "+a+" and "+b+" are: ");
		for(int i=a;i<=b;i++)
		{
			if(i==1)
			{
				continue;
			}
			int count = 1;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j == 0)
				{
					count = 0;
					break;
				}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}