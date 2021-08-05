package com.junior.SistemDeGestiune;

import java.util.ArrayList;

public class GuestsList {
	
	private int availableSpots;
	
	ArrayList<Guest> guestsList;
	ArrayList<Guest> waitingList;
	
	public GuestsList(int availableSpots) {
		this.availableSpots = availableSpots;
		guestsList = new ArrayList<>(availableSpots);
		waitingList = new ArrayList<>();
	}

	public int getAvailableSpots() {
		return availableSpots;
	}

	public void setAvailableSpots(int availableSpots) {
		this.availableSpots = availableSpots;
	}

	public ArrayList<Guest> getGuestsList() {
		return guestsList;
	}

	public void setGuestsList(ArrayList<Guest> guestsList) {
		this.guestsList = guestsList;
	}
	
	public int addGuest(Guest guest) {
		if (guestsList.size() < availableSpots && !guestsList.contains(guest)) {
			guestsList.add(guest);
			System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!.");
			return 0;
		} else if (guestsList.size() == this.availableSpots) {
			waitingList.add(guest);
			System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine "
					+ waitingList.indexOf(guest) + ". Te vom notifica daca un loc devine disponibil.");
			return waitingList.indexOf(guest);
		} else if (guestsList.contains(guest)) {
			return -1;
		}
		return 2;
	}
	
	public boolean isGuestRegistered(Guest guest) {
		for (Guest g: guestsList) {
			if (g.getFirstName().equalsIgnoreCase(guest.getFirstName()) &&  g.getLastName().equalsIgnoreCase(guest.getLastName()) 
				|| (g.getEmail().equalsIgnoreCase(guest.getEmail()) 
				|| (g.getPhoneNumber().equalsIgnoreCase(guest.getPhoneNumber())))) {
				return true;
			}
		}
		
		for (Guest g: waitingList) {
			if (g.getFirstName().equalsIgnoreCase(guest.getFirstName()) &&  g.getLastName().equalsIgnoreCase(guest.getLastName()) 
				|| (g.getEmail().equalsIgnoreCase(guest.getEmail()) 
				|| (g.getPhoneNumber().equalsIgnoreCase(guest.getPhoneNumber())))) {
				return true;
			}
		}
		
		return false;
	}
	

}
