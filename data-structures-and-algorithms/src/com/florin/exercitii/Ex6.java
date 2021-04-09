package com.florin.exercitii;

import java.util.Scanner;

/**
 * @author fszamfi
 *6. Se citesc de la tastatura doua date calendaristice, exprimate prin an, luna, zi. Prima reprezinta data nasterii unei persoane iar a doua data curenta. 
 *Calculeaza varsta aproximativa a persoanei in numar de zile, considerand ca toate lunile calendaristice au un numar egal de zile, si anume 30 zile. 
 *Calculeaza apoi varsta persoanei in ani impliniti (intregi) si afiseaz-o.
 */
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce anul nasterii: ");
		int anNastere = sc.nextInt();
		System.out.print("Introduce luna nasterii: ");
		int lunaNastere = sc.nextInt();
		System.out.print("Introduce ziua nasterii: ");
		int ziNastere = sc.nextInt();
		
		System.out.print("Introduce anul curent: ");
		int anCurent = sc.nextInt();
		System.out.print("Introduce luna curenta: ");
		int lunaCurenta = sc.nextInt();
		
		System.out.print("Introduce ziua curenta: ");
		int ziCurenta = sc.nextInt();
		
		int luna = 30; 
		int zi = 1;
		int an = 360;
		
		int numarDeZileDataCurenta = (anCurent-1)*360 + lunaCurenta*30 + ziCurenta;
		int numarDeZileDataNastere = (anNastere-1) * 360 + lunaNastere*30 + ziNastere;
		
		
		int varstaPersoaneiInNumarDeZile = numarDeZileDataCurenta - numarDeZileDataNastere;
		String a = "varsta aproximativa a persoanei in numar de zile: " + varstaPersoaneiInNumarDeZile;
		System.out.println(a);
		
		int varstaPersoaneiInAniImpliniti = (lunaCurenta >= lunaNastere && ziCurenta >= ziNastere) ? anCurent - anNastere : (anCurent - anNastere -1);
		String b = "varsta aproximativa a persoanei in ani impliniti(intregi): " + varstaPersoaneiInAniImpliniti;
		System.out.println(b);
	}

}
