package com.junior.Recapitulare_II_Recursivitate_Arrayuri;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println(reverseNumberR(123));

	}
	
	//a. Implementeaza o metoda recursiva (i.e. reverseNumberR(int number)) 
	//care primeste ca parametru un numar intreg, pozitiv si returneaza inversul numarului.
	
	public static int reverseNumberR(int n) {
		if(n <= 9) {
			return n;
		}
		int x = countDigits(n / 10);
		int val = (n % 10) * (int) Math.pow(10, x);
		int res =  reverseNumberR(n / 10) + val;
		return res;
	}

	private static int countDigits(int n) {
		int aux = 1;
		
		while (n > 9) {
			n /= 10;
			aux++;
		}
		return aux;
		
	}
	
	//b. Implementeaza algoritmul anterior folosind de aceasta data o metoda iterativa (care implicit, 
	//este mult mai eficienta decat varianta recursiva). Rezultatele produse de cele doua metode trebuie sa fie identice.

	private static int reverseNumberI(int n) {
		int reversed = 0;
		while(n > 0) {
			int lastDigit = n % 10;
			reversed = reversed * 10 + lastDigit;
			n /= 10;
		}
		return reversed;
	}
	

}
