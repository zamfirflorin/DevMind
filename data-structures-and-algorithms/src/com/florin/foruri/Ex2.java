package com.florin.foruri;

import java.util.Scanner;

/**
 * 2. (Instructiuni iterative. 'while' - Ex. 2) Scrie un program care afiseaza urmatoarele siruri de numere, dupa citirea unei valori n de la tastatura. De aceasta data, foloseste instructiunea iterativa for in implementare:

Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
 *
 *1. 0 1 2 3 4 5 6 7 8 9 10
2. 1 3 5 7 9
3. 10 8 6 4 2 0
4. 0 5 10
 */
public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//1
		for (int i = 0; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		//2
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		//3
		System.out.println();
		for (int i = n; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		//4
		System.out.println();
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
