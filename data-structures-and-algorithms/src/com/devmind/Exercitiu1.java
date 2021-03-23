package com.devmind;

public class Exercitiu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afisare(7);	
	}
	
	public static void afisare(int n) {
		
		int counter = 1; 
		
		while(counter <= n) {
			for(int i= 1; i<= counter; i++){
				System.out.print(counter);			
			}
			System.out.println();
				counter++;
		}
	}
}