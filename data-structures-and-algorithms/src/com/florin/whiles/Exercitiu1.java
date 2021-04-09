package com.florin.whiles;

import java.util.Scanner;

/**
 * @author fszamfi
 *1. Completeaza codul urmator cu o singura instructiune (la alegere) astfel incat programul sa nu mai cicleze la infinit:
 */
public class Exercitiu1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfIterations = sc.nextInt();

		while (numberOfIterations < 1000) {
			System.out.println("This will never end...");
			numberOfIterations++;
		}
	}
}
