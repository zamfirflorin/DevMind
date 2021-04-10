package com.florin.fluxControl;

import java.util.Scanner;

public class Ex1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numar = 0;
		
		while (n != 0) {
			int lastDigit = n % 10;
			numar = numar * 10 + lastDigit;
			n /= 10;
		}
		
		System.out.println(numar);

	}

}
