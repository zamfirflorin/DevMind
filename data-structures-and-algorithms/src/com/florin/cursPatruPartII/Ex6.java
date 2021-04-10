package com.florin.cursPatruPartII;

import java.util.Scanner;

/**
 * @author zamfi
 *6. Intr-o urna se pun v bile verzi, r bile rosii si n bile negre. 
 *Calculeaza probabilitatea de a se extrage o bila verde din urna, folosind formula de probabilitati corespunzatoare:
 */
public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduceti numarul de bile verzi: ");
		int v = sc.nextInt();
		
		System.out.print("Introduceti numarul de bile rosii: ");
		int r = sc.nextInt();
		
		System.out.print("Introduceti numarul de bile negre: ");
		int n = sc.nextInt();
		
		double prob  = 1.0 * v / (v + r + n) * 100;
		
		System.out.println("Probabilitatea de a se extrage o bila verde din urna este: " + prob + " %");
		
	}

}
