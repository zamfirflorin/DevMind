package com.florin.fluxControl;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("# n == ");
		int n = sc.nextInt();
		double sum = 0;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.print("# numerele citite: ");
		
		for (int i = 0; i < n; i++) {
			
			int number = sc.nextInt();
			
			if (number < min) {
				min = number;
			}
			
			if (number > max) {
				max = number;
			}
			
			sum += number;
		}
		
		System.out.println("Numarul minim: " + min);
		System.out.println("Numarul maxim: " + max);
		System.out.println("Media aritmetica: " + (sum / n));
		
	}
}
