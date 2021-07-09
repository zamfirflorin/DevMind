package com.florin.Curs13_Clase_si_obiecte.ex2;

import java.util.Scanner;

public class ProfilUtilizator {

	String nume;
	String prenume;
	String email;
	String numarDeTelefon;
	int dataNasterii;
	String gen;

	public void initializeazaProfil() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdu numele: ");
		this.nume = sc.next();
		System.out.println("Introdu prenumele: ");
		this.prenume = sc.next();
		System.out.println("Introdu emailul: ");
		this.email = sc.next();
		System.out.println("Introdu numarul de telefon: ");
		this.numarDeTelefon = sc.next();
		System.out.println("Introdu anul nasterii: ");
		this.dataNasterii = sc.nextInt();
		System.out.println("Introdu genul: ");
		this.gen = sc.next();
	}

	public void actualizareEmail(String email) {
		this.email = email;
	}
	
	public void actualizareNumarTelefon(String numarDeTelefon) {
		this.numarDeTelefon = numarDeTelefon;
	}
	
	public void afisareVarsta(int an) {
		System.out.println("Varsta lui " +this.nume + " " + this.prenume +  " este de " + (an - this.dataNasterii) + " ani");
	}

	public void afisareStareInterna() {
		System.out.println("nume:" + nume + ", prenume:" + prenume + ", email:" + email + ", numarDeTelefon:"
				+ numarDeTelefon + ", dataNasterii:" + dataNasterii + ", gen:" + gen);
	}
	
	
}
