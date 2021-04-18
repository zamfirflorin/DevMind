package com.florin.doWhile;

import java.util.Scanner;

/**
 * @author fszamfi
 *1. Folosind instructiunea invatata do-while, implementeaza un joc in care utilizatorul trebuie sa ghiceasca un numar magic. 
 *Astfel, variabila int numarMagic va fi initializata la o valoare intreaga, in intervalul [0, 10]. 
 *Ulterior, utilizatorul va introduce numere de la tastatura iar programul tau ii va da acestuia indicatii despre numarul introdus:

Daca numarul introdus nu se afla in interval, programul va afisa mesajul: Atentie! Numarul magic se afla in intervalul [0, 10]
Daca numarul este mai mare decat numarul magic, programul va afisa mesajul: Esti aproape! Dar numarul magic este mai mic.
Daca numarul introdus este mai mic, se va afisa:Esti aproape! Dar numarul magic este mai mare.
Cand numarul este ghicit, se va afisa: Ai ghicit, bravo!
 */
public class Ex1 {

	public static void main(String[] args) {
		int numarMagic = 3;
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10] \nIncearca-ti norocul:");
		
		do {
			n = sc.nextInt();
			if (n < 0 || n > 10) {
				System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]\nIncearca-ti norocul:");
			} else if (n > numarMagic) {
				System.out.println("Esti aproape! Dar numarul magic este mai mic.\nIncearca-ti norocul:");
			} else if ( n < numarMagic) {
				System.out.println("Esti aproape! Dar numarul magic este mai mare.\nIncearca-ti norocul:");
			} else {
				System.out.println("Ai ghicit, bravo!");
				break;
			}
			
		} while (true);
		
	}

}
