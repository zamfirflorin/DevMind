package com.junior.Recapitulare_IV;

public class Main {

	public static void main(String[] args) {
		Vehicle ford = new Vehicle(2020, "3FADP4EJLBM156937");
		Vehicle audi = new Vehicle(2020, "3FADP4EJ9BM156937", "B50XYZ", 153000, 2021, 3213, 6546);
		System.out.println(audi.checkVIN());
		audi.moveVehicle(4324, 3245);
		System.out.println(audi.display());
		audi.printVinDecomposed();

	}

}
