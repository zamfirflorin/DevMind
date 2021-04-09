package com.florin.exercitii;

/**
 * @author fszamfi
 *1. Folosind operatorii compusi de egalitate, prescurteaza cat mai multe instructiuni din sectiunea urmatoare. 
 *Ai in vedere ca nu toate instructiunile sunt compatibile, iar unele necesita o preprocesare pentru a deveni compatibile. 
 *Asigura-te ca rezultatele sunt in continuare aceleasi.
 */
public class Ex1 {

	public static void main(String[] args) {
		int operand1 = 24, operand2 = 35, operand3 = 15, operand4 = 55;
		int result;
		 
		result = operand1 + operand2;
		result /=  operand4;
		result += operand3;
		result *= (operand1 * 2);
		result = operand3 - result;
		result += (-3) * 3 *operand4;
		 
		System.out.println(result);

	}

}
