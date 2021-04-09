package com.florin.ifuri;

import java.util.Scanner;

public class Exemplu1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Before the 'while' statement.");
		 
		System.out.println("Enter 'YES' to print the message OR anything else to quit.");
		String command = sc.nextLine();
		 
		while (command.equals("YES")) {
		    System.out.println("This message is printing now!");
		 
		    System.out.println("Enter 'YES' to print the message OR anything else to quit.");
		    command = sc.nextLine();
		}
		 
		System.out.println("After the 'while' statement");
		
		
		
	}

}
