package mathematics;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;

		
		Boolean[] arr = {true,false,false,true,false,false,true,true};
		int count = 0;
		
		int i=0;
		while(i<arr.length) {
			if(arr[i]==true) {
				count++;
			}
			i++;
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		System.out.println(factorial(n));
		System.out.println(factorialByRecursion(n));
	}

	//Time complexity is O(n) and space is O(1)
	static int factorial(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	//Time complexity is O(log n) and space is O(1)
	static int factorialByRecursion(int n) {
		if (n == 1) {
			return 1;
		}
		return factorialByRecursion(n - 1) * n;
	}
}
