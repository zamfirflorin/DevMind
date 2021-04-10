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
public class Ex2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("# n == ");
		int n = sc.nextInt();
		
		int divBySeven = 0; 
		int countSumDivFive = 0;
		int goodEnding = 0;
		int totalFigures = 0;
		int countFirstIsTwo = 0;
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Introduceti numarul " + (i+1) + "/" + n + ":");
			int numbers = sc.nextInt();
			
			if (numbers % 7 == 0) {
				divBySeven++;
			}
			
			int sum = 0;
			int counterGoodEnding = 0;
			int copyNumber = numbers;
			int reverse = 0;
			
			if (copyNumber == 0) { 
				totalFigures++;
			}
			
			while (copyNumber != 0) {
				int lastDigit = copyNumber % 10;
				sum += lastDigit;
								
				if (counterGoodEnding == 0 && (lastDigit == 3 || lastDigit == 7 || lastDigit ==9)) {
					goodEnding++;
				}
				
				reverse = reverse * 10 + lastDigit;
				totalFigures++;
				copyNumber /= 10;
			}
			
			if (sum % 5 == 0) {
				countSumDivFive++;
			}
			
			int counter = 0;
			
			while (reverse != 0) {
				int lastDigit = reverse % 10;
				
				if (counter == 0 && lastDigit == 2) {
					countFirstIsTwo++;
				}
				
				counter++;
				reverse /= 10;
			}
		}
		
		System.out.println("Numere divizibile cu 7: " + divBySeven);
		System.out.println("Numere care au suma cifrelor divizibila cu 5: " + countSumDivFive);
		System.out.println("Numere care au ultima cifra 3, 7 sau 9: " + goodEnding);
		System.out.println("Numarul total de cifre ale numerelor: " + totalFigures);
		System.out.println("Numere care au prima cifra 2: " + countFirstIsTwo);
		
	}

}
