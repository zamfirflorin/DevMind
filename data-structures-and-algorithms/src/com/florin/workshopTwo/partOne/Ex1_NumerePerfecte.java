package com.florin.workshopTwo.partOne;

import java.util.Scanner;

public class Ex1_NumerePerfecte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printAllPerfectNumber(n);

	}

	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return n == sum;
	}
	
	public static void printPerfectNumber(int n) {
		if (isPerfectNumber(n)) {
			System.out.println(n + " -> Este numar perfect");
		} else {
			System.out.println(n + " -> Nu este numar perfect");
		}
	}
	
	public static void printAllPerfectNumber(int n) {
		
		for(int i = 1; i <= n; i++) {
			if (isPerfectNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
}
