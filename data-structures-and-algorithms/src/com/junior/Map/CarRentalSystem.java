package com.junior.Map;

import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {

	private static Scanner sc = new Scanner(System.in);
	HashMap<String, String> rentedCars = new HashMap<>();
	
	private static String getPlateNo() {
		System.out.println("Introduceti numarul de inmatriculare: ");
		return sc.nextLine();
	}
	
	private static String getOwnerName() {
	    System.out.println("Introduceti numele proprietarului:");
	    return sc.nextLine();
	}
	
	private boolean isCarRented(String plateNo) {
		return rentedCars.containsKey(plateNo);
	}
	
	private String getCarRent(String plateNo) {
		return rentedCars.get(plateNo);
	}
	
	private void rentCar(String plateNo, String ownerName) {
		rentedCars.put(plateNo, ownerName);
	}
	
	private void returnCar(String plateNo) {
		rentedCars.remove(plateNo);
	}
	
	private static void printCommandsList() {
		System.out.println("help         - Afiseaza aceasta lista de comenzi");
		System.out.println("add          - Adauga o noua pereche (masina, sofer)");
		System.out.println("check        - Verifica daca o masina este deja luata");
		System.out.println("remove       - Sterge o masina existenta din hashtable");
		System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
		System.out.println("quit         - Inchide aplicatia");
	}
	
	
	public void run() {
		boolean quit = false;
		while (!quit) {
			System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
			String command = sc.nextLine();
			switch (command) {
			case "help":
				printCommandsList();
				break;
			case "add":
				rentCar(getPlateNo(), getOwnerName());
				break;
			case "check":
				System.out.println(isCarRented(getPlateNo()));
				break;
			case "remove":
				returnCar(getPlateNo());
				break;
			case "getOwner":
				System.out.println(getCarRent(getPlateNo()));
				break;
			case "quit":
				System.out.println("Aplicatia se inchide...");
				quit = true;
				break;
			default:
				System.out.println("Unknown command. Choose from:");
				printCommandsList();
			}
		}
	}
	
	public static void main(String[] args) {
		new CarRentalSystem().run();
	}
	
	
}
