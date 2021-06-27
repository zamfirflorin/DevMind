package com.junior.recapitulare;

public class Exercitii {

	public static void main(String[] args) {
		

		System.out.println(getMultipleOf5Lower(20));
		System.out.println(getMultipleOf5Lower(18));
		System.out.println(getMultipleOf5Lower(1));
		System.out.println(getMultipleOf5Lower(4));
		System.out.println(getMultipleOf5Lower(11));
		
		System.out.println();
		
		System.out.println(getMultipleOf5Upper(20));
		System.out.println(getMultipleOf5Upper(18));
		System.out.println(getMultipleOf5Upper(1));
		System.out.println(getMultipleOf5Upper(4));
		System.out.println(getMultipleOf5Upper(11));
		System.out.println(getMultipleOf5Upper(0));
	}
	
	public static void puterileBazei(int base, int exp) {

		for (int i = 0; i < exp; i++) {
			System.out.print(pow(base, i) + " ");
		}
	}
	
	public static int pow(int base, int expo) {
		if (expo == 0) {
			return 1;
		}
		
		int auxPower = 1;
		for (int i = 0; i <= expo; i++) {
			auxPower *= base;
		}
		
		return auxPower;
	}
	
	public static int getMultipleOf5Lower(int n) {
		if (n % 5 == 0) {
			return n;
		}
		return n - (n % 5);
	}
	
	public static int getMultipleOf5Upper(int n) {
		if (n % 5 == 0) {
			return n;
		}
		return n + (5 - (n % 5));
	}	
	public static void numereAmicale(int a, int  b) {
		
	}
	
	public static int divSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
