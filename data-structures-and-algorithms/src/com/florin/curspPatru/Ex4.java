package com.florin.curspPatru;

/**
 * @author zamfi
 *4. Scrie pe ciorna ce va afisa programul urmator, pornind de la Rationamentul inlantuirii operatorului '+'? Apoi verifica-te ruland codul in Eclipse.
 */
public class Ex4 {

	public static void main(String[] args) {
		double floatValue1 = 2.5, floatValue2 = 1.5;
		int roundNumber = 10;
		String strValue = "string operand";
		 
		System.out.println("Sum is: " + floatValue1 + floatValue2); //Sum is: 2.51.5
		System.out.println("floatValue1" + floatValue2); //floatValue11.5
		System.out.println(roundNumber + floatValue2 + roundNumber + "strValue" + floatValue1); //10+1.5+10+strValue+2.5 => 21.5strValue2.5
		System.out.println(strValue + floatValue1 + floatValue2); //string operand2.51.5

	}

}
