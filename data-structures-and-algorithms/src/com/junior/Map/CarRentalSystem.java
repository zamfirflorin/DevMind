package com.junior.Map;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem implements Serializable{

	private static final long serialVersionUID = 1L;
	private static String fileName = "CarRental.dat";
	
	private static Scanner sc = new Scanner(System.in);
	HashMap<String, String> rentedCars = new HashMap<>();
	HashMap<String, RentedCars> owners = new HashMap<>();
	
	
	private void reset() {
		rentedCars = new HashMap<>();
		owners = new HashMap<>();
		System.out.println("Datele au fost resetate");
		try {
			writeToBinaryFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeToBinaryFile() throws IOException {
		try (ObjectOutputStream binaryFileOut = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName)))) {
			binaryFileOut.writeObject(rentedCars);
			binaryFileOut.writeObject(owners);
		}
	}
	
	@SuppressWarnings("unchecked")
	public  void readFromBinaryFile() throws IOException {
		try (ObjectInputStream binaryFileIn = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(fileName)))) {
			rentedCars = (HashMap<String, String>) binaryFileIn.readObject();
			owners = (HashMap<String, RentedCars>) binaryFileIn.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("A class not found exception: " + e.getMessage());
		}
	}
	
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
	
	private String getCarRent(String plateNo) throws NoSuchCarException {
		//3
		if (!rentedCars.containsKey(plateNo)) {
			throw new NoSuchCarException("Masina nu exista");
		}

		return rentedCars.get(plateNo);
	}
	
	private void rentCar(String plateNo, String ownerName) {
		if (rentedCars.containsKey(plateNo)) {
			System.out.println("Masina este deja inchiriata unui alt sofer!");
			return;
		}
		if (owners.get(ownerName) != null && owners.get(ownerName).getCarList().contains(plateNo)) {
			System.out.println("Masina este deja inchiriata lui " + ownerName);
			return;
		}

		if (!owners.containsKey(ownerName)) {
			RentedCars cars = new RentedCars();
			cars.addCar(plateNo);
			owners.put(ownerName, cars);
		} else {
			RentedCars cars = owners.get(ownerName);
			cars.addCar(plateNo);
			//owners.put(ownerName, cars); //redundant
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
			System.out.println("Acest owner nu exista");
			return -1;
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
		System.out.println("reset            - Reincarca datele din trecut");
		System.out.println("quit         	  - Inchide aplicatia");
	}
	
	
	public void run() {
		boolean quit = false;
		try {
			readFromBinaryFile();
			System.out.println("Fostele date au fost reincarcate");
		} catch (IOException e) {
			System.out.println("Datele nu au fost incarcate");
			System.out.println(e.getMessage());
		}
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
			case "reset":
				reset();
				break;
			case "getOwner":
				try {
					System.out.println(getCarRent(getPlateNo()));
				} catch (NoSuchCarException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "quit":
				try {
					writeToBinaryFile();
				} catch (IOException e) {
					System.out.println("Informatiile nu au fost salvate");
					System.out.println(e.getMessage());
				}
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
