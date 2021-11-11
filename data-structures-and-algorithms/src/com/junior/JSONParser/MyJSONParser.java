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
	public String inputFile = "inputJson.txt";
	public String outputFile = "outputJson.txt";
	
	public ArrayDeque<Character> stack = new ArrayDeque<>();
	
	public void populateStack(ArrayDeque<Character> stack, ArrayList<Character> data) { 
		

		
	}

	public static void get(String... args) {

	}
	
	public static void put(ArrayList<String> keys, Object value) {
		
	}
	
	public static void del(ArrayList<String> keys) { 
		
	}
	
	public static StringBuilder readDataFromFile(String inputFile) throws NullPointerException{
		StringBuilder sb = null;
		try {
			BufferedReader inputData = new BufferedReader(new FileReader(inputFile));
			sb = new StringBuilder();
			while (inputData.readLine() != null) {
				sb.append(inputData.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> commands = new ArrayList<>();
		
		while (sc.hasNext()) {
			String command = sc.next();
			commands.add(command);
		}
	}

}
