package com.junior.NdimensionalArrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class CiurEratostene {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> matrix = generateMatrix(1000);
		//printMatrix(matrix);
		ArrayList<ArrayList<Integer>> primes = getPrimes(matrix);
		System.out.println();
		printMatrix(primes);
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

	
	//O(n^4) time | O(n) space
	public static ArrayList<ArrayList<Integer>> getPrimes(ArrayList<ArrayList<Integer>> matrix) {
		int row = 0;
		int column = 1;
		
		firstWhile:
		while (row < matrix.size()) {
			while ( column < matrix.get(0).size() ) {
				int div = matrix.get(row).get(column);
				for (int i = 0; i < matrix.size(); i++) {
					if (row == matrix.size() - 1 && column == matrix.get(i).size() - 1) {
						break firstWhile;
					}
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
		
			ArrayList<Integer> primes = new ArrayList<>();
			for (int i = 0; i < matrix.size(); i++) {
				for (int j = 0; j < matrix.get(i).size(); j++) {
					if (matrix.get(i).get(j) != 0) {
						primes.add(matrix.get(i).get(j));
					}
				}
			}
			ArrayList<ArrayList<Integer>> result = generateMatrix(primes.size(), primes);
			return result;
		
		}
		
	
	private static boolean hasValues(int n) {
		return n == 0 || n == 2 || n == 3;
	}
	
	
	public static ArrayList<ArrayList<Integer>> generateMatrix(int n, ArrayList<Integer> numbers) {
		int rows = n % 10 == 0 ? n / 10 : (n / 10) + 1;
		int columns = n >= 10 ? 10 : n;
		ListIterator<Integer> it = numbers.listIterator();
		
		ArrayList<ArrayList<Integer>> mainMatrix = new ArrayList<>(rows);
		for (int i = 0; i < rows; i++) {
			ArrayList<Integer> row = new ArrayList<>(columns);
			for (int j = 0; j < columns; j++) {
				if (i == 0 && j == 0) {
					row.add(0);
				} else {
					row.add(it.next());
					if (!it.hasNext()) {
						break;
					}
				}
			}
		
			mainMatrix.add(row);
		}
		return mainMatrix;
	}
	
	
	
	
}
