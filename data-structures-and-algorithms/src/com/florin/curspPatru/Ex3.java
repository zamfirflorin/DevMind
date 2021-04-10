package com.florin.curspPatru;

/**
 * @author zamfi
 *3. Ce va afisa urmatorul program? Ruleaza codul Java si verifica-ti raspunsul.
 */
public class Ex3 {

	public static void main(String[] args) {
		
		double precisionError = 0.001;
		int theApproximateResult = 123003;
		 
		String experimentName = "The maximum speed achieved by the object.";
		System.out.println("Experiment: " + experimentName); // Experiment: The maximum speed achieved by the object.
		System.out.println("Final speed result: " + theApproximateResult + precisionError); //Final speed result: 1230030.001

	}

}
