package com.junior.JSONParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyJSONParser {
	
	ArrayList<JSON_ARRAY> array = new ArrayList<>();
	
	public String json = "exampleJson.json";
	public static String inputFile = "inputJson.txt";
	public String outputFile = "outputJson.txt";
	public static JSON_ARRAY jsonArray = new JSON_ARRAY();
	static int index  = 0;
	
	public static ArrayDeque<Character> charactersStack = new ArrayDeque<>();
	public static ArrayDeque<JSON_FIELD> jsons = new ArrayDeque<>();
	public static ArrayDeque<Character> firstParanthesisStack = new ArrayDeque<>();
	public static ArrayDeque<Character> paranthesisStack = new ArrayDeque<>();
	
	public static void main(String[] args) throws FileNotFoundException {

		StringBuilder data = readDataFromFile(inputFile);

		for (Character c : data.toString().toCharArray()) {
			if (c != ' ') {
				charactersStack.add(c);
			}
			if (c == '{') {
				paranthesisStack.push('}');
			} else if (c == '[') {
				paranthesisStack.push(']');
			}
			
			if (c == '{') {
				firstParanthesisStack.push(c);
			} else if (c == '[') {
				firstParanthesisStack.push(c);
			}
			
		}

		System.out.println(charactersStack);
		System.out.println(firstParanthesisStack);
		System.out.println(paranthesisStack);
	}
	
	public static void createObject(Character ch) {
		if (ch == '{' && paranthesisStack.peek() == '}') {
			createField();
			paranthesisStack.pop();
		} else if (ch == '[' && paranthesisStack.peek() == '}') {
			createField();
			paranthesisStack.pop();
		}
	}
	
	private static void createField() {
		// TODO Auto-generated method stub
		
	}

	private static void createJsonArray() {
		
		
	}

	private static void createJsonObject() {
		// TODO Auto-generated method stub
		
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
		while (index < data.length()) {
			if (data.charAt(index) == '{') {
				JSON_FIELD field = readJSONObject(index, data);
				charactersStack.add(data.charAt(index));
				index++;
			} else if(data.charAt(index) == '[') {
				JSON_FIELD jsonArr = new JSON_ARRAY();
			}
		}
	}

	private static JSON_OBJECT<String, Object> readJSONObject(int index, StringBuilder data) {
		
		StringBuilder jsonObjData = new StringBuilder();
		while (data.charAt(index) != '}') {
			jsonObjData.append(data.charAt(index));
			index++;
		}
		JSON_OBJECT<String, Object> jo = new JSON_OBJECT<>(processJSONLine2(jsonObjData));
		return jo;
	}
	
	

	
	public static HashMap<String, Object> processJSONLine2(StringBuilder line) {
		HashMap<String, Object> map = new HashMap<>();
		int index = 0;
		while (index < line.length()) {
			StringBuilder key = new StringBuilder();
			StringBuilder value = new StringBuilder();
			if (line.charAt(index) == '"') {
				index += 1;
				while(index < line.length() && line.charAt(index) != '"') {
					key.append(line.charAt(index));
					index++;
				}
				
				while (index < line.length() && line.charAt(index) != ':') {
					index++;
				}
				index += 1;
				if (index < line.length() && line.charAt(index) == '"') {
					index += 1;
					while (index < line.length() && line.charAt(index) != '"') {
						value.append(line.charAt(index));
						index++;
					}
				} else {
					while (index < line.length() && line.charAt(index) != ',') {
						value.append(line.charAt(index));
						index++;
					}
				}
			}
			index++;
			String aKey = key.toString();
			Object obj = value.toString().trim();
			map.put(aKey,  obj);
		}
		return map;
	}

	public static void get(String... args) {

	}
	
	public static void put(ArrayList<String> keys, Object value) {
		
	}

	public static void del(ArrayList<String> keys) { 
		
	}

}
