package com.junior.NdimensionalArrays;

import java.util.ArrayList;
import java.util.Random;

public class MatrixOperations {

	public static void main(String[] args) {
		int n = 2;
		int m = 3;

		ArrayList<ArrayList<Integer>> matrixA = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<ArrayList<Integer>> matrixB = new ArrayList<ArrayList<Integer>>(m);
		ArrayList<ArrayList<Integer>> mattrixAPlusB = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<ArrayList<Integer>> matrixAMinusB = new ArrayList<ArrayList<Integer>>(m);
		ArrayList<ArrayList<Integer>> matrixScalar = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<ArrayList<Integer>> matrixAxD = new ArrayList<ArrayList<Integer>>(n);
		ArrayList<ArrayList<Integer>> matrixD = new ArrayList<ArrayList<Integer>>(m);
		Random random = new Random();

		System.out.println("========== Matrix A =========\n");
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				row.add(random.nextInt(15));
			}
			matrixA.add(row);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrixA.get(i).size(); j++) {
				System.out.print(matrixA.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("========== Matrix B =========\n");
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				row.add(random.nextInt(15));
			}
			matrixB.add(row);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrixB.get(i).size(); j++) {
				System.out.print(matrixB.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("========== Matrix D =========\n");
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> row = new ArrayList<>(n);
			for (int j = 0; j < n; j++) {
				row.add(random.nextInt(15));
			}
			matrixD.add(row);
		}
		for (int i = 0; i < m ; i++) {
			for (int j = 0; j < matrixD.get(i).size(); j++) {
				System.out.print(matrixD.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("========== 1.  Matrix A plus B =========\n");
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				row.add(matrixA.get(i).get(j) + matrixB.get(i).get(j));
			}
			mattrixAPlusB.add(row);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < mattrixAPlusB.get(i).size(); j++) {
				System.out.print(mattrixAPlusB.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("========== 2. Matrix A minus B =========\n");
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				row.add(matrixA.get(i).get(j) - matrixB.get(i).get(j));
			}
			matrixAMinusB.add(row);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrixAMinusB.get(i).size(); j++) {
				System.out.print(matrixAMinusB.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("========== 3. Matrix A x Scalar 5=========\n");
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> row = new ArrayList<>(m);
			for (int j = 0; j < m; j++) {
				row.add(matrixA.get(i).get(j) * 5);
			}
			matrixScalar.add(row);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrixScalar.get(i).size(); j++) {
				System.out.print(matrixScalar.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("========== 4. Matrix A x Matrix D=========\n");

		matrixAxD = multiplyArray(matrixD, matrixA);
		for (int i = 0; i < matrixAxD.size(); i++) {
			for (int j = 0; j < matrixAxD.get(i).size(); j++) {
				System.out.print(matrixAxD.get(i).get(j) + "\t");
			}
			System.out.println("\n");
		}
		
		//Aplicatii - operatii matematice cu matrici
		//Adunarea

	}
	
	public static ArrayList<ArrayList<Integer>> multiplyArray(ArrayList<ArrayList<Integer>> arrA, ArrayList<ArrayList<Integer>> arrB) {
		int columns = arrA.get(0).size();
		int rows = arrB.size();
		if ( columns != rows) {
			System.out.println("Numarul de coloane a primei matrici este diferita fata de numarul de randuri a celei de-a doua");
		}
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(arrA.size());
		for (int i = 0; i < arrA.size(); i++) {
			ArrayList<Integer> row = new ArrayList<>(arrB.get(0).size());
			for (int j = 0; j < arrB.get(0).size(); j++) {
				row.add(0);
			}
			result.add(row);
		}
		
		for (int i = 0; i < arrA.size(); i++) { 
			for (int j = 0; j < arrB.get(0).size(); j++) {
				int sum = 0;
				for (int k = 0; k <  arrA.get(0).size(); k++) {
					sum += arrA.get(i).get(k) * arrB.get(k).get(j);
				}
				result.get(i).set(j, sum);
			}
		}
		
		return result;
		
	}

}
