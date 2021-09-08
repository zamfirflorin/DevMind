package com.junior.NdimensionalArrays;

import java.util.Scanner;

public class MatrixArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			int[] newRow = new int[m];
			for (int j = 0; j < m; j++) {
				arr[i][j] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}

}
