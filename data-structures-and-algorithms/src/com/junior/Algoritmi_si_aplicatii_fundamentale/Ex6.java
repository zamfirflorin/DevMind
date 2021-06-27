package com.junior.Algoritmi_si_aplicatii_fundamentale;


//Triplet Pitagoreic
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tripletPitagoreic(30);
	}
	
	public static void tripletPitagoreic(int upper) {
		for (int i = 1; i <= upper; i++) {
			for (int k = i + 1; k <= upper; k++) {
				
				int a = i * i; 
				int b = k * k;
				int ip = a + b;
				int rez = (int) Math.sqrt(ip); 
				if (rez <= upper && rez - Math.sqrt(ip) == 0.0) {
					System.out.println(String.format("%s %s %s", i, k, rez));
				}
			}
		}
	}

}
