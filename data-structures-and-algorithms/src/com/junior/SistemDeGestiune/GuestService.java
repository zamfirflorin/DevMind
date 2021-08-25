package com.junior.SistemDeGestiune;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuestService {

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
		while (!isEmailAddressValid(email)) {
			email = sc.next();
		}
		System.out.println("Introduceti numar de telefon (format „+40733386463“):");
		String phoneNumber = sc.next();
		while (!isPhoneNumberValid(phoneNumber)) {
			phoneNumber = sc.next();
		}
		Guest guest = new Guest(lastName, firstName, email, phoneNumber);
		guestList.addGuest(guest);
	}

	public static void checkGuest(GuestsList guestList) {
		Guest guest = getGuestOnCriteria(guestList);
		if (guest != null && guestList.isGuestRegistered(guest)) {
			System.out.println("The guest is already registered");
		} else {
			System.out.println("The guest is not registered");
		}
	}

	public static void removeGuest(GuestsList guestList) {
		Guest guest = getGuestOnCriteria(guestList);
		guestList.removeGuest(guest);
	}

	public static  void updateGuest(GuestsList guestList) {
		Guest guest = getGuestOnCriteria(guestList);
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

	public static Guest getGuestOnCriteria(GuestsList guestList) {
		System.out.println("Pe ce criteriu veti face cautarea? : " + "\n1. nume si prenume\r\n" + "2. email\r\n"
				+ "3. phoneNumber");
		Scanner sc = new Scanner(System.in);
		Guest guest;
		int selection = getOption();
		switch (selection) {
		case 1:
			System.out.println("Introduceti numele de familie:");
			String lastName = sc.next();
			System.out.println("Introduceti prenumele:");
			String firstName = sc.next();
			guest = guestList.getGuestByFirstNameAndLastName(firstName, lastName);
			break;
		case 2:
			System.out.println("Introduceti email:");
			String email = sc.next();
			while (!isEmailAddressValid(email)) {
				email = sc.next();
			}
			guest = guestList.getGuestByEmail(email);
			break;
		case 3:
			System.out.println("Introduceti numar de telefon (format „+40733386463“):");
			String phoneNumber = sc.next();
			while (!isPhoneNumberValid(phoneNumber)) {
			
				phoneNumber = sc.next();
			}
			guest = guestList.getGuestByPhoneNumber(phoneNumber);
			break;
		default:
			selection = sc.nextInt();
			guest = null;
			break;
		}
		return guest;
	}
	
	private static int getOption() {
		Scanner sc = new Scanner(System.in);
		int selection = (int) sc.nextInt();
		while (!isOptionValid(selection)) {
			System.out.println("Nu ati facut o alegere valida, reincercati");
			selection = sc.nextInt();
		}
		return selection;
	}
	
	//????????????????????
	//nu am mers sa compar in while daca selection != 1 sau selection != 2 sau diferit de 3
	private static boolean isOptionValid(int selection) {
		int[] options = {1, 2, 3};
		for (int i : options) {
			if (selection == i) {
				return true;
			}
		}
		return false;
	}

	public static void guests(GuestsList guestList) {
		if (guestList.getParticipantsList().isEmpty()) {
			System.out.println("Nu exista niciun participant in acest moment");
		}
		for (Guest guest : guestList.getParticipantsList()) {
			System.out.println(guest.toString());
		}
	}

	public static void waitlist(GuestsList guestList) {
		if (guestList.getWaitingList().isEmpty()) {
			System.out.println("Nu exista nicio persoana in lista de asteptare in acest moment");
		}
		for (Guest guest : guestList.getWaitingList()) {
			System.out.println(guest.toString());
		}
	}

	public static void available(GuestsList guestList) {
		System.out.println("Numarul de locuri disponibile este : " + (int) guestList.getAvailableSpots());
	}

	public static void guests_no(GuestsList guestList) {
		System.out.println("Numarul de persoane participante este : " + (int) guestList.getParticipantsList().size());
	}

	public static void waitlist_no(GuestsList guestList) {
		System.out.println("Numarul de persoane din lista de asteptare este : " + (int) guestList.getWaitingList().size());
	}

	public static void subscribe_no(GuestsList guestList) {
		System.out.println("Numarul total de persoane este : " + (int) (guestList.getWaitingList().size()
				+ guestList.getParticipantsList().size()));
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
		System.out.println("Numarul de telefon introdus nu este valid va rugam reincercati");
		return false;
	}
	
	private static boolean isEmailAddressValid(String email) {
		if (email.contains("@") && (email.endsWith(".com") || email.endsWith("ro"))) {
			return true;
		}
		System.out.println("Adresa de email introdusa nu este valida va rugam reincercati");
		return false;
	}

}
