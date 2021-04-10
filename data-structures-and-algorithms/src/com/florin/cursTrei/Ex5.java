package com.florin.cursTrei;

/**
 * @author zamfi
 *		5. Scrie un program simplu care sa realizeze cu exactitate urmatorii pasi:

			creeaza o variabila intreaga (i.e. tipul int)
			poti sa alegi ce nume doresti
			initializeaza variabila la creare cu valoare 42
			afiseaza valoarea curenta a variabilei
			incrementeaza valoarea variabilei cu 2
			afiseaza valoarea curenta a variabilei
			actualizeaza valoarea variabilei cu valoarea 101
			afiseaza valoarea curenta a variabilei
 */
public class Ex5 {

	public static void main(String[] args) {
		int n = 42;
		System.out.println(n);
		
		n +=2;
		System.out.println(n);
		
		n = 101;
		System.out.println(n);
	}
	
}
