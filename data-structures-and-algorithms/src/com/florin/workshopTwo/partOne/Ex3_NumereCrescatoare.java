package com.florin.workshopTwo.partOne;

public class Ex3_NumereCrescatoare {

	public static void main(String[] args) {
		
		System.out.println(isNumarDesrescator(9976845));
		printDescendingNumbers(50, 100);
	}
	
	public static boolean isAscendingNumber(int n) {
		int reminder = 10;
		boolean check = false;
		
		while (n > 0) {
			
			if (reminder >= n % 10) {
				check = true;
			} else {
				check = false;
				break;
			}
			reminder = n % 10;
			n /= 10;
		}
		return check;
	}
	
	public static void printAscendingNumbers(int lower, int upper) { 
		
		for (int i = lower; i <= upper; i++) {
			if (isAscendingNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isNumarDesrescator(int n) {
		int reminder = 0;
		boolean check = false;
		
		while (n > 0) {
			
			if (reminder < n % 10) {
				check = true;
			} else {
				check = false;
				break;
			}
			reminder = n % 10;
			n /= 10;
		}
		return check;
	}
	
	public static void printDescendingNumbers(int lower, int upper) { 
		
		for (int i = lower; i <= upper; i++) {
			if (isNumarDesrescator(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
