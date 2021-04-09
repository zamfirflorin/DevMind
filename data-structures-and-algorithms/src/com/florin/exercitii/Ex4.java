package com.florin.exercitii;

/**
 * 4. Se da variabila pleaseNegateMe, avand o valoare pozitiva. Scrie 3 moduri diferite care sa realizeze negarea variabilei, folosind:

Operatorul unar -
Operatorul *=
Operatorul /=
 *
 */
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int pleaseNegateMe = 100;
		
		//pleaseNegateMe = -pleaseNegateMe;
		
		//System.out.println(pleaseNegateMe); //-100
		
		
		//pleaseNegateMe *= -pleaseNegateMe;
		System.out.println(pleaseNegateMe);//-10000
		
		pleaseNegateMe /= -pleaseNegateMe;
		
		System.out.println(pleaseNegateMe); //-1
	}

}
