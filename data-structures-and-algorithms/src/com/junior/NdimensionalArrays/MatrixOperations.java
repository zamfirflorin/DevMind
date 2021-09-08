package com.junior.NdimensionalArrays;

import java.util.ArrayList;
import java.util.Random;

public class MatrixOperations {

	public static void main(String[] args) {
		int n = 2;
		int m = 3;
		ArrayList<ArrayList<Integer>> matrixA = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<ArrayList<Integer>> matrixB = new ArrayList<ArrayList<Integer>>(m);
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				row.add(0);
			}
			matrixA.add(row);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrixA.get(i).size(); j++) {
				System.out.print(matrixA.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> row = new ArrayList<>(n);
			for (int j = 0; j < n; j++) {
				row.add(0);
			}
			matrixB.add(row);
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < matrixB.get(i).size(); j++) {
				System.out.print(matrixB.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		//Aplicatii - operatii matematice cu matrici
		//Adunarea

	}

}
