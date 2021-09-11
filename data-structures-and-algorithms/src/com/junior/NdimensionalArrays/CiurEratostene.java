package com.junior.NdimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CiurEratostene {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> matrix = generateMatrix(120);
		printMatrix(matrix);
		getPrimes(matrix);
		System.out.println();
		printMatrix(matrix);
	}

	public static ArrayList<ArrayList<Integer>> generateMatrix(int n) {
		int value = 2;
		int rows = n % 10 == 0 ? n / 10 : (n / 10) + 1;
		int columns = n >= 10 ? 10 : n;
		ArrayList<ArrayList<Integer>> mainMatrix = new ArrayList<>(rows);
		for (int i = 0; i < rows; i++) {
			ArrayList<Integer> row = new ArrayList<>(columns);
			for (int j = 0; j < columns; j++) {
				if (i == 0 && j == 0) {
					row.add(0);
				} else {
					row.add(value);
					value++;
					if (value > n) {
						break;
					}
				}
			}
			mainMatrix.add(row);
		}
		return mainMatrix;
	}
	
	public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				System.out.print(matrix.get(i).get(j) + "\t");
			}
			System.out.println();
		}
	}

	public static void getPrimes(ArrayList<ArrayList<Integer>> matrix) {
		int row = 0;
		int column = 1;
		int previous = 0;
		while (row < matrix.size()) {
			while ( column < matrix.get(0).size() ) {
				int div = matrix.get(row).get(column);
				for (int i = 0; i < matrix.size(); i++) {
					for (int j = 0; j < matrix.get(i).size(); j++) {
						int element = matrix.get(i).get(j);
						if (!hasValues(element)  && div != 0 && element != div && element % div == 0) {
							matrix.get(i).set(j, 0);
						}
					}
					
				}
				column++;
			}
				column = 0;
				row++;
			}
		}
		
	
	public static boolean hasValues(int n) {
		return n == 0 || n == 2 || n == 3;
	}
	
	
	
	
	
}
