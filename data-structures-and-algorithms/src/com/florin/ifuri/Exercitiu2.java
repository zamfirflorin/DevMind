package com.florin.ifuri;

import java.util.Scanner;

/**
 * @author fszamfi
2. Scrie un algoritm care sa determine daca un numar n citit este sau nu par. Programul va afisa un mesaj corespunzator, de exemplu:

Console
// INPUT -> OUTPUT
3 -> Numarul 3 este numar impar.
4 -> Numarul 4 este numar par.
 */
public class Exercitiu2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n%2==0){
			System.out.println("Numarul " + n + " este par");
		} else {
			System.out.println("Numarul " + n + " este impar");
		}
		
		
		
	}

}
