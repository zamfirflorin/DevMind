package com.junior.Curs11_Polimorfism;

public class Iphone extends Phone{

	@Override
	public void call() {
		System.out.println("Calling from an Iphone");
	}
	

	public void call(String number) {
		System.out.println("callind from an iphone with the number " + number);
	}
	
}
