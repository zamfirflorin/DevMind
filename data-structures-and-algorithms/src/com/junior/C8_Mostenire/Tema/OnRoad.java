package com.junior.C8_Mostenire.Tema;

public class OnRoad extends Vehicle{

	int noWheels = 4;
	int noDoors = 4;
	
	OnRoad(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	
	OnRoad(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
	}
	
	OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
		this.noDoors = noDoors;		
	}
	
	@Override
	protected boolean goTo(double positionX, double positionY) {
		System.out.println(String.format("Driving the vehicle on road to coordinates: %f, %f]", positionX, positionY));
		return true;
	}
	
	@Override
	protected boolean addFuel(double amount) {
		System.out.println("Adding " + amount + "l of fuel to the driving vehicle ");
		return true;
	}
	
	@Override
	protected void printInfo() {
		System.out.println("Vehicle properties:"
				+ "\n\t	- serial number: " + super.serialNumber
				+ "\n\t	- capacity: " + this.noPersons
				+ "\n\t	- name: " + this.name
				+ "\nDriving vehicle properties:"
				+ "\n\t - number of wheels:"  + this.noWheels
				+ "\n	- number of doors: " + this.noDoors);
	}
	
	
	
}
