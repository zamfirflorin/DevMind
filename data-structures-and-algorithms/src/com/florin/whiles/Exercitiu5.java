package com.florin.whiles;

import java.util.Scanner;

/**
 * @author fszamfi
 *5. Aminteste-ti Exercitiul 2 si modul de rezolvare. Daca pentru afisarea sirurilor ai folosit o instructiune conditionala (i.e. if) 
 *imbricata in structura repetitiva, acest exercitiu este pentru tine! 
 *Concret, task-ul tau este sa elimini instructiunea conditionala imbricata in fiecare while, pastrand functionalitatea anterioara a programului.
 * *2. Scrie un program care afiseaza urmatoarele siruri de numere, dupa citirea unei valori n de la tastatura:

Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
Exemplu, pentru n == 10:

Console
1. 0 1 2 3 4 5 6 7 8 9 10
2. 1 3 5 7 9
3. 10 8 6 4 2 0
4. 0 5 10
 */
public class Exercitiu5 {

	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int upperLimit = n;
		int lowerLiit = 0;
		//1
		for(int i = 0; i <= n; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		while(n>= 0){
			int i = n;
			System.out.print(i + " ");
			n--;
		}
		System.out.println(n);
		//2
		System.out.println();
		for(int i = 1; i <= n; i++){
			if(i%2 !=0){
				System.out.print(i + " ");
			}
		}
		//3
		System.out.println();
		for(int i = n; i>=0; i--){
			if(i%2 ==0){	
				System.out.print(i + " ");
			}
		}
		//4
		System.out.println();
		for(int i = 0; i<=n; i++){
			if(i%5 ==0){
				System.out.print(i + " ");
			}
		}
		
	}
}
