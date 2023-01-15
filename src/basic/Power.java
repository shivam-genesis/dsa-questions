package basic;
import java.util.Scanner;
public class Power 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to calculate: ");
		int n = sc.nextInt();
		int power = sc.nextInt();
		int sum = 1;
		for(int i=1;i<=power;i++)
		{
			sum *= n;
		}
		System.out.println(sum);
	}
}