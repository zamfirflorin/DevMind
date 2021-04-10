package com.florin.cursPatruPartII;

/**
 * @author zamfi
 *1. Foloseste operatorul paranteza (i.e. ()) pentru a face ca urmatoarea ecuatie sa fie executata de la stanga la dreapta. 
 *Practic, trebuie sa folosesti oricate perechi de paranteze pentru a compensa executia calculelor aritmetice in functie de prioritatea operatorilor. 
 *La final, afiseaza rezultatul operatiei si verifica-l cu output-ul de referinta.
 */
public class Ex1 {

	public static void main(String[] args) {
		double leftToRightOrderComputation = ((100d + 5d) * 10d - 2.23d) * 18d / 4d + 2d;

		//4716.965
		System.out.println(leftToRightOrderComputation);
		
		/*2. Follow-up la Exercitiul 1. Care este numarul minim de perechi de
		 * paranteze de care este nevoie pentru a obtine rezultatul corect? Modifica
		 * programul anterior pentru a folosi un numar minim de perechi de paranteze.
		 */
		
		//R:2
	}

}
