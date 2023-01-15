package string;
import java.util.Scanner;
public class Rev_str
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
		}
		else
		{
			System.out.println("Enter valid string...");
		}
		System.out.println(rev_str);
	}

}
