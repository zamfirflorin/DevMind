package com.florin.cursPatruPartII;

import java.util.Scanner;

/**
 * @author zamfi
 *Volumul paralelipipedului: V = L * l * h
	Aria bazei: Ab = L * l
	Aria laterala: Al = 2 * (L * h + l * h)
	Aria totala: At = Al + 2 * Ab
	Programul citeste de la tastatura dimensiunile paralelipipedului: Lungimea (L), latimea (l) si inaltimea (h). Dimensiunile pot fi numere zecimale.
 */
public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduceti Lungimea (L), latimea (l) si inaltimea (h). : ");
		double L = sc.nextDouble();
		double l = sc.nextDouble();
		double h = sc.nextDouble();
		
		double V = L * l * h;
		double Ab = L * l;
		double Al = 2 * (L * h + l * h);
		double At = Al + 2 * Ab;
		
		System.out.println("Volumuul este: "+ V);
		System.out.println("Aria bazei este: "+ Ab);
		System.out.println("Aria laterala este: "+ Al);
		System.out.println("Aria totala este: "+ At);
		
		sc.close();
	}
	
}
