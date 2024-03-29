package com.junior.SistemDeGestiune;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bun venit! Introduceti numarul de locuri disponibile:");
		int availableSpots;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				availableSpots = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Introduceti un numar valid de locuri disponibile");
			}

		}
		GuestsList guestList = GuestService.createGuestsList(availableSpots);
		runCommands(guestList);
	}
	
	public static void runCommands(GuestsList guestList) {
		System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
		
		try {
			Scanner sc = new Scanner(System.in);
			String command = sc.next();
			while(!command.equals("quit")) {
				getCommand(command, guestList);
				System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
				command = sc.next();
				if (command.equals("quit")) {
					try {
						GuestService.save(guestList);
						System.out.println("Datele au fost salvate");
					} catch (IOException e) {
						System.out.println("Datele nu au fost salvate");
						System.out.println(e.getMessage());
					}
				}
			}
			System.out.println("- Aplicatia se va inchide. Va multumim!");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
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
					+ "reset - Resteaza datele\r\n"
					+ "restore - Restabileste datele\r\n"
					+ "quit - Inchide aplicatia");
			break;
		case "add":
			GuestService.addGuest(guestList);
			break;
		case "check": 
			GuestService.checkGuest(guestList);
			break;
		case "remove":
			GuestService.removeGuest(guestList);
			break;
		case "update": 
			GuestService.updateGuest(guestList);
			break;
		case "guests":
			GuestService.guests(guestList);
			break;
		case "waitlist": 
			GuestService.waitlist(guestList);
			break;
		case "available":
			GuestService.available(guestList);
			break;
		case "guests_no": 
			GuestService.guests_no(guestList);
			break;
		case "waitlist_no":
			GuestService.waitlist_no(guestList);
			break;
		case "subscribe_no": 
			GuestService.subscribe_no(guestList);
			break;
		case "search":
			GuestService.search(guestList);
			break;
		case "restore":
			try {
				GuestService.restore(guestList);
				System.out.println("Data has been restored");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			break;
		case "reset":
				GuestService.reset(guestList);
				System.out.println("Data has been reseted");
			break;
		case "quit":
			break;
		default:
			System.out.println("- Nu ati introdus o comanda valabila. Va rugam reincercat!");
			break;
		}
	}


}
