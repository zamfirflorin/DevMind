package com.florin.Curs13_Clase_si_obiecte.ex1;

public class Main {

	public static void main(String[] args) {
		
		Laptop myLaptop = new Laptop();
		Laptop razvanLaptop = new Laptop();
		
		myLaptop.initializeState("verde", 23, 43, 2020, false, "Apple");
		razvanLaptop.initializeState("white", 33, 44, 2021, true, "Hp");
		
		myLaptop.printObjectState();
		System.out.println("Este Apple?:  " + myLaptop.isAppleBrand());
		myLaptop.makesSound();
		myLaptop.close();
		
		razvanLaptop.printObjectState();
		System.out.println("Este Apple?:  " + razvanLaptop.isAppleBrand());
		razvanLaptop.makesSound();
		razvanLaptop.close();
		
		Pisica misha = new Pisica();
		Pisica sasha = new Pisica();
		
		misha.initializeState("misha","negru", "femela", 22.23, 7, true);
		sasha.initializeState("sasha", "alb", "mascul", 25, 8, true);
		
		misha.meow();
		misha.toarce();
		misha.setDraguta(false);
		
		sasha.meow();
		sasha.toarce();
		sasha.setDraguta(false);
		
		misha.printObjectState();
		sasha.printObjectState();

	}

}
