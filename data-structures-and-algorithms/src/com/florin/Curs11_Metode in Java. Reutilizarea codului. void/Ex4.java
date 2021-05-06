package com.florin.Metode;

import java.util.Scanner;

/**
 * @author fszamfi
 *Scrie un program care afiseaza toate numerele palindrom pana la o valoare n citita de la tastatura. Scrie codul modularizat, 
 *folosind cel putin o metoda care sa determine daca un numar este palindrom si o alta metoda care afiseaza toate numerele palindrom pana la n. 
 *Testeaza codul in main(…), pentru diverse valori (n).
 */
public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		showPalindrom(n);

	}
	
	public static void showPalindrom(int n) {
		for (int i = 0; i <= n; i++) {
			if (isPalindrom(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPalindrom(int n) {
		int aux = n;
		int number = 0;
		
		while (aux != 0) {
			number = number * 10 + aux % 10;
			aux /=10;
		}
		
		if (number == n) {
			return true;
		} else {
			return false;
		}
	}

}
