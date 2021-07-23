package com.junior.C8_Mostenire.Tema;

public class OnWater extends Vehicle {

	int noEngines = 2;
	double cargoCapacity;
	
	OnWater(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	
	OnWater(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	OnWater(String serialNumber, int noPersons, String name, int noEngines) {
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
	}
	
	OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity) {
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
		this.cargoCapacity = cargoCapacity;		
	}
	
	@Override
	protected boolean goTo(double positionX, double positionY) {
		System.out.println(String.format("Sailing the vessel to coordinates: %f, %f]", positionX, positionY));
		return true;
	}
	
	@Override
	protected boolean addFuel(double amount) {
		System.out.println("Adding " + amount + "l of fuel to the vessel ");
		return true;
	}
	
	@Override
	protected void printInfo() {
		System.out.println("Vehicle properties:"
				+ "\n\t	- serial number: " + super.serialNumber
				+ "\n\t	- capacity: " + this.noPersons
				+ "\n\t	- name: " + this.name
				+ "\nVessel properties:"
				+ "\n\t - number of engines:"  + this.noEngines
				+ "\n\t	- cargo capacity: " + this.cargoCapacity);
	}
	
}
