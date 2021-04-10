package com.florin.fluxControl;

import java.util.Scanner;

/**
 * @author fszamfi
 *1.2. Se citeste de la tastatura un numar natural, x. Sa se afiseze suma cifrelor numarului, alaturi de un mesaj semnificativ:
 */
public class Ex1_3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean containsOnlyEven = true, containsNine = false, goodEnding = false,  containsOneAndZero = false, isOne = false, isZero = false;
		int evenNumbers = 0, oddNumbers = 0, sum = 0, numCount = 0;
	
		while (number != 0) {
			int lastDigit = number % 10; 
			
			if (containsOnlyEven && lastDigit % 2 != 0) {
				containsOnlyEven = false;
			}
			
			if (lastDigit % 2 != 0) {
				oddNumbers++;
			} else {
				evenNumbers++;
			}
			
			if (lastDigit == 9 ) {
				containsNine = true;
			}
			
			if (numCount == 0 && (lastDigit == 3 || lastDigit == 7 || lastDigit == 9)) {
				goodEnding = true;
			}
			
			if (lastDigit == 1) {
				isOne = true;
			}
			
			if (!isZero && lastDigit == 0) {
				isZero = true;
			}
			
			if(isOne && isZero) {
				containsOneAndZero = true;
			}

			sum += lastDigit;
			numCount++;
			number /=10;
		}
		
		System.out.println("Contine numai cifre pare? R: " + containsOnlyEven);
		System.out.println("Contine mai multe cifre pare decat cifre impare? R: " + (evenNumbers > oddNumbers));
		System.out.println("Suma cifrelor sale este divizibila cu 5? R: " + (sum % 5 == 0));
		System.out.println("Numarul de cifre este multiplu de 3? " + (numCount % 3 == 0));
		System.out.println("Numarul contine cifra 9?  " + containsNine);
		System.out.println("Numarul se termina in oricare dintre cifrele 3, 7 sau 9? R: " + goodEnding);
		System.out.println("Numarul este o cifra? R: " + (numCount == 1));
		System.out.println("Numarul contine cifra 1 si cifra 0? R: " + containsOneAndZero);
		System.out.println("Numarul contine cifra 1 si cifra 0? R: " + (isOne && isZero));
	}

}
