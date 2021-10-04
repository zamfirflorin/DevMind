package com.junior.LinkedList;

public class BigNumbers {

	public int[] sum(int[] op1, int[] op2) {
		
	}

	public static void main(String[] args) {
		System.out.println("Checking input...");

		int[] op1 = { 2, 1, 7, 8 };
		int[] op2 = { 5, 9, 6 };

		BigNumbers bn = new BigNumbers();
		int[] rez = bn.sum(op1, op2);
		int[] correct = { 2, 7, 7, 4 };
		System.out.println(
				noToString(op1) + " + " + noToString(op2) + " = " 
							+ noToString(rez) + " C: " + noToString(correct));
	}

	private static String noToString(int[] no) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < no.length; i++) {
			sb.append(no[i]);
		}
		return sb.toString();
	}
	
	
	
}
