package com.florin.P2_Optimizarea_performantei;

import java.util.Scanner;

public class LazyNumberDetails {

	private int number; 
	private int oldNumber;
    private int lastMagicNumber;
    private int lastPerfectNr;
    
	private boolean primeResult;
	private boolean magicResult;
	private boolean perfectResult;
	

	
	public LazyNumberDetails(int number) {
		this.number = number;
		
	}
	
	public void updateNumber(int number) {
		this.number = number;
	}
	
    public boolean isPrime() {
    	System.out.println("========================");
        if (number == oldNumber) {
            System.out.println("#1 **none (lazy eval.)**: prime result is: " + primeResult);
            return primeResult;
        }
        primeResult = checkPrimeNumber(number);  
        System.out.println("#3 **cached** : cacheNrPrime is: " + oldNumber + " number: " + number);
        this.oldNumber = number;
        return primeResult;
    }

	public boolean checkPrimeNumber(int n) {
		boolean res = true;
		if (n == oldNumber) {
			return primeResult;
		}
		System.out.println("#2 Check prime number....!!intensiveComputation!! -> prime algorithm for " + n);
		if (n < 2) {
			res = false;
		} else {
			for (int i = 2; i < n / 2 ; i++) {
				if(n % i == 0) {
					res = false;
				}
			}
		}
		this.oldNumber = n;
		this.primeResult = res;
		System.out.println("Is prime: " + res);
		return res;
	}
	
	public  boolean isPerfectNumber() {
		System.out.println("========================");
		int sum = 0;
        if (this.number == this.lastPerfectNr) {
            System.out.println("#1 **none (lazy eval.)**: number is: " + number + " lastPerfectNr is: " + lastPerfectNr
                    + " perfectResult is: " + perfectResult);

            return perfectResult;
        }
        this.lastPerfectNr = this.number;
        System.out.println("#3 **cached** lastPerfectNr = this.number : " + number + " lastPerfectNr is: " + lastPerfectNr);

		System.out.println("#2 !!intensiveComputation! S-a executat lastPerfectNr");
		for (int i = 1; i <= number/2; i++) {
			if (number % i == 0) {
				sum +=i;
			}
		}
        if (number == sum) {
        	perfectResult = true;
            return true;

        }
        perfectResult = false;
		System.out.println("Is perfect: " + (sum == number));
		return sum == number;
	}
	
	public  boolean isMagicNumber() {//22971
		System.out.println("========================");
        if (this.number == this.lastMagicNumber) {
            System.out.println("**none (lazy eval.)**: old magic number: " + lastMagicNumber + " new number : " + number);
            return magicResult;
        }
        this.lastMagicNumber = this.number;
        System.out.println("#3 **cached**  lastMagicNumber = this.number : " + number + " lastMagicNumber is: " + lastMagicNumber);
		int n = this.number;
		int digitsSum = 10;
		while (digitsSum > 9) {
			digitsSum = digitsSum(n);
			n = digitsSum(n);
		}
		System.out.println("#2 !!intensiveComputation! S-a executat isMagicNumber");
		System.out.println("Is magic: " + (digitsSum == 3 || digitsSum == 7 || digitsSum == 9));
		magicResult = false;
		return digitsSum == 3 || digitsSum == 7 || digitsSum == 9;
	}
	
	private int digitsSum(int n) {
		int sum = 0;
		int lastDigit = 0;
		while (n > 0) {
			lastDigit = n % 10;
			sum += lastDigit;
			n /= 10;
		}
		return sum;
	}

}
