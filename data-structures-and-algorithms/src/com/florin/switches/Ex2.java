package com.florin.switches;

import java.util.Scanner;

/**
 * @author fszamfi
 *2. Folosind structura invatata in acest capitol, scrie un 
 *program care citeste de la tastatura numele unei luni si afiseaza numarul de zile al acelei luni. Numele lunilor incep cu majuscula si se continua cu litere mici. Exemplu:
 */
public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		
		switch (month) {
		case "Ianuarie":
		case "Martie":
		case "Mai":
		case "Iulie":
		case "August":
		case "Octombrie":
		case "Decembrie":
			System.out.println("Luna " + month + " are 31 de zile.");
			break;
		case "Aprilie":
		case "Iunie":
		case "Septembrie":
		case "Noiembrie":
			System.out.println("Luna " + month + " are 30 de zile.");
			break;
		case "Februarie":
			System.out.println("Luna " + month + " are 28/29  de zile");
			break;
		default: 
			System.out.println("Nume de luna invalid");
		
		}

	}

}
