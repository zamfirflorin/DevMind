package com.junior.Algoritmi_si_aplicatii_fundamentale;


//numere amicale
public class Ex4 {

	public static void main(String[] args) {
		
		System.out.println(sumDivs(220));
		System.out.println(sumDivs(284));
		
		System.out.println(areFriendlyNumbers(220, 284));
		showFriendlyNumbers(1, 10000);
		
	}
	
	private static int sumDivs(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean areFriendlyNumbers(int a, int b) {
		int x  = sumDivs(a);
		int y = sumDivs(b);
		
		return sumDivs(a) == b && sumDivs(b) == a;
	}
	
	public static void showFriendlyNumbers(int lower, int upper) {

		
		for (int i = lower; i <= upper; i++) {
			int possibleFriendOfX = sumDivs(i);
			int possibleFriendOfPossibleFiendOfX = sumDivs(possibleFriendOfX);
			
			if (i == possibleFriendOfPossibleFiendOfX && i < possibleFriendOfX) {
				System.out.println(i + " " + possibleFriendOfX);
			}
		}
	}

}
