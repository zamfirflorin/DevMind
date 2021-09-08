package com.junior.NdimensionalArrays;

import java.util.ArrayList;
import java.util.Random;

public class MatrixOperations {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>(2);
		ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>(3);
		Random random = new Random();

		for (int i = 0; i < matrixA.size(); i++) {
			ArrayList<Integer> row = new ArrayList<>(3);
			for (int j = 0; j < row.size(); j++) {
				row.add(random.nextInt(10));
			}
			matrixA.add(row);
		}
		for (int i = 0; i < matrixB.size(); i++) {
			ArrayList<Integer> row = new ArrayList<>(2);
			for (int j = 0; j < row.size(); j++) {
				row.add(random.nextInt(10));
			}
			matrixB.add(row);
		}
		//A X B
		
		for (int i = 0; i < matrixA.size(); i++) {
			for (int j = 0; j < matrixB.size(); j++) {
				
			}
		}
	}

}
