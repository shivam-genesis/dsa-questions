package mathematics;

public class PrimeFactors {
	public static void main(String[] args) {
		int num = 16;
		primeFactorNaive(num);
		System.out.println();
		primeFactorEfficient(num);
	}

	// Time complexity is O(n2 log n)
	static void primeFactorNaive(int num) {

		if (checkPrime(num)) {
			System.out.println(num);
		}

		for (int i = 2; i <= num / 2; i++) {
			if (checkPrime(i)) {
				int x = i;
				while (num % x == 0) {
					System.out.print(i + " ");
					x = x * i;
				}
			}
		}
	}
	
	
	static void primeFactorEfficient(int num) {
		if(num<=1) {
			return ;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num /= i;
			}
		}
		if(num>1) {
			System.out.println(num);
		}
	}
	
	
	
	
	
	
	
	

	static boolean checkPrime(int n) {
		if (n == 2 || n == 3) {
			return true;
		}

		else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i <= Math.sqrt(n); i += 6) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
