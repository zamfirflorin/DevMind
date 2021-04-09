package com.florin.foruri;

import java.util.Scanner;

/**
 *3. Scrie un program care citeste de la tastatura un numar natural n, ce reprezinta numarul de elemente, urmat de n numere intregi. Programul va afisa, la final, numarul de numere pozitive si respectiv numarul de numere negative introduse.
	Exemplu de executie:
 *# INPUT:
5
20 -7 3 11 -100
# OUTPUT:
Numere pozitive: 3
Numere negative: 2
 */
public class Ex3 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduceti numarul de elemente:");
		int n = sc.nextInt();
		int numerePozitive = 0;
		int numereNegative = 0;

		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Introduceti numarul " + (i + 1) + "/" + n + ":");

			int crtNumber = sc.nextInt();

			if (crtNumber >= 0) {
				numerePozitive++;
			} else {
				numereNegative++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Introduceti numarul " + (i + 1) + "/" + n + ":");
			numbers[i]= sc.nextInt();
		}
		
		for (int i : numbers) {
			if (i >= 0 ) {
				numerePozitive++;
			} else {
				numereNegative++;
			}
		}
		
		System.out.println("Numere pozitive: " + numerePozitive);
		System.out.println("Numere negative: " + numereNegative);
	}
}
