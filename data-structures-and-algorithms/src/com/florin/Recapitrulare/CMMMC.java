package com.florin.Recapitrulare;

import java.util.Arrays;

public class CMMMC {

	public static final int maxInt = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		int a = 8; 
		int b = 6;
		System.out.println(cmmmc(a, b));
		
	


	}
	
	public static int[] getPrimeNumbers(int limit) {
		int counter = 0;
		int[] arr = new int[limit];
		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				arr[counter] = i;
				counter++;
			}
		}
		arr = Arrays.copyOf(arr, counter);
		return arr;
		
	}
	
	public static int cmmmc(int a, int b) {
		int[] primes = getPrimeNumbers(Math.max(a,  b));
		int[] aprimes= primeFactorsDecomp(a, primes);
		int[] bprimes= primeFactorsDecomp(b, primes);
		for (int n: aprimes) {
			System.out.print(n + " ");
		}
		int sol = 1;
		for (int i = 0; i < aprimes.length; i++) {
			sol *= Math.pow(primes[i], Math.max(aprimes[i], bprimes[i]));
		}
		return sol;
	}
	
	public static int[] primeFactorsDecomp(int n, int[] primes) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[primes.length];
		for (int i = 0; i < primes.length; i++) {
			int x = primes[i];
			int counter = 0;
			while (n % x == 0) {
				n = n / x;
				counter++;
			}
			arr[i] = counter;
		}
		return arr;
	}

	public static boolean isPrime(int n) {
		
		if (n < 2) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		for (int i = 2; i <= n ; i++) {
			if (n % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	

}
