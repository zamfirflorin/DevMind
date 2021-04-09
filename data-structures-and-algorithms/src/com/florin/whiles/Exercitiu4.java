package com.florin.whiles;

import java.util.Scanner;

/**
 * @author fszamfi
 *4. Implementeaza un modul software care citeste de la tastatura urmatoarele date (in ordine):

un mesaj (i.e. message): un sir de caractere (ce poate contine spatii)
un prag valoric (i.e. upperLimit): un numar intreg
o valoare de decrementare (i.e. dec): un numar intreg, pozitiv
Programul va numara descrescator de la upperLimit (inclusiv) pana la 0 (inclusiv) si va afisa la consola mesajul message urmat de un tab si apoi de valoarea curenta din sir. 
De asemenea, se mai afiseaza 2 mesaje speciale: Start counting… la inceput si respectiv End counting… la sfarsit. Pentru claritate, urmareste si exemplul urmator:

Input
Urmatorul numar este:
100
9
Output
Start counting...
Urmatorul numar este:	100
Urmatorul numar este:	91
Urmatorul numar este:	82
Urmatorul numar este:	73
Urmatorul numar este:	64
Urmatorul numar este:	55
Urmatorul numar este:	46
Urmatorul numar este:	37
Urmatorul numar este:	28
Urmatorul numar este:	19
Urmatorul numar este:	10
Urmatorul numar este:	1
End counting...
 */
public class Exercitiu4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String message = sc.nextLine();
		int upperLimit = sc.nextInt();
		int dec = sc.nextInt();
		
		
		System.out.println("Start counting...");
		while(upperLimit >= 0){
			System.out.println(message + "\t" + upperLimit);
			upperLimit -=dec;
		}
		System.out.println("End counting...");

	}

}
