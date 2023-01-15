package string;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		boolean[] visited = new boolean[str2.length()];
		Arrays.fill(visited, false);
		
		if(str1.length() == str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				boolean isAnagram = false;
				for(int j=0;j<str2.length();j++)
				{
					if(str1.charAt(i) == str2.charAt(j) && !visited[j])
					{
						isAnagram = true;
						visited[j] = true;
						break;
					}
				}
				if(!isAnagram)
				{
					System.out.println("Not Anagram!!");
					break;
				}
			}
			System.out.println("Anagram!!");
		}
		else
		{
			System.out.println("Not Anagram!!");
		}
	}
}
