package com.junior.SistemDeGestiune;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bun venit! Introduceti numarul de locuri disponibile:");
		Scanner sc = new Scanner(System.in);
		int availableSpots = sc.nextInt();
		GuestsList guestList = Utils.createGuestsList(availableSpots);
		runCommands(guestList);
	}
	
	public static void runCommands(GuestsList guestList) {
		System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
		Scanner sc = new Scanner(System.in);
		String command = sc.next();
		while(!command.equals("quit")) {
			getCommand(command, guestList);
			command = sc.next();
		}
		sc.close();
	}

	private static void getCommand(String command, GuestsList guestList ) {
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
			System.out.println("Se adauga o noua persoana…)");
			Utils.addGuest(guestList);
			break;
		case "check": 
			System.out.println("- Verifica daca o persoana este inscrisa la eveniment\r\n");
			Utils.checkGuest(guestList);
			break;
		case "remove":
			System.out.println("- Sterge o persoana existenta din lista\r\n");
			Utils.removeGuest(guestList);
			break;
		case "update": 
			System.out.println("- Actualizeaza detaliile unei persoane");
			Utils.updateGuest(guestList);
			break;
		case "guests":
			System.out.println("- Lista de persoane care participa la eveniment");
			Utils.guests(guestList);
			break;
		case "waitlist": 
			System.out.println("- Persoanele din lista de asteptare");
			Utils.waitlist(guestList);
			break;
		case "available":
			System.out.println("- Numarul de locuri libere");
			Utils.available(guestList);
			break;
		case "guests_no": 
			System.out.println("- Numarul de persoane care participa la eveniment");
			Utils.guests_no(guestList);
			break;
		case "waitlist_no":
			Utils.waitlist_no(guestList);
			break;
		case "subscribe_no": 
			Utils.subscribe_no(guestList);
			break;
		case "search":
			Utils.search(guestList);
			break;
		case "quit":
			System.out.println("- Aplicatia se va inchide. Va multumim!");
			break;
		default:
			System.out.println("- Nu ati introdus o comanda valabila. Va rugam reincercat!");
			break;
		}
	}


}
