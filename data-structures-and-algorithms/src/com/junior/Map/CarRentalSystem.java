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
	
	
}
