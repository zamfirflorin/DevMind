package com.florin.fluxControl;

import java.util.Scanner;

/**
 * @author fszamfi
 *1.2. Se citeste de la tastatura un numar natural, x. Sa se afiseze suma cifrelor numarului, alaturi de un mesaj semnificativ:
 */
public class Ex1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		while (n != 0) {
			
			int lastDigit = n % 10;
			sum += lastDigit;
			n /=10;
			
		}
		
		System.out.println("Suma cifrelor este: " + sum);

	}

}
