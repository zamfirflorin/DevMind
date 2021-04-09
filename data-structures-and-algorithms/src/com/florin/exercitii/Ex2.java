package com.florin.exercitii;

/**
 * @author fszamfi
 *Scrie o sectiune de cod simplu care sa demonstreze diferenta dintre operatorii unari de pre-incrementare vs. post-incrementare respectiv pre-decrementare vs. post-decrementare.
Hint: stocheaza si afiseaza valorile returnate de toti acesti operatori si afiseaza-le alaturi de mesaje relevante.
 */
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0; 
		int y = 0; 
		
		System.out.println(x);
		System.out.println(y);
		
		//preincrementare
		System.out.println("preincrementare:");
		++x;
		System.out.println(x);
		System.out.println(y);
		
		//postincrementare
		System.out.println("postincrementare");
		y++;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("pre-decrementare");
		//pre-decrementare
		--x;
		System.out.println(x);
		System.out.println(y);
		
		//post-decrementare
		System.out.println("post-decrementare");
		--y;
		System.out.println(x);
		System.out.println(y);
	}

}
