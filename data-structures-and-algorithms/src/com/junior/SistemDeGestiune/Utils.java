package com.junior.SistemDeGestiune;

import java.util.Scanner;

public class Utils {

	public static GuestsList createGuestsList(int availableSpots) {
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
		while (!isPhoneNumberValid(phoneNumber)) {
			System.out.println("Numarul de telefon introdus nu este valid va rugam reincercati");
			phoneNumber = sc.next();
		}

	
		Guest guest = new Guest(lastName, firstName, email, phoneNumber);
		guestList.addGuest(guest);
	}

	public static void checkGuest(GuestsList guestList) {
		Guest guest = getGuestOnCriteria();
		if (guest != null && guestList.isGuestRegistered(guest)) {
			System.out.println("The guest is already registered");
		} else {
			System.out.println("The guest is not registered");
		}
	}

	public static void removeGuest(GuestsList guestList) {
		Guest guest = getGuestOnCriteria();
		guestList.removeGuest(guest);
	}

	public static void updateGuest(GuestsList guestList) {
		Guest guest = getGuestOnCriteria();
		if (guest == null || !guestList.isGuestRegistered(guest)) {
			System.out.println("The guest is not registered!");
		} else {
			System.out.println("Ce camp doriti sa modificati? : " + "\n1. nume " + "\n2. prenume\r\n" + "3. email\r\n"
					+ "4. phoneNumber");
			Scanner sc = new Scanner(System.in);
			int selection = sc.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Introduceti numele de familie:");
				String lastName = sc.next();
				guestList.updateGuestLastName(guest, lastName);
				break;
			case 2:
				System.out.println("Introduceti prenumele:");
				String firstName = sc.next();
				guestList.updateGuestFirstName(guest, firstName);
				break;
			case 3:
				System.out.println("Introduceti email:");
				String email = sc.next();
				guestList.updateGuestEmail(guest, email);
				break;
			case 4:
				System.out.println("Introduceti numar de telefon (format „+40733386463“):");
				String phoneNumber = sc.next();
				guestList.updateGuestPhoneNumber(guest, phoneNumber);
				break;
			default:
				System.out.println("Alegerea nu este valida!");
				break;
			}
		}
	}

	public static Guest getGuestOnCriteria() {
		System.out.println("Pe ce criteriu veti face cautarea? : " + "\n1. nume si prenume\r\n" + "2. email\r\n"
				+ "3. phoneNumber");
		Scanner sc = new Scanner(System.in);
		Guest guest;
		int selection = sc.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Introduceti numele de familie:");
			String lastName = sc.next();
			System.out.println("Introduceti prenumele:");
			String firstName = sc.next();
			guest = new Guest(lastName, firstName);
			break;
		case 2:
			System.out.println("Introduceti email:");
			String email = sc.next();
			guest = Guest.getGuestByEmail(email);
			break;
		case 3:
			System.out.println("Introduceti numar de telefon (format „+40733386463“):");
			String phoneNumber = sc.next();
			guest = Guest.getGuestByPhoneNumber(phoneNumber);
			break;
		default:
			guest = null;
			break;
		}
		return guest;
	}

	public static void guests(GuestsList guestList) {
		if (guestList.getParticipantsList().isEmpty()) {
			System.out.println("Nu exista niciun participant in acest moment");
		}
		for (Guest guest : guestList.getParticipantsList()) {
			System.out.println(guest.getFirstName() + " " + guest.getLastName());
		}
	}

	public static void waitlist(GuestsList guestList) {
		if (guestList.getWaitingList().isEmpty()) {
			System.out.println("Nu exista nicio persoana in lista de asteptare in acest moment");
		}
		for (Guest guest : guestList.getWaitingList()) {
			System.out.println(guest.getFirstName() + " " + guest.getLastName());
		}
	}

	public static void available(GuestsList guestList) {
		System.out.println("Numarul de locuri disponibile este : " + guestList.getAvailableSpots());
	}

	public static void guests_no(GuestsList guestList) {
		System.out.println("Numarul de persoane participante este : " + guestList.getParticipantsList().size());
	}

	public static void waitlist_no(GuestsList guestList) {
		System.out.println("Numarul de persoane din lista de asteptare este : " + guestList.getWaitingList().size());
	}

	public static void subscribe_no(GuestsList guestList) {
		System.out.println("Numarul total de persoane este : " + guestList.getWaitingList().size()
				+ guestList.getParticipantsList().size());
	}

	public static void search(GuestsList guestList) {
		System.out.println("Incepe cautarea");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.next();
		guestList.search(keyword);
	}
	
	private static boolean isPhoneNumberValid(String phoneNumber) {
		if ((phoneNumber.length() == 10 || phoneNumber.length() == 12) 
				&& (phoneNumber.startsWith("07") || phoneNumber.startsWith("+407"))) {
			return true;
		}
		return false;
	}

}
