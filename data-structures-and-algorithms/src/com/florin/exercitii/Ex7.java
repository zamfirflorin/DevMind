package com.florin.exercitii;

import java.util.Scanner;

/**
 * @author fszamfi
 *7. Se citeste de la tastatura ora exacta, exprimata in ore, minute si secunde. 
 *Sa se determine cate secunde au trecut de la miezul noptii (i.e. ora 00:00:00) pana in acel moment de timp si sa se afiseze valoarea respectiva. 
 *Afisarea trebuie sa includa un mesaj relevant, care sa cuprinda ora citita de la tastatura 
 *si semnificatia rezultatului (ex: Numarul de secunde de la miezul noptii pana la ora 07:30:29 este de X secunde, unde X este rezultatul calculului).
 */
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti ora exact exprimata in ore minute si secunde!");
		System.out.print("\nIntroduceti numarul orei: ");
		int oraCurenta = sc.nextInt();
		System.out.print("\nIntroduceti numarul minutelor: ");
		int minutulCurent = sc.nextInt();
		System.out.print("\nIntroduceti numarul secundei: ");
		int secCurenta = sc.nextInt();
		
		int numarSecundeDeLaMiezulNoptii = oraCurenta*3600 + minutulCurent*60 + secCurenta;
		
		System.out.println("De la miezul noptii pana la ora " + oraCurenta+":" + minutulCurent + ":" + secCurenta  +  " au trecut: " + numarSecundeDeLaMiezulNoptii + " " + "secunde!");
	}

}
