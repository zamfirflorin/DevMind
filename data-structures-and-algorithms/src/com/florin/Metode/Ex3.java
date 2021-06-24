package com.florin.Metode;

/**
 * @author fszamfi
 *3. Se da o metoda simpla, care realizeaza si apoi returneaza produsul a doua numere:
 */
public class Ex3 {

	public static void main(String[] args) {
	
	int a =	(int) multiply2(2, 3);
	int b = (int) multiply3(2, 3, 4);
	int c = (int) multiply4(4, 5, 6, 7);
	
	System.out.println(a + " " +  b + " " + c);
	
	}

	static double  multiply2(double operand1, double operand2) {
		  return operand1 * operand2;
	
	}
	
	static double  multiply3(double operand1, double operand2, double operand3) {
			return multiply2(operand1, operand2) * operand3;
	}
	
	static double  multiply4(double operand1, double operand2, double operand3, double operand4) {
		  return multiply3(operand1, operand2, operand3) * operand4;
	}
}
