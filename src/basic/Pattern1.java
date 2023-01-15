/*      *
      *   *
    *   *   *
  *   *   *   *  
        1
      2   3
    4   5   6
  7   8   9   10 
  
  *
  * *
  * * *
  * * * *
  * * *
  * *
  * 
       
 */
package basic;
import java.util.Scanner;
public class Pattern1
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  pattern number: ");
		int n = sc.nextInt();
		switch(n)
		{
			case 1: pattern1();
			break;
			case 2: pattern2();
			break;
			case 3: pattern3();
			break;
			
			default: System.out.println("Enter valid input...");
		}
	}
	
	static void pattern1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
	
	static void pattern2()
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+"   ");
				count++;
			}
			System.out.println();
		}
	}
	
	static void pattern3()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=4-1;i++)
		{
			for(int j=i;j<=4-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
