package com.florin.supraincarcareaMetodelor;

/**
 * @author fszamfi
 *Factorialul unui numar (i.e. n! - citit „n factorial“) este egal cu produsul: n! = 1 * 2 * 3 * … * (n - 2) * (n - 1) * n. 
 *Implementeaza o metoda iterativa care calculeaza factorialul unui numar n, primit ca parametru. Metoda trebuie sa functioneze ca in exemplele:
 */
public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println(1*2*3*4*5);
		System.out.println(factorialRecursivI(5));
		System.out.println(factorialIterativI(5));
	}

	public static int factorialIterativI(int n) {
		int result = 1; 
		
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;	
	}
	
	public static int factorialRecursivI(int n) {
		 
		if (n == 0 || n == 1) {
			return 1;
		} 
		
		return n * factorialRecursivI(n-1);
	
	}
	
	//Se observa ca numerele returnate de metoda factorial sunt numere intregi, mari. Ce tip de date va returna metoda?
	
	//Raspuns: int
}
