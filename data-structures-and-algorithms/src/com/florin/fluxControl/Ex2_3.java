package com.florin.fluxControl;

import java.util.Scanner;

/**
 * @author fszamfi
 *2.2. Se citeste un numar natural n si apoi n numere intregi. Sa se calculeze si afiseze:
numarul de numere divizibile cu 7
numarul de numere care au suma cifrelor divizibila cu 5
numarul de numere care au ultima cifra 3, 7 sau 9
numarul total de cifre ale numerelor (i.e. suma numarului de cifre al tuturor numerelor)
numarul de numere care au prima cifra 2
 */
public class Ex2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Introduceti numarul de elemente:");
		int n = sc.nextInt();
		 
		// 2.2. 1
		int div7Numbers = 0;
		 
		// 2.2. 2
		int div5Numbers = 0;    
		 
		for (int i=0; i<n; i++) {
		  System.out.println("Introduceti numarul " + (i+1) + "/" + n + ":");
		  int crtNumber = sc.nextInt();
		 
		  // 2.2. 1
		  if (crtNumber % 7 == 0) {
		    div7Numbers++;
		  }
		 
		  // 2.2. 2
		  int copyCrt = crtNumber;
		  int sumDigitsCrtNumber = 0;
		  while (copyCrt != 0) {
		    int uC = copyCrt % 10;
		    sumDigitsCrtNumber += uC;
		    copyCrt /= 10;
		  }
		  if (sumDigitsCrtNumber % 5 == 0) {
		    div5Numbers++;
		  }
		 
		}
		 
		// 2.2. 1
		System.out.println("Numere divizibile cu 7: " + div7Numbers);
		 
		// 2.2. 2
		System.out.println("Numere care au suma cifrelor divizibila cu 5: " + div5Numbers);
		
	}

}
