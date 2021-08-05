package com.junior.matrici;

import java.util.Random;

public class MultiDimensionalArray {

	private static Random random = new Random();
	private static int dimensionLimit = 9;
	private static int valueLimit = 200;

	private static int[] dirX = { -1, -1, 0, +1, +1, +1, 0, -1 };
	private static int[] dirY = { 0, +1, +1, +1, 0, -1, -1, -1 };

	public static void main(String[] args) {

		// random number;
		int n = random.nextInt(dimensionLimit);
		int m = random.nextInt(dimensionLimit);

		int[][] matrix = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = random.nextInt(valueLimit);
			}
		}

		System.out.println("The matrix is:");
		
		System.out.println();

	}
}
