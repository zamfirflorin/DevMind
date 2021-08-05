package com.junior.Curs11_Polimorfism;

public class Main {
	

	//runtime polymorphism sau dynamic binding.
	public static void main(String[] args) {
		Phone phone, iphone, samsung;
		
		phone = new Phone();
		iphone = new Iphone();
		Iphone anotherIphone = new Iphone();
		samsung = new Samsung();
		Samsung anotherSamsung = new Samsung();
		

		phone.call();
		
		//dynamic
		iphone.call();
		
		//static
		anotherIphone.call("testNumber");
		//dynamic
		samsung.call();
		//static
		anotherSamsung.call("testNumber");
		
	}

}
