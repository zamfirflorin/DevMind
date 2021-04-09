package com.florin.foruri;

import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
		String message = sc.nextLine();
		 
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "." + " " + message);
		}

	}

}
