package com.junior.Lambda;

public class ExercitiiTema {

	public static void main(String[] args) {
		
		
		//Ex 1
		IOperator adunare = (a, b) -> a + b;
		int sum = adunare.operation(3, 4);
		System.out.println("Adunarea este " + sum);
		
		IOperator scadere = (a, b) -> a - b;
		int difference = scadere.operation(8, 9);
		System.out.println("Diferenta este " + difference);
		
		
		IOperator inmultire = (a, b) -> a * b;
		int multiplication = inmultire.operation(8, 9);
		System.out.println("Inmultirea este " + multiplication);
		
		
		IOperator impartire = (a, b) -> a / b;
		int division = impartire.operation(8, 9);
		System.out.println("Impartirea este " + division);
		
		
		IOperator rest = (a, b) -> a % b;
		int modul = rest.operation(8, 9);
		System.out.println("Modul este " + modul);
		
		//Ex2
		IVerifyProperty isEven = x -> x % 2 == 0;
		boolean estePar = isEven.verifiy(9);
		System.out.println(estePar);
		

	}

}
