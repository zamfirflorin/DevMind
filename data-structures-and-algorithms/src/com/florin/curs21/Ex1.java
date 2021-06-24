package com.florin.curs21;

/**
 * @author fszamfi
 *1. Utilizand cunostintele acumulate in acest capitol despre String-uri, implementeaza metodele 
 *Java de conversie a unui numar reprezentat sub forma de sir de caractere intr-un format numeric corespunzator (i.e. int, double respectiv boolean). 
 *Semnatura metodelor va fi:
 */
public class Ex1 {

	public static void main(String[] args) {
		

		int a = ConvertString.convertInt("123");
		double b = ConvertString.convertDouble("247.52");
		float c = ConvertString.convertFloat("123.24");
		short d = ConvertString.convertShort("231");
		long e = ConvertString.convertLong("233");
		boolean bool = ConvertString.convertBoolean("False");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(bool);
	}
	

	

}
