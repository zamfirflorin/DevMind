package com.florin.breakAndContinue;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduceti numarul "+ i + "/" + "10:" );
			int crtNb = sc.nextInt();
			
			 if (crtNb > 0) {
				 sum += crtNb;
			 } else {
				 System.out.println("negativ number....exit");
				 break;
			 }		 
		}
		
		System.out.println("Suma cifrelor este: " + sum);	
	}

}
