package com.junior.Algoritmi_si_aplicatii_fundamentale;


//Sirul sumelor numerelor prime
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSumPrimes(100);;
	}
	
	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printSumPrimes(int limit) {
		int sum = 0;
		for (int i = 0; i <= limit; i++) {
			if (isPrime(i)) {
				sum += i;
				if (sum <= limit) {
					System.out.print(sum + " ");
				} else {
					break;
				}
			}
			
		}
	}

}
