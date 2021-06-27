package com.junior.Algoritmi_si_aplicatii_fundamentale;

import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int complementary = getComplementaryNumber(n);
		System.out.println(complementary);
	}
	
	//complementarul unui numar
	public static int getComplementaryNumber(int n) {
		int aux = 1;
		
		while (aux <= n) {
			aux *= 10;
		}
		return aux - n;
	}

}
