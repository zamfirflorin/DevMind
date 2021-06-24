package com.florin.Recapitrulare;

public class Angajat {
	
	private final String cnp;
	private String nume;
	private String email;
	private String prenume;
	private int salariu;
	public static String angajator;
	
	public int calculeazaBonusAnual() {
		int bonus = 1;
		int salariu = this.salariu;
		int countFives = howManyDigits(salariu, 5);
		int countNines = howManyDigits(salariu, 9);
		
		if (countFives > countNines) {
			for (int i = 0; i < countFives; i++) {
				bonus *= 10;
			}
		} else {
			for (int i = 0; i < countNines * 2; i++) {
				bonus *=10;
			}
		}
		
		return bonus;
	}
	
	private int howManyDigits(int n, int target) {
		int counter = 0; 
		while (n > 0) {
			int lastDigit = n % 10;
			if (lastDigit == target) {
				counter++;
			}
			n /= 10;
		}
		return counter;
	}
	
	public void maresteSalariu(int bonus) {
		this.salariu += bonus;
	}
	
	public boolean valideazaCNP(String cnp){
		boolean hasLength = cnp.length() == 13;
		boolean onlyDigits = containsOnlyDigits(cnp);
		boolean firstDigitIsNotZero = Integer.parseInt(cnp.substring(0, 1)) != 0;
		boolean validMonth = Integer.parseInt(cnp.substring(4, 6)) <= 12;
		boolean validDay = Integer.parseInt(cnp.substring(6, 8)) <= 31;
		
		if (hasLength && onlyDigits && firstDigitIsNotZero && validMonth && validDay) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String toString() {
		return "Angajatul " + this.nume + " " + this.prenume + ", " + " CNP " + this.cnp + " are salariul de " + this.salariu + "  RON/luna si lucreaza la " 
				+angajator+".";
	}

	private boolean containsOnlyDigits(String str) {
		boolean isDigit = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				isDigit = false;
				break;
			}
		}
		return isDigit;
	}

	
	public Angajat(String cnp, String nume, String prenume, String email) {
		this.cnp = cnp;
		this.nume = nume; 
		this.prenume = prenume; 
		this.email = email;
	}
	
	public Angajat(String cnp, String nume, String email, String prenume, int salariu) {
		this.cnp = cnp;
		this.nume = nume;
		this.email = email;
		this.prenume = prenume;
		this.salariu = salariu;
	}

	public static String getAngajator(){
		return angajator;
	}
	
	public static void setAngajator(String newAngajator) {
		angajator = newAngajator;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
