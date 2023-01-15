package basic;
import java.util.Scanner;
public class cal 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		while(exit==0)
		{
			System.out.print("Enter first number: ");
			int a = sc.nextInt();
			System.out.print("Enter second number: ");
			int b = sc.nextInt();
			System.out.print("Enter operation: ");
			sc.nextLine();
			char opr = sc.nextLine().charAt(0);
			System.out.println(calculator(a,b,opr));
			System.out.print("If you want to exit the loop press 1, else 0: ");
			exit = sc.nextInt();
		}
	}
	
	static double calculator(int a,int b, char opr)
	{
		double ans = 0;
		switch(opr)
		{
		case '+':
			ans = a+b;
			break;
		case '-':
			ans = a-b;
			break;
		case '*':
			ans = a*b;
			break;
		case '/':
			ans = a/b;
			break;
		}
		return ans;
	}
}