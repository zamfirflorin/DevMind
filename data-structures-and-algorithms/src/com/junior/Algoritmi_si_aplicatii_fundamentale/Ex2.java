package com.junior.Algoritmi_si_aplicatii_fundamentale;

public class Ex2 {

	public static void main(String[] args) {
		
		basePowers(2, 10);
		System.out.println();
		toatePuterile(2, 10);
	}
	
	//puterile bazei varianta 1
	public static void basePowers(int base, int exp) {
		for (int i = 0; i <= exp; i++) {
			System.out.print((int) Math.pow(base, i) + " ");
		}
	}
	
	//puterile bazei varianta 2
	public static int[] toatePuterile(int base, int exp) {
		int[] arr = new int[exp + 1];
		int aux = 1;
		
		for (int i = 0; i <= exp; i++) {
			if (i == 0) {
				arr[i] = 1;
			} else {
				aux *= base;
				arr[i] = aux;
			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
		return arr;
	}
	
	
	

}
