package com.florin.workshopTwo.partOne;

public class Ex2_NumereMagice {

	public static void main(String[] args) {
		
		printMagicNumbers(9000, 9050);
		
	}
		
	public static int sumDigitsMethod(int n) {
		int sum = 0; 
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	public static boolean isMagicNumber(int n) {
		int digitsSum = sumDigitsMethod(n);
		
		while (digitsSum > 9) {
			digitsSum = sumDigitsMethod(digitsSum);
		}
		return digitsSum == 3 || digitsSum == 7 || digitsSum == 9;

	}
	
	public static void printMagicNumbers(int lowerLimit, int upperLimit) {
		
		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (isMagicNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
