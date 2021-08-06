package com.junior.SistemDeGestiune;

import java.util.ArrayList;

public class GuestsList {
	
	private int availableSpots;
	private ArrayList<Guest> participantsList;
	private ArrayList<Guest> waitingList;
	
	public GuestsList(int availableSpots) {
		this.availableSpots = availableSpots;
		participantsList = new ArrayList<>(availableSpots);
		waitingList = new ArrayList<>();
	}
	public ArrayList<Guest> getWaitingList() {
		return waitingList;
	}
	public void setWaitingList(ArrayList<Guest> waitingList) {
		this.waitingList = waitingList;
	}
	public int getAvailableSpots() {
		return availableSpots - participantsList.size();
	}
	public void setAvailableSpots(int availableSpots) {
		this.availableSpots = availableSpots;
	}
	public ArrayList<Guest> getParticipantsList() {
		return participantsList;
	}
	public void setParticipantsList(ArrayList<Guest> guestsList) {
		this.participantsList = guestsList;
	}
	public void updateGuestFirstName(Guest guest, String firstName) {
		if (this.participantsList.contains(guest)) {
			int index = participantsList.indexOf(guest);
			guest = participantsList.get(index);
			guest.setFirstName(firstName);
		} else if (this.waitingList.contains(guest)) {
			int index = waitingList.indexOf(guest);
			guest = waitingList.get(index);
			guest.setFirstName(firstName);
		}
	}
	public void updateGuestLastName(Guest guest, String lastName) {
		if (this.participantsList.contains(guest)) {
			int index = participantsList.indexOf(guest);
			guest = participantsList.get(index);
			guest.setLastName(lastName);
		} else if (this.waitingList.contains(guest)) {
			int index = waitingList.indexOf(guest);
			guest = waitingList.get(index);
			guest.setLastName(lastName);
		}
	}
	public void updateGuestEmail(Guest guest, String email) {
		if (this.participantsList.contains(guest)) {
			int index = participantsList.indexOf(guest);
			guest = participantsList.get(index);
			guest.setEmail(email);
		} else if (this.waitingList.contains(guest)) {
			int index = waitingList.indexOf(guest);
			guest = waitingList.get(index);
			guest.setEmail(email);
		}
	}
	public void updateGuestPhoneNumber(Guest guest, String phoneNumber) {
		if (this.participantsList.contains(guest)) {
			int index = participantsList.indexOf(guest);
			guest = participantsList.get(index);
			guest.setPhoneNumber(phoneNumber);
		} else if (this.waitingList.contains(guest)) {
			int index = waitingList.indexOf(guest);
			guest = waitingList.get(index);
			guest.setPhoneNumber(phoneNumber);
		}
	}
	public int addGuest(Guest guest) {
		if (participantsList.size() < availableSpots && !participantsList.contains(guest)) {
			participantsList.add(guest);
			notifyGuestConfirmation(guest);
			return 0;
		} else if (participantsList.size() == this.availableSpots) {
			waitingList.add(guest);
			notifyGuestWaitingList(guest);
			return waitingList.indexOf(guest);
		} else if (participantsList.contains(guest)) {
			return -1;
		}
		return 2;
	}
	public boolean removeGuest(Guest guest) {
		if (isGuestRegistered(guest)) {
			if (participantsList.contains(guest)) {
				participantsList.remove(guest);
				participantsList.add(waitingList.get(0));
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
				+ (this.waitingList.indexOf(guest) + 1) + ". Te vom notifica daca un loc devine disponibil.");
	}
	
	public boolean isGuestRegistered(Guest guest) {
		if (isGuestInList(guest, this.participantsList) || isGuestInList(guest, this.waitingList)) {
			return true;
		}
		return false;
	}
	
	private boolean isGuestInList(Guest guest, ArrayList<Guest> list) {
		for (Guest g: list) {
			if (g.getFirstName().equalsIgnoreCase(guest.getFirstName()) && g.getLastName().equalsIgnoreCase(guest.getLastName()) 
				|| (g.getEmail().equalsIgnoreCase(guest.getEmail()) 
				|| (g.getPhoneNumber().equalsIgnoreCase(guest.getPhoneNumber())))) {
				return true;
			}
		}
		return false;
	}
	
	public void search(String keyword) {
		ArrayList<Guest> searchPool = new ArrayList<Guest>();
		searchPool.addAll(participantsList);
		searchPool.addAll(waitingList);
		ArrayList<Guest> results = new ArrayList<Guest>();
		for (Guest g: searchPool) {
			if (containsIgnoreCase(g.getFirstName(), keyword)
				|| containsIgnoreCase(g.getLastName(), keyword) 
				|| containsIgnoreCase(g.getEmail(), keyword) 
				|| containsIgnoreCase(g.getPhoneNumber(), keyword)) {
				results.add(g);
			}
		}
		for (Guest g: results) {
			System.out.println(g.getFirstName() + " " + g.getLastName() + " " + g.getEmail() + " " + g.getPhoneNumber());
		}
	}
	
	private static boolean containsIgnoreCase(String word, String keyword) {
		String baseWord = word.toLowerCase();
		String searchedWord = keyword.toLowerCase();
		if (baseWord.contains(searchedWord)) {
			return true;
		}
		return false;
	}

}
