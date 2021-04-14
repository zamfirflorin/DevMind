package com.florin.breakAndContinue;

import java.util.Scanner;

/**
 * @author fszamfi
 *2. Scrie un program care afiseaza primele 5 numere impare dintr-un interval dat. 
 *Se vor citi de la tastatura 2 numere intregi: left respectiv right, care reprezinta capetele intervalului. 
 *In cazul in care in interval se gasesc mai putin de 5 numere impare, se vor afisa toate numerele impare din interval.
 */
public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		int counter = 0; 
		for (int i = left; i < right; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
				counter++;
				if (counter == 5) {
					break;
				}
				
			}
			
		}
		
	}
}

