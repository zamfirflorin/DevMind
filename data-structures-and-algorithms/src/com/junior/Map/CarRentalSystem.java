package com.junior.Map;

import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {

	private static Scanner sc = new Scanner(System.in);
	HashMap<String, String> rentedCars = new HashMap<>();
	HashMap<String, RentedCars> ownerCars = new HashMap<>();
	
	private static String getPlateNo() {
		System.out.println("Introduceti numarul de inmatriculare: ");
		return sc.nextLine();
	}
	
	private static String getOwnerName() {
	    System.out.println("Introduceti numele proprietarului:");
	    String ownerName = sc.nextLine();	   
	   return ownerName;
	}
	
	private boolean isCarRented(String plateNo) {
		return rentedCars.containsKey(plateNo);
	}
	
	private String getCarRent(String plateNo) {
		//3
		if (!rentedCars.containsKey(plateNo)) {
			return "Masina nu exista";
		}
		return rentedCars.get(plateNo);
	}
	
	private void rentCar(String plateNo, String ownerName) {
		if (rentedCars.containsKey(plateNo)) {
			System.out.println("Masina este deja inchiriata unui alt sofer!");
			return;
		}
		rentedCars.put(plateNo, ownerName);
	}
	
	private int totalRented() {
		return rentedCars.size();
	}
	
	private void returnCar(String plateNo) {
		if (!rentedCars.containsKey(plateNo)) {
			System.out.println("Masina nu exista");
			return;
		}
		rentedCars.remove(plateNo);
		System.out.println("Masina a fost stearsa cu succes!");
	}
	
	private static void printCommandsList() {
		System.out.println("help         - Afiseaza aceasta lista de comenzi");
		System.out.println("add          - Adauga o noua pereche (masina, sofer)");
		System.out.println("check        - Verifica daca o masina este deja luata");
		System.out.println("remove       - Sterge o masina existenta din hashtable");
		System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
		System.out.println("totalRented  - Afiseaza numarul de masini inchiriate");
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
			case "totalRented":
				System.out.println(totalRented());
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
