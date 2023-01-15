package basic;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.println(fact(n));
		fact(n);
		fact(n);
		fact(n);

	}

	public static int fact(int n)
	{
		int fact = 1;
		for(int i = n; i>0;i--)
		{
			fact = fact * i;
		}
		return fact;
	}
}

/* 
int
float
double
char
string
boolean

*/