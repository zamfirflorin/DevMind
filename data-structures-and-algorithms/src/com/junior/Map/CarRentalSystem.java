package com.junior.Map;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CarRentalSystem {

	private static Scanner sc = new Scanner(System.in);
	HashMap<String, String> rentedCars = new HashMap<>();
	HashMap<String, RentedCars> owners = new HashMap<>();
	
	private static String getPlateNo() {
		System.out.println("Introduceti numarul de inmatriculare: ");
		return sc.nextLine();
	}
	
	private static String getOwnerName() {
	    System.out.println("Introduceti numele proprietarului:");

	    String ownerName = null;
	    try {
	    	sc.nextLine();
	    } catch (NoSuchElementException e) {
	    	e.printStackTrace();
	    }
	    
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
		try {
			// owners.get(ownerName) != null &&
			if (owners.get(ownerName).getCarList().contains(plateNo)) {
				throw new VPException("Masina este deja inchiriata lui " + ownerName);
			}

			if (!owners.containsKey(ownerName)) {
				RentedCars cars = new RentedCars();
				cars.addCar(plateNo);
				owners.put(ownerName, cars);
			} else {
				RentedCars cars = owners.get(ownerName);
				cars.addCar(plateNo);
				// owners.put(ownerName, cars); //redundant
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (VPException e) {
			e.printStackTrace();
		}
		rentedCars.put(plateNo, ownerName);

	}
	
	private int totalRented() {
		return rentedCars.size();
	}
	
	private void returnCar(String plateNo) throws NoSuchCarException {
		if (!rentedCars.containsKey(plateNo)) {
			throw new NoSuchCarException("Masina nu exista");
		}
		String owner = getOwnerName(plateNo);

		rentedCars.remove(plateNo);

		//remove car from owner map
		
		if (owner != null && owners.containsKey(owner)) {
			owners.get(owner).returnCar(plateNo);
		}
		System.out.println("Masina a fost returnata si stearsa cu succes!");
	}
	
	private String getOwnerName(String plateNo) {
		return rentedCars.get(plateNo);
	}
	
	private int getCarsNo(String owner) {
		if (owners.get(owner) == null) {
			throw new NoSuchOwnerException("Acest owner nu exista");
		}
		return owners.get(owner).size();
	}
	
	private void getCarsList(String owner) {
		 owners.get(owner).showCars();
	}

	private static void printCommandsList() {
		System.out.println("help              - Afiseaza aceasta lista de comenzi");
		System.out.println("add               - Adauga o noua pereche (masina, sofer)");
		System.out.println("check             - Verifica daca o masina este deja luata");
		System.out.println("remove            - Sterge o masina existenta din hashtable");
		System.out.println("getOwner          - Afiseaza proprietarul curent al masinii");
		System.out.println("totalRented  	  - Afiseaza numarul de masini inchiriate");
		System.out.println("ownerTotalRented  - Afiseaza numarul de masini inchiriate de un proprietar");
		System.out.println("ownerCarList     - Afiseaza lista de masini inchiriate de un proprietar");
		System.out.println("quit         	  - Inchide aplicatia");
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
				try {
					returnCar(getPlateNo());
				} catch (NoSuchCarException e) {
					e.printStackTrace();
				}
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
				break;
			case "ownerTotalRented":
				System.out.println(getCarsNo(getOwnerName()));
				break;
			case "ownerCarList":
				getCarsList(getOwnerName());
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
