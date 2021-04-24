package com.florin.switches;


import java.time.LocalDate;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		System.out.println("    ===== Bine ati venit ===== " + 
        "\n\t1. Interogare Sold" + 
        "\n\t2. Retragere Numerar" + 
        "\n\t3. Depunere" + 
        "\n\t4. Info" + 
        "\n\t5. Curs Valutar" + 
        "\n\t6. Iesire");
		
		Scanner sc = new Scanner(System.in);

		int sold = 100;
		LocalDate date = LocalDate.now();
		
		boolean quit = false;
	 
		while (!quit) {
		int n = sc.nextInt();
		switch (n) {
	
		case 1:
			System.out.println("Soldul dumneavoastra este " + sold + " RON.");
			break;
		case 2:
			System.out.print("Introduceti suma pe care doriti sa o retrageti, suma trebuie sa fie multiplu de 10 : ");
			int withdrawAmount = sc.nextInt();
			if (withdrawAmount <= sold && withdrawAmount % 10 == 0 && withdrawAmount > 0) {
			sold -= withdrawAmount;
			System.out.println("Operatiune efectuata cu succes.");
			System.out.println("Soldul dumneavoastra este " + sold);
			} else {
				System.out.println("Fonduri insuficiente");
			}
			break;
		case 3:
			System.out.print("Introduceti suma pe care doriti sa o depuneti: ");
			int amount = sc.nextInt();
			if (amount > 0) {
			sold += amount;
			System.out.println("Operatiune efectuata cu succes.");
			System.out.println("Soldul dumneavoastra este " + sold);
			}
			
			break;
		case 5:
			System.out.println("1 EUR = 4.9 RON");
			break;
		case 4:
			System.out.println("Este data: " + date + "\nNumele bancii este ING BANK");
			break;
		case 6:
			System.out.println("La revedere!");
			quit = true;
			break;
		default:
			System.out.println("Optiuni disponibile:" + 
			        "\n\t1. Interogare Sold" + 
			        "\n\t2. Retragere Numerar" + 
			        "\n\t3. Depunere" + 
			        "\n\t4. Info" + 
			        "\n\t5. Curs Valutar" + 
			        "\n\t6. Iesire");
		}
		}
	}
	
}
