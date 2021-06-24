package com.florin.workshopTwo.partOne;

public class Ex4_ConversiaBazei {

	public static void main(String[] args) {
		
		int number = convertInBazaDoi(75);
		
		System.out.println(number);
		System.out.println(converInBazaZece(number));
		convertInBase(75, 2);
		convertInBase(number, 10);
		System.out.println(convertDecimalToBase(74, 2));
	}
	
	public static int convertInBazaDoi(int number) {
		String m = "";
		
		while (number > 0) {
			int digit = number % 2;
			m += digit;	
			number /= 2;
		}
		
		int n = Integer.valueOf(reverse(m));
		return n;
	}
	

	public static int reversed(int n) {
		int aux = n;
		int reversed = 0;
		while (aux != 0) {
			int digit = aux % 10;
			reversed = reversed*10 + digit;
			aux /= 10;
		}
		return reversed;
	}
	
	public static int converInBazaZece(int n) {
		int base = 0;
		int reversed = reversed(n);
		while (reversed != 0) {
			int primaCifra = reversed % 10;
			base = base * 2 + primaCifra;
			reversed /= 10;
		}
		return base;
	}
	
	public static int convertDecimalToBase(int number, int base) {
		String m = "";

		while (number > 0) {
			int digit = number % base;
			m += digit;	
			number /= base;
		}
		int n = Integer.valueOf(reverse(m));
		return n;
	
	}
	
	public static String reverse(String s) {
		String aux = "";
		for (int i = s.length()-1; i >= 0; i--) {
			aux += s.charAt(i);
		}
		return aux;
	}
	
	public static void convertInBase(int n, int base) {
		
		if (base == 2) {
			System.out.println(convertInBazaDoi(n));
		} else if (base == 10) {
			System.out.println(converInBazaZece(n));
		} else {
			System.out.println("Baza nu e buna");
		}
		
	}
}
