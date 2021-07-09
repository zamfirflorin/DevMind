package com.florin.Curs13_Clase_si_obiecte.ex1;

import java.util.Scanner;

public class Pisica {
	
	private String name;
	private String culoare; 
	private String sex;
	private double lungime;
	private double greutate;
	private boolean draguta;
	
	public void initializeState(String name, String culoare, String sex, double lungime, double greutate, boolean draguta) {
		this.name = name;
		this.culoare = culoare;
		this.sex = sex;
		this.lungime = lungime;
		this.greutate = greutate;
		this.draguta = draguta;
	}

/*	public void initializeState() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce culoarea: ");
		this.culoare = sc.next();
		System.out.println("Introduce sexul: ");
		this.sex = sc.next();
		System.out.println("Introduce lungimea: ");
		this.lungime = sc.nextDouble();
		System.out.println("Introduce greutatea: ");
		this.greutate = sc.nextDouble();
		System.out.println("Este draguta?: ");
		this.draguta = sc.hasNext();

	}*/
	
	public void meow() {
		System.out.println();
		System.out.println(this.name + " face meow....");
	}
	
	public void toarce() {
		System.out.println();
		System.out.println(this.name + " toarce...");
	}
	
	public void setDraguta(boolean draguta) {
		this.draguta = draguta;
	}
	

	public void printObjectState() {
		System.out.println("\n\n\nnnume + " + name + "culoare=" + culoare + ", sex=" + sex + ", lungime=" + lungime + ", greutate=" + greutate
				+ ", draguta=" + draguta);
	}
}
