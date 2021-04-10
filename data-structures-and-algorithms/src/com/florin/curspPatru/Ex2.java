package com.florin.curspPatru;

/**
 * @author zamfi
 *2. Afiseaza suma variabilelor, pornind de la secventa urmatoare de cod. Scrie un mesaj relevant pentru afisare 
 *(i.e. Suma tuturor numerelor este: sau orice altceva).
	Hint: ce tip de variabila trebuie sa folosim pentru stocarea sumei?
 */
public class Ex2 {

	public static void main(String[] args) {
		
		byte aSmallValue = 23;
		int anIntegerBigValue = 15_000;
		double aFloatValue = 237.01;
		
		// Programul ar trebui sa afiseze 15260.01
		System.out.println("Suma tuturor numerelor este: " + (aSmallValue + anIntegerBigValue + aFloatValue));
		
	}
}
