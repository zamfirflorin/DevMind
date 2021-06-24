package com.florin.P2_Optimizarea_performantei;

public class Main {

	public static void main(String[] args) {
		
	        LazyNumberDetails lnd;
	        lnd = new LazyNumberDetails(23);
	
	        System.out.println(lnd.isPrime());
	        System.out.println(lnd.isPrime());

	        lnd.updateNumber(10);
	        System.out.println(lnd.isPrime());
	        System.out.println(lnd.isPrime());

	        lnd.checkPrimeNumber(22971);
	        lnd.checkPrimeNumber(22971);
	        lnd.checkPrimeNumber(22971) ;


	        lnd.updateNumber(22931);
	        System.out.println(lnd.isMagicNumber());
	        lnd.updateNumber(22931);
	        System.out.println(lnd.isMagicNumber());


	        lnd.updateNumber(2297111);
	        System.out.println(lnd.isMagicNumber());
	        lnd.updateNumber(229711);
	        System.out.println(lnd.isMagicNumber());



	        lnd.updateNumber(61);
	        System.out.println(lnd.isPerfectNumber());
	        lnd.updateNumber(281);
	        System.out.println(lnd.isPerfectNumber());


	        lnd.updateNumber(61);
	        System.out.println(lnd.isPerfectNumber());
	        lnd.updateNumber(6);
	        System.out.println(lnd.isPerfectNumber());


	        lnd.updateNumber(28);
	        System.out.println(lnd.isPerfectNumber());
	        lnd.updateNumber(28);
	        System.out.println(lnd.isPerfectNumber());
	    }

	

}
