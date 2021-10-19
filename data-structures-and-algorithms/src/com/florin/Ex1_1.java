package com.florin;

/**
 * @author fszamfi
 *Scrie o metoda iterativa care primeste ca parametru un numar si returneaza numarul de cifre al acelui numar. De exemplu:
 */
public class Ex1_1 {

	public static void main(String[] args) {
		
		numberLengthI(-122);
		numberLengthI(23431);
		numberLengthI(0);
		numberLengthI(1234);
	}

	
	public static int numberLengthI(int n) {
		int counter = 0;
		int aux = n;
		
		if (n == 0) {
			counter = 1;
		}
		
		while (aux != 0) {
			aux /= 10;
			counter++;
		}
		System.out.println(counter);
		return counter;
	}
}
