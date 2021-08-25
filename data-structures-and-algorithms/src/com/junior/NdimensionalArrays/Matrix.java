package com.junior.NdimensionalArrays;

import java.util.ArrayList;

public class Matrix {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(n);
		
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> newRow = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				newRow.add(0);
			}
			matrix.add(newRow);
		}
		
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				System.out.print(matrix.get(i).get(j) + "\t");
			}
			System.out.println();
		}

	}

}
