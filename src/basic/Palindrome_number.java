package basic;
import java.util.Scanner;
public class Palindrome_number
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rev_num=0;
		int n = num;
		while(n>0)
		{
			rev_num = rev_num*10 + n%10;
			n/=10;
		}
		if(rev_num==num)
		{
			System.out.println("Palindrome number..");
		}
		else
		{
			System.out.println("Not palindrome..");
		}
	}
}