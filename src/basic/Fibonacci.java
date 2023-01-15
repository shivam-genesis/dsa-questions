package basic;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.print("Enter the number you want to print: ");
		int n = sc.nextInt();
		System.out.print(a+" "+b+ " ");
		for(int i=1;i<=n-2;i++)
		{
			int c = a+b;
			System.out.print(c+ " ");
			a = b;
			b = c;
		}
	}
}
