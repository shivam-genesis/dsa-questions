package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int num = 20;
		printPrimesNaive(num);
		System.out.println();
		printPrimesBest(num);
	}
	
	//Time complexity is O(n sqrt n)
	static void printPrimesNaive(int num) {
		for(int i=2;i<=num;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	//Using Sieve Of Eratosthenes algorithm
	static void printPrimesBest(int num) {
		Boolean[] arr = new Boolean[num+1];
		Arrays.fill(arr, true);
		for(int i=2;i<=num;i+=2) {
			if(i==2) {
				continue;
			}
			arr[i] = false;
		}
		
		for(int i=3;i<=num;i+=3) {
			if(i==3) {
				continue;
			}
			arr[i] = false;
		}
		
		for(int i=5;i<=num;i+=5) {
			if(i==5) {
				continue;
			}
			arr[i] = false;
		}
		
		for(int i=2;i<=num;i++) {
			if(arr[i] == true) {
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	
	
	
	
	
	
	static boolean checkPrime(int num) {
		if(num==2 || num==3) {
			return true;
		}
		
		else if(num%2==0 || num%3==0) {
			return false;
		}
		
		for(int i=5;i<=Math.sqrt(num);i+=6) {
			if(num%i==0 || num%(i+2) == 0) {
				return false;
			}
		}
		return true;
	}
}
