package com.junior.NdimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrixDimension = 5; //sc.nextInt();
		int mainDiagValue = 1; // sc.nextInt();
		int sndDiagValue = 2; //sc.nextInt();
		

		
		int leftValue = 4; //sc.nextInt();
		int upValue = 5; // sc.nextInt();
		int rightValue = 6; //sc.nextInt();
		int bottomValue = 7; //sc.nextInt();
		
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(matrixDimension);
		
		for (int i = 0; i < matrixDimension; i++) {
			ArrayList<Integer> newRow = new ArrayList<>(matrixDimension);
			for (int j = 0; j < matrixDimension; j++) {
				newRow.add(0);
			}
			matrix.add(newRow);
		}
		

		int left = 0;
		int up = 0;
		int right = matrixDimension - 1;
		int down = matrixDimension -1;
		
		while (true) {
			for (int i = up; i <= right; i++) {
				matrix.get(up).set(i, upValue);
			}
			up++;
			if (left > right) {
				break;
			}
			for (int i = up; i <= down; i++) {
				matrix.get(i).set(right, rightValue);
			}
			right--;
			if (down < up) {
				break;
			}

			for (int i = left; i <= down; i++) {
				matrix.get(i).set(left, leftValue);
			}
			left++;
			if (right < left)
				break;
			for (int i = right; i >= left; i--) {
				matrix.get(down).set(i, bottomValue);
			}
			down--;
			if (down < up) {
				break;
			}
			
		}
		for (int i = 0; i < matrix.size(); i++) {
			matrix.get(i).set(i, mainDiagValue);
		}
		int indexJ = matrixDimension - 1;
		for (int i = 0; i < matrixDimension; i++) {
				matrix.get(i).set(indexJ, sndDiagValue);
				indexJ--;
			
		}
		if (matrixDimension % 2 != 0) {
			int centerValue = sc.nextInt();
			matrix.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
		}
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				System.out.print(matrix.get(i).get(j) + "\t");
			}
			System.out.println();
		}

	}

}
