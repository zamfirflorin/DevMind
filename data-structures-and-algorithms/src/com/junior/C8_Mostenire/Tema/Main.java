package com.junior.C8_Mostenire.Tema;

public class Main {

	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle("3FDS9DFF8FSD7", 4, "Wolkswagen");
		myVehicle.printInfo();
		
		OnRoad myCar = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 4, 2);
		myCar.printInfo();
		
		OnWater myBoat = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000);
		myBoat.printInfo();
		
		OnAir plane = new OnAir("BC325987DFKJS34", 20, "Wavess", 2, false);
		plane.printInfo();
		
		plane.addFuel(9000);
		myCar.addFuel(34);
		plane.goTo(34, 24);
		
		String florin = "florin";
		String costi = "costi";
		
		boolean check = florin.equals(costi);
	}

}
