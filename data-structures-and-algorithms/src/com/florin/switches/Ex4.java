package com.florin.switches;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			switch (i % 10) {
			case 1:
			case 0:
			case 8:
				break;
			default:
				System.out.print(i + " ");
			}
		}

	}

}
