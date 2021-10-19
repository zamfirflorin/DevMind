
package com.florin;
/**
 * @author fszamfi
 *Factorialul unui numar (i.e. n! - citit „n factorial“) este egal cu produsul: n! = 1 * 2 * 3 * … * (n - 2) * (n - 1) * n. 
 *Implementeaza o metoda iterativa care calculeaza factorialul unui numar n, primit ca parametru. Metoda trebuie sa functioneze ca in exemplele:
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String sent = "Never underestimate a TALeNTED person Who Is willing TO SUCCeed!";
		 
		int counter = 0;
		int localCounter = 0;
		for (int i = 0; i < sent.length(); i++) {
		  char ch = sent.charAt(i);
		  if (!Character.isLetter(ch)) {
		    counter += (localCounter > 0 ? 1 : 0);
		    localCounter = 0;
		    continue;
		  }
		 
		  if(Character.isUpperCase(ch)) {
		    localCounter++;
		  } else {
		    localCounter--;
		  }
		}
		 
		System.out.println(counter);
	}

	
}
