package com.florin.whiles;

import java.util.Scanner;

/**
 * @author fszamfi
 *3. Scrie un algoritm care, la fiecare pas, asteapta un numar natural la intrare si afiseaza dublul numarului introdus. 
 *Programul se va termina atunci cand utilizatorul introduce un numar negativ. Exemplu de rulare:
 *
 *
 *Introduceti un numar natural pozitiv:
5
Dublul sau este: 10
Introduceti un numar natural pozitiv:
2
Dublul sau este: 4
Introduceti un numar natural pozitiv:
15
Dublul sau este: 30
Introduceti un numar natural pozitiv:
-18
La revedere!
 */
public class Exercitiu3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		while(n >= 0){
			
			
			System.out.println("Dublul sau este: " + n*2);
			System.out.println("Introduceti un numar natural pozitiv: ");
			n = sc.nextInt();
		}
		
		System.out.println("La revedere!");
	}

}
