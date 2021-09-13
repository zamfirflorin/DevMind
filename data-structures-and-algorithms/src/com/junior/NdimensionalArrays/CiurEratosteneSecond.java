package com.junior.NdimensionalArrays;

public class CiurEratosteneSecond {

	public static void main(String[] args) {
		int rows = 5;
		int columns = 5;
		int[][] arr = getMatrix(rows, columns);
		printMatrix(arr);
		
	}
	
	public static int[][] getMatrix(int rows, int columns) {
		int value = 2;
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == 0 && j == 0) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = value++;
				}
				
			}
		}
		return arr;
	}
	
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	


}
