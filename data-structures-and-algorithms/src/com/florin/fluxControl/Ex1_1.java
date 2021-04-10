package com.florin.fluxControl;

import java.util.Scanner;

/**
 * @author fszamfi
 *1.1. Se citeste de la tastatura un numar natural, x. Sa se afiseze in ordine inversa cifrele numarului, alaturi de un mesaj semnificativ:
 */
public class Ex1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.print("Cifrele numarului sunt: ");
		while (number != 0) {
			int lastDigit = number % 10;
			
			System.out.print(lastDigit + ", ");
			number /= 10;
		}
	}
}
