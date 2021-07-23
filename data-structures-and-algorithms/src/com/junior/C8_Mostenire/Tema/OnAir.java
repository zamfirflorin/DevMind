package com.junior.C8_Mostenire.Tema;

public class OnAir extends Vehicle{

	int noTurbines = 2;
	boolean hasFirstClass;
	
	OnAir(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	
	OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
		super(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
	}
	
	OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
		super(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
		this.hasFirstClass = hasFirstClass;		
	}
	
	@Override
	protected boolean goTo(double positionX, double positionY) {
		System.out.println(String.format("Flying the airplane to coordinates: %f, %f]", positionX, positionY));
		return true;
	}
	
	@Override
	protected boolean addFuel(double amount) {
		System.out.println("Adding " + amount + "l of fuel to the airplane ");
		return true;
	}
	
	@Override
	protected void printInfo() {
		System.out.println("Vehicle properties:"
				+ "\n\t	- serial number: " + super.serialNumber
				+ "\n\t	- capacity: " + this.noPersons
				+ "\n\t	- name: " + this.name
				+ "\nAirplane properties:"
				+ "\n\t - number of turbines:"  + this.noTurbines
				+ (this.hasFirstClass?"\n\thas first class":"\n\tdoes not have first class"));
	}
}
