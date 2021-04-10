package com.florin.cursTrei;

/**
 * @author zamfi
 * Folosind variabile (cu nume intuitive) si operatiile matematice de baza (exemplificate anterior), modeleaza urmatoarea problema simpla:
	„Andrei are 23 de mere, 45 de portocale si 7 gutui. Acesta mananca la masa de pranz 5 mere, 2 portocale si 3 gutui. 
	Scrie un program care (1) sa calculeze si (2) sa afiseze urmatoarele statistici, ca in output-ul urmator“:
 */
public class Ex6 {

	public static void main(String[] args) {
		
		int mere = 23;
		int portocale = 45;
		int gutui = 7;
		
		System.out.println("Andrei are initial un total de fructe de: " + "\n" + (mere+portocale+gutui));
		
		mere -=5;
		portocale -=2;
		gutui -=3;
		
		System.out.println("Dupa masa, Andrei are un total de mere + portocale de:" + "\n" + (mere+portocale));
		System.out.println("Numarul total de fructe ramase dupa masa este:" + "\n" + (mere+portocale+gutui));

	}

}
