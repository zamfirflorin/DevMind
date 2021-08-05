package com.junior.SistemDeGestiune;

import java.util.ArrayList;

public class GuestsList {
	
	private int availableSpots;
	
	private ArrayList<Guest> guestsList;
	private ArrayList<Guest> waitingList;
	
	public GuestsList(int availableSpots) {
		this.availableSpots = availableSpots;
		guestsList = new ArrayList<>(availableSpots);
		waitingList = new ArrayList<>();
	}

	public ArrayList<Guest> getWaitingList() {
		return waitingList;
	}

	public void setWaitingList(ArrayList<Guest> waitingList) {
		this.waitingList = waitingList;
	}

	public int getAvailableSpots() {
		return availableSpots - guestsList.size();
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
	
	public void updateGuestInformation(String detail) {
		
	}

	public int addGuest(Guest guest) {
		if (guestsList.size() < availableSpots && !guestsList.contains(guest)) {
			guestsList.add(guest);
			notifyGuestConfirmation(guest);
			return 0;
		} else if (guestsList.size() == this.availableSpots) {
			waitingList.add(guest);
			notifyGuestWaitingList(guest);
			return waitingList.indexOf(guest);
		} else if (guestsList.contains(guest)) {
			return -1;
		}
		return 2;
	}
	
	public boolean removeGuest(Guest guest) {
		if (isGuestRegistered(guest)) {
			if (guestsList.contains(guest)) {
				guestsList.remove(guest);
				guestsList.add(waitingList.get(0));
				waitingList.remove(0);
				notifyGuestConfirmation(guest);
				return true;
			} else if (waitingList.contains(guest)) {
				waitingList.remove(guest);
				return true;
			}
		} 
		return false;
	}
	
	private void notifyGuestConfirmation(Guest guest) {
		System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!.");
	}
	
	private void notifyGuestWaitingList(Guest guest) {
		System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine "
				+ this.waitingList.indexOf(guest) + ". Te vom notifica daca un loc devine disponibil.");
	}
	
	public boolean isGuestRegistered(Guest guest) {
		if (isGuestInList(guest, this.guestsList) || isGuestInList(guest, this.waitingList)) {
			return true;
		}
		return false;
	}
	
	private boolean isGuestInList(Guest guest, ArrayList<Guest> list) {
		for (Guest g: list) {
			if (g.getFirstName().equalsIgnoreCase(guest.getFirstName()) &&  g.getLastName().equalsIgnoreCase(guest.getLastName()) 
				|| (g.getEmail().equalsIgnoreCase(guest.getEmail()) 
				|| (g.getPhoneNumber().equalsIgnoreCase(guest.getPhoneNumber())))) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	

}
