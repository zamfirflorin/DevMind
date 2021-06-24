package com.florin.recapitulareFinala;


 class GenericPackage {
	// I. Define all the necessary fields here
	private final String uniqueID;
	private double weight;
	private String packageName;
	private static String courierName;

	// II. Define all the necessary constructors and methods here
	public String getCourierName() {
		return GenericPackage.courierName;
	}

	public void setCourierName(String courierName) {
		GenericPackage.courierName = courierName;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public GenericPackage(String uniqueID, double weight, String packageName, String courierName) {
		this.uniqueID = uniqueID;
		this.weight = weight;
		this.packageName = packageName;
		GenericPackage.courierName = courierName;
	}

	public GenericPackage(String uniqueID, double weight, String packageName) {
		this.uniqueID = uniqueID;
		this.weight = weight;
		this.packageName = packageName;
	}

	private void addItem(double itemWeight) {

		this.weight += weight;

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public boolean checkID() {

		if (containsOnlyDigits(this.uniqueID) && numberOfOddNumbersIsDividableByThree(this.uniqueID)
				&& numberOfOddNumbersIsDividableByThree(this.uniqueID) && digitsSumDividableByFour(this.uniqueID)
				&& consecutiveNumbersDifferenceLessThanFive(this.uniqueID) && totalLength(this.uniqueID)) {
			return true;
		}
		return false;
	}

	public String computeDetails() {

		return "Pachetul " + this.packageName + " avand codul " + this.uniqueID + " si greutatea " + this.weight
				+ " apartine curierului " + GenericPackage.courierName;
	}

	// 1. codul este alcatuit doar din cifre (i.e. toate caracterele sunt cifre)
	public static boolean containsOnlyDigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	// 2. numarul de cifre impare este multiplu de 3
	public static boolean numberOfOddNumbersIsDividableByThree(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			int n = Character.getNumericValue(str.charAt(i));
			if (n % 2 != 0) {
				counter++;
			}
		}
		return counter % 3 == 0;
	}

	// 3. suma tuturor cifrelor formeaza un numar divizibil cu 4
	public static boolean digitsSumDividableByFour(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int n = Character.getNumericValue(str.charAt(i));
			sum += n;
		}
		return sum % 4 == 0;
	}

	// 4. diferenta dintre oricare 2 cifre consecutive din cod este mai mica
	// decat 5
	public static boolean consecutiveNumbersDifferenceLessThanFive(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			int digit = Character.getNumericValue(str.charAt(i));
			int nextDigit = Character.getNumericValue(str.charAt(i + 1));

			if (digit - nextDigit < 5 || nextDigit - digit < 5) {
				return true;
			}
		}
		return false;
	}

	// 5. lungimea totala a codului este cuprinsa intre 10 si 12 caractere
	// (inclusiv)
	public static boolean totalLength(String str) {
		return str.length() >= 10 && str.length() <= 12;
	}

	protected void printObjectFields() {
		System.out.println("Pachetul " + this.packageName + ", avand codul " + this.uniqueID + ", si greutatea "
				+ this.weight + " apartine curierului " + GenericPackage.courierName + ".");
	}

	public static boolean checkOtherID(String str) {

		if (containsOnlyDigits(str) && numberOfOddNumbersIsDividableByThree(str)
				&& numberOfOddNumbersIsDividableByThree(str) && digitsSumDividableByFour(str)
				&& consecutiveNumbersDifferenceLessThanFive(str) && totalLength(str)) {
			return true;
		}
		return false;
	}

}

public class Solution {

	public static void main(String[] args) {

		GenericPackage p1 = new GenericPackage("12345678987", 23, "Pachet", "Florin");
		System.out.println(p1.computeDetails());
		System.out.println(p1.checkID());
		System.out.println(GenericPackage.containsOnlyDigits("1234512347"));
		System.out.println(GenericPackage.consecutiveNumbersDifferenceLessThanFive("1234512347"));
		System.out.println(GenericPackage.digitsSumDividableByFour("1234512347"));
		System.out.println(GenericPackage.numberOfOddNumbersIsDividableByThree("1234512347"));
		System.out.println(GenericPackage.totalLength("1234512347"));

	}
}