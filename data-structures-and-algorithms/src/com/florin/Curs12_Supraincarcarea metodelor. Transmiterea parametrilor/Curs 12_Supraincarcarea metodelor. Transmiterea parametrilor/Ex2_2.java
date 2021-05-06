package com.florin.supraincarcareaMetodelor;

/**
 * @author fszamfi
 *2.1. Defineste o metoda iterativa (i.e. multiplyWithSumI(int, int)) care realizeaza inmultirea a doua numere (i.e. a si b) folosind doar operatorul de adunare. 
 *De exemplu, pentru a calcula a * b se poate realiza o metoda care sa adune a + a + … + a de b ori sau b + b + … + b de a ori.
 */
public class Ex2_2 {

	public static void main(String[] args) {
		
		multiplyWithSumI(8,7);

	}

	public static int multiplyWithSumI(int a, int b) {
		int sum = 0;
		
		for (int i = 0; i < b; i++) {
			sum += a;
		}
		
		System.out.println(sum);
		return sum;
	}
	
}
