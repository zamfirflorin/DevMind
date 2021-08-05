package com.junior.SistemDeGestiune;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bun venit! Introduceti numarul de locuri disponibile:");
		Scanner sc = new Scanner(System.in);
		int availableSpots = sc.nextInt();
		GuestsList guestList = createGuestsList(availableSpots);
		System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
		String command = sc.next();
		while(!command.equals("quit")) {

			getCommand(command);
			command = sc.next();
		}
		
		

	}
	
	public static GuestsList createGuestsList (int availableSpots) {
		GuestsList guestsList = new GuestsList(availableSpots);
		return guestsList;
	}

	
	public static void addGuest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numele de familie:");
		String lastName = sc.next();
		System.out.println("Introduceti prenumele:");
		String firstName = sc.next();
		System.out.println("Introduceti email:");
		String email = sc.next();
		System.out.println("Introduceti numar de telefon (format „+40733386463“):");
		String phoneNumber = sc.next();
	}
	
	
	private static void getCommand(String command) {
		switch(command) {
		case "help": 
			System.out.println(""
					+ "help - Afiseaza aceasta lista de comenzi\r\n"
					+ "add - Adauga o noua persoana (inscriere)\r\n"
					+ "check - Verifica daca o persoana este inscrisa la eveniment\r\n"
					+ "remove - Sterge o persoana existenta din lista\r\n"
					+ "update - Actualizeaza detaliile unei persoane\r\n"
					+ "guests - Lista de persoane care participa la eveniment\r\n"
					+ "waitlist - Persoanele din lista de asteptare\r\n"
					+ "available - Numarul de locuri libere\r\n"
					+ "guests_no - Numarul de persoane care participa la eveniment\r\n"
					+ "waitlist_no - Numarul de persoane din lista de asteptare\r\n"
					+ "subscribe_no - Numarul total de persoane inscrise\r\n"
					+ "search - Cauta toti invitatii conform sirului de caractere introdus\r\n"
					+ "quit - Inchide aplicatia");
			break;
		case "add":
			System.out.println("	Se adauga o noua persoana…)");
			addGuest();
			break;
		case "check": 
			System.out.println("- Afiseaza aceasta lista de comenzi");
			break;
		case "remove":
			System.out.println("- Adauga o noua persoana (inscriere)");
			break;
		case "update": 
			System.out.println("- Afiseaza aceasta lista de comenzi");
			break;
		case "guests":
			System.out.println("- Adauga o noua persoana (inscriere)");
			break;
		case "waitlist": 
			System.out.println("- Afiseaza aceasta lista de comenzi");
			break;
		case "available":
			System.out.println("- Adauga o noua persoana (inscriere)");
			break;
		case "guests_no": 
			System.out.println("- Afiseaza aceasta lista de comenzi");
			break;
		case "waitlist_no":
			System.out.println("- Adauga o noua persoana (inscriere)");
			break;
		case "subscribe_no": 
			System.out.println("- Afiseaza aceasta lista de comenzi");
			break;
		case "search":
			System.out.println("- Adauga o noua persoana (inscriere)");
			break;
		case "quit":
			System.out.println("- Adauga o noua persoana (inscriere)");
			break;
		default:
			System.out.println("- Nu ati introdus o comanda valabila. Va rugam reincercat!");
		}
	}


}
