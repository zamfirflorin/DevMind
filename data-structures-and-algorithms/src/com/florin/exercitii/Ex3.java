package com.florin.exercitii;

/**
 *3. Implementeaza secventa urmatoare de cod si indica (in comentarii) succesiunea de actualizari ale valorii variabilei temperature. 
 *Atentie: este important sa 
 *	indici toate actualizarile si in ordinea in care acestea au loc. Ulterior, vei explica trainerului rationamentul tau.
 *
 */
public class Ex3 {

	public static void main(String[] args){
		
		int temperature = 23; // celsius
		temperature = temperature++ //=23
				
				
				- ++temperature + //25;
				
				
		              +(-(--temperature))//24
		              
		              - (--temperature //23
		            		  + temperature++); //23 devine apoi 24
		
		



	
		int y = 23 - 25 + +(-24) - (23 + 23);
		
		System.out.println(y);
	
		System.out.println(temperature);
	}
	
	
}
