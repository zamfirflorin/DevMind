package com.florin.switches;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i  = 0; i <= n; i++) {
			switch (i%4) {
			case 0: 
				System.out.print(" +");
				break;
			case 1:
				System.out.print(" *");
				break;
			case 2: 
				System.out.print(" ~");
				break;
			case 3: 
				System.out.print(" -");
				break;
		}
		System.out.print(i);
	}

}
}
