package com.junior.Recapitulare_IV;

public class Vehicle {

	private static final String producedBy = "FORD";
	private final int productionYear;
	private final String vin;
	private String plateNumber;
	private double kilometers;
	private int lastSoldOnYear;
	private double positionX;
	private double positionY;

	
	public Vehicle(int productionYear, String vin, String plateNumber, double kilometers, int lastSoldOnYear,
			long positionX, long positionY) {
		this.productionYear = productionYear;
		this.vin = vin;
		this.plateNumber = plateNumber;
		this.kilometers = kilometers;
		this.lastSoldOnYear = lastSoldOnYear;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public Vehicle(int productionYear, String vin) {
		this.productionYear = productionYear;
		this.vin = vin;
	}
	
	public Vehicle(int productionYear, String vin, String plateNumber, int kilometers) {
		this(productionYear, vin);
		this.plateNumber = plateNumber;
		this.kilometers =  kilometers;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public double getKilometers() {
		return kilometers;
	}

	//a
	public void sellVehicle(String plateNumber, int lastSoldOnYear) {
		this.plateNumber = plateNumber;
		this.lastSoldOnYear = lastSoldOnYear;
	}
	//b

	public void moveVehicle(double newPositionX, double newPositionY) {
		double distance = Math.sqrt(Math.pow(newPositionX - positionX, 2) + Math.pow(newPositionY - positionY, 2));
		this.kilometers += distance;
	}

	//c
	public boolean isVinValid(boolean isDrivingInNorthAmerica) {
		if (isDrivingInNorthAmerica) {
			return checkVIN();
		}
		return true;
	}

	
	//3.c
	public boolean checkVIN() {
		String str = this.vin;
		StringBuilder sb = new StringBuilder(str.toUpperCase());
		int[] values = getValues(str);
		int[] weights = getWeights(values);
		int[] products = getProducts(values, weights);
		int sum = sumOfProducts(products);
		char checkDigit = 0;
		if (sum % 11 == 10) {
			checkDigit =  'X';
		} else {
			checkDigit =  (char) ('0' + sum % 11);
		}
		return checkDigit == (char) sb.charAt(8);
	}

	private int[] getProducts(int[] first, int[] second) {
		int[] products = new int[first.length];
		
		for (int i = 0; i < first.length; i++) {
			products[i] = first[i] * second[i];
		}
		return products;
	}

	private static int sumOfProducts(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	private static int getNumericCounterPartOfLetter(char c) {
		if (c == 'R' || c == 'Z') {
			return 9;
		}
		if (c == 'I' || c == 'O' || c == 'Q') {
			System.out.println("Throwing VinInvalidException character " + c + " is invalid!");
			return -1;
		}
		if (c < 65 || c > 90) {
			return 0;
		}
		int n = c <= 81 ? (c % 65 + 1) : (c % 65 + 2);
		while (n > 9 && n % 9 != 0) {
			n %= 9;
		}
		return n;
	}

	private int[] getWeights(int[] arr) {
		int[] results = new int[arr.length];
		int idx = 0;
		
		while (idx < arr.length) {
			int i = 1;
			while (i <= 10 && idx < arr.length) {
				results[idx] = calculatePositionWeight(i);
				i++;
				idx++;
			}
			
		}
		return results;
	}

	private static int calculatePositionWeight(int idx) {
		if (idx % 10 == 0) {
			return 9;
		} else if (idx % 9 == 0) {
			return 0;
		} else if (idx % 8 == 0) {
			return 10;
		} else {
			return 9 - (idx % 10);
		}
	}

	private static int[] getValues(String s) {
		int idx = 0;
		s = s.toUpperCase();
		
		int[] digits = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				digits[i] = Character.getNumericValue(s.charAt(i));
			} else {
				digits[i] = getNumericCounterPartOfLetter(s.charAt(i));
			}
		}
		return digits;
	}
	//3.d
	public void printVinDecomposed() {
		System.out.println("Identificatorul producatorului: " + this.vin.substring(0,3)
				+"\nAtributele vehiculului: " + this.vin.substring(3,8)  
				+ "\nCifra de verificare: " + this.vin.substring(8,9) 
				+ "\nAnul productiei modelului: " + this.vin.substring(9,10)
				+ "\nSeria fabricii: " + this.vin.substring(10,11)
				+ "\nIdentificatorul numeric: " + this.vin.substring(11));
	}
	
	
	//3.e
	public String display() {
		 return "Masina a fost produsa de catre "	+ this.producedBy + " in anul " + this.productionYear + " avand seria VIN "
								+ this.vin + " cu numarul de inmatriculare " + this.plateNumber + " avand " + this.kilometers 
								+ " kilometrii. \nCea mai recenta vanzare a masinii s-a produs in anul " + this.lastSoldOnYear
								+ "\nlatitudinea =  " + this.positionX
								+ "\nlongitudinea  = " + this.positionY; 	
	}

}
