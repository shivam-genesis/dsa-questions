package string;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String rev_str="";
		if(str.length()>0)
		{
			for(int i=str.length()-1;i>=0;i--)
			{
				rev_str += str.charAt(i);
			}
			System.out.println("Reverse string is: "+rev_str);
			if(rev_str.equals(str)) 
			{
				System.out.println("Palindrome String..");
			}
			else
			{
				System.out.println("Not palindrome...");
			}
		}
		else
		{
			System.out.println("Enter valid string...");
		}
	}
}
