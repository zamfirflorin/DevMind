package com.junior.C8_Mostenire.Tema;

public class Vehicle {

	final String serialNumber;
	int noPersons;
	String name;
	
	protected Vehicle(String serialNumber, int noPersons) {
		this.noPersons = noPersons;
		this.serialNumber = serialNumber;
	}
	
	protected Vehicle(String serialNumber, int noPersons, String name) {
		this.noPersons = noPersons;
		this.serialNumber = serialNumber;
		this.name = name;
	}
	
	public final String getSerialNumber() {
		return this.serialNumber;
	}
	
	protected boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	
	protected boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}
	
	protected void printInfo() {
		System.out.println("Vehicle properties:"
				+ "\n\t	- serial number: " + this.serialNumber
				+ "\n\t	- capacity: " + this.noPersons
				+ "\n\t	- name: " + this.name);
	}
	
}
