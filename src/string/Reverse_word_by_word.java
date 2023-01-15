package string;
import java.util.Scanner;
public class Reverse_word_by_word
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		int i = str.length()-1;
		String ans ="";
		while(i>=0)
		{
			while(i>=0 && str.charAt(i)==' ')
			{
				i--;
			}
			int j=i;
			if(i<0)
			{
				break;
			}
			while(i>=0 && str.charAt(i)!= ' ')
			{
				i--;
			}
			if(ans.isEmpty())
			{
				ans = ans.concat(str.substring(i+1,j+1));
			}
			else
			{
				ans = ans.concat(" "+str.substring(i+1,j+1));
			}
		}
		System.out.print(ans);
	}
}
