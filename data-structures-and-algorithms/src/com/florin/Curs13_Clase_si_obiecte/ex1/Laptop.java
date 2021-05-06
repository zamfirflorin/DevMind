package com.florin.claseSiObiecte.ex1;

import java.util.Scanner;

public class Laptop {

	private String culoare;
	private double latime; 
	private double lungime;
	private int anDeFabricatie;
	private boolean isNew;
	private String brand;
	
	public void initializeState(String culoare, double latime, double lungime, int anDeFabricatie, boolean isNew, String brand) {
		this.culoare = culoare;
		this.latime = latime;
		this.lungime = lungime;
		this.anDeFabricatie = anDeFabricatie;
		this.isNew = isNew;
		this.brand = brand;
	}

/*	public void initializeState() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce culoarea: ");
		this.culoare = sc.next();
		System.out.println("Introduce latimea: ");
		this.latime = sc.nextDouble();
		System.out.println("Introduce lungimea: ");
		this.lungime = sc.nextDouble();
		System.out.println("Introduce anul de fabricatie: ");
		this.anDeFabricatie = sc.nextInt();
		System.out.println("Care este brandul: ");
		this.brand = sc.next();
		System.out.println("Este nou? true/false:  ");
		this.isNew = sc.hasNext();

	}*/
	
	public void printObjectState() {
		System.out.println("\n\n\nCuloarea este: " + this.culoare + "\nLatimea:  " + this.latime + "\nAnFabricate: " + this.anDeFabricatie 
							+ "\nBrand: " + this.brand + "\nLungimea: " + this.lungime + "\nEste nou?:  " + this.isNew);
	}
	
	public String makesSound() {
		return "fan makes noise";
	}
	
	public boolean isAppleBrand() {
		if (this.brand.equalsIgnoreCase("apple")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void close() {
		System.out.println(this.brand + " is shutting down...");
	}

	@Override
	public String toString() {
		return "Laptop [culoare=" + culoare + ", latime=" + latime + ", lungime=" + lungime + ", anDeFabricatie="
				+ anDeFabricatie + ", isNew=" + isNew + ", brand=" + brand + "]";
	}

	
	
}
