package com.junior.Curs11_Polimorfism;

public class Samsung extends Phone{

	@Override
	public void call() {
		System.out.println("Calling from a Samsung");
	}
	
	
	public void call(String number) {
		System.out.println("callind from a Samsung with the number " + number);
	}
}
