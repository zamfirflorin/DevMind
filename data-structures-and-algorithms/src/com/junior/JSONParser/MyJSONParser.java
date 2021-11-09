package com.junior.JSONParser;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MyJSONParser {
	
	public String json = "example.json";
	public String input = "input.txt";
	public String output = "output.txt";

	public static void get(String... args) {

	}
	
	public static void put(ArrayList<String> keys, Object value) {
		
	}
	
	public static void del(ArrayList<String> keys) { 
		
	}
	
	//citim de la tastatura un input de intrare
	//daca comanda este get atunci facem un get
	//daca comanda este put atunci facem un put
	//daca comanda este del atunci facem un delete
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cmd;
		ArrayList<String> commands = new ArrayList<>();
		
		
		for (String s : commands) {
			System.out.print(s + " ");
		}
	}

}
