package com.florin.ifuri;

import java.util.Scanner;

/**
 * @author fszamfi
 *1. Scrie un program care primeste de la tastatura luna calendaristica sub forma de numar (i.e. un numar intre 1 si 12 si afiseaza numele corespunzator. De exemplu:

Console
// INPUT -> OUTPUT
12 -> Decembrie
11 -> Noiembrie
7 -> Iulie
 */
public class Exercitiu1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int lunaCalendaristica = sc.nextInt();
		
		
		
		if(lunaCalendaristica == 1){
			System.out.println("Ianuarie");
		} else if(lunaCalendaristica == 2){
			System.out.println("Februarie");
		}
		else if(lunaCalendaristica == 3){
			System.out.println("Martie");
		}
		else if(lunaCalendaristica == 4){
			System.out.println("Aprilie");
		}
		else if(lunaCalendaristica == 5){
			System.out.println("Mai");
		}
		else if(lunaCalendaristica == 6){
			System.out.println("Iunie");
		}
		else if(lunaCalendaristica == 7){
			System.out.println("Iulie");
		}
		else if(lunaCalendaristica == 8){
			System.out.println("August");
		}
		else if(lunaCalendaristica == 9){
			System.out.println("Septembrie");
		}
		else if(lunaCalendaristica == 10){
			System.out.println("Octombrie");
		}
		else if(lunaCalendaristica == 11){
			System.out.println("Noiembrie");
		}
		else if(lunaCalendaristica == 12){
			System.out.println("Decembrie");
		}
		
		
		
		switch(lunaCalendaristica){
		
		case 1: 
			System.out.println("Ianuarie");
			break;
		case 2: 
			System.out.println("Februarie");
			break;
		case 3: 
			System.out.println("Martie");
			break;
		case 4: 
			System.out.println("Aprilie");
			break;
		case 5: 
			System.out.println("Mai");
			break;
		case 6: 
			System.out.println("Iunie");
			break;
		case 7: 
			System.out.println("Iulie");
			break;
		case 8: 
			System.out.println("August");
			break;
		case 9: 
			System.out.println("Septembrie");
			break;
		case 10: 
			System.out.println("Octombrie");
			break;
		case 11: 
			System.out.println("Noiembrie");
			break;
		case 12: 
			System.out.println("Decembrie");
			break;
		}
		
		
	}

}
