package com.junior.JSONParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class MyJSONParser {
	
	public String json = "exampleJson.json";
	public static String inputFile = "inputJson.txt";
	public String outputFile = "outputJson.txt";
	public static JSON_ARRAY jsonArray = new JSON_ARRAY();
	
	public static ArrayDeque<Character> stack = new ArrayDeque<>();
	
	public static void main(String[] args) throws FileNotFoundException {

		StringBuilder data = readDataFromFile(inputFile);
		String str = "a ad a dadsadkjhasd     adjhsdkj akd    dfahsdfb";
		
		for (Character c : data.toString().toCharArray()) {
			if (c != ' ') {
				stack.add(c);
			}
		}
		
		System.out.println(stack);
	}
	
	public static StringBuilder readDataFromFile(String inputFile) throws NullPointerException{
		StringBuilder sb = null;
		try {
			Scanner scanner = new Scanner(new BufferedReader(new FileReader(inputFile)));
			sb = new StringBuilder();
			while (scanner.hasNextLine()) {
				sb.append(scanner.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public static void convertStringToJson(StringBuilder data) {
		
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == '{') {
				JSON_OBJECT jsonObj = new JSON_OBJECT();
				
				jsonArray.add(JSON_OBJECT);
			}
		}
		
	}

	public void populateStack(ArrayDeque<Character> stack, ArrayList<Character> data) { 
		

		
	}

	public static void get(String... args) {

	}
	
	public static void put(ArrayList<String> keys, Object value) {
		
	}
	
	public static void del(ArrayList<String> keys) { 
		
	}
	



}
