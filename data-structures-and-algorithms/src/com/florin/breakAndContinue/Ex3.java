package com.florin.breakAndContinue;

import java.util.Scanner;

/**
 * @author fszamfi
 *3. Implementeaza un algoritm care citeste un numar intreg de la tastatura. 
 *Acesta afiseaza ulterior primele 3 cifre ale numarului, de la sfarsit spre inceput. 
 *Daca numarul are mai putin de 3 cifre, programul va afisa un mesaj de eroare (i.e. Numarul introdus trebuie sa contina cel putin 3 cifre). 
 *De exemplu:
 *123 -> 3 2 1
25 -> Numarul introdus trebuie sa contina cel putin 3 cifre
87265 -> 5 6 2
109834 -> 4 3 8
 */
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduceti numarul: ");
		int n = sc.nextInt();
		int counter = 0;
		int aux = n; 
		for (int i = 0; i < 3; i++) {
			int lastDigit = aux % 10;
			aux /= 10;
			counter++;
		}
		
		if (counter < 3) {
			System.out.println(" Numarul introdus trebuie sa contina cel putin 3 cifre");;
		} else {
			for (int i = 0; i < 3; i++) {
				int lastDigit = n % 10;
				n /= 10;
				System.out.print(lastDigit+ " ");
			}
		}

	}

}
