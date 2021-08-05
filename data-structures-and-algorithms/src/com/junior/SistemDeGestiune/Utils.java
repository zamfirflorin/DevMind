package com.junior.SistemDeGestiune;

import java.util.Scanner;

public class Utils {

	public static GuestsList createGuestsList (int availableSpots) {
		GuestsList guestsList = new GuestsList(availableSpots);
		return guestsList;
	}
	
	public static void addGuest(GuestsList guestList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numele de familie:");
		String lastName = sc.next();
		System.out.println("Introduceti prenumele:");
		String firstName = sc.next();
		System.out.println("Introduceti email:");
		String email = sc.next();
		System.out.println("Introduceti numar de telefon (format „+40733386463“):");
		String phoneNumber = sc.next();
		Guest guest = new Guest(lastName, firstName, email, phoneNumber);
		guestList.addGuest(guest);
		sc.close();
	}

	public static void checkGuest(GuestsList guestList) {
		System.out.println("Pe ce criteriu veti face cautarea? : " 
				+ "\n1. nume si prenume\r\n"
				+ "2. email\r\n"
				+ "3. phoneNumber");
		Scanner sc = new Scanner(System.in);
		int selection = sc.nextInt();
		switch (selection) {
			case 1: 
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
		}
		System.out.println("Introduceti numele de familie:");
		String lastName = sc.next();
		System.out.println("Introduceti prenumele:");
		String firstName = sc.next();
		System.out.println("Introduceti email:");
		String email = sc.next();
		System.out.println("Introduceti numar de telefon (format „+40733386463“):");
		String phoneNumber = sc.next();
		sc.close();
		Guest guest = new Guest(lastName, firstName, email, phoneNumber);
		if (guestList.isGuestRegistered(guest)) {
			System.out.println("The guest is already registered");
		} else {
			System.out.println("The guest is not registered");
		}
		
	}

	public static void removeGuest(GuestsList guestList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numele de familie:");
		String lastName = sc.next();
		System.out.println("Introduceti prenumele:");
		String firstName = sc.next();
		System.out.println("Introduceti email:");
		String email = sc.next();
		System.out.println("Introduceti numar de telefon (format „+40733386463“):");
		String phoneNumber = sc.next();
		sc.close();
		Guest guest = new Guest(lastName, firstName, email, phoneNumber);
		
	}

	public static void updateGuest(GuestsList guestList) {
		
		
	}

	public static void guests(GuestsList guestList) {
		
		
	}

	public static void waitlist(GuestsList guestList) {
		
		
	}

	public static void available(GuestsList guestList) {
		
		
	}

	public static void guests_no(GuestsList guestList) {
		
		
	}

	public static void waitlist_no(GuestsList guestList) {
		
		
	}

	public static void subscribe_no(GuestsList guestList) {
		
		
	}

	public static void search(GuestsList guestList) {
		
		
	}
	
}
