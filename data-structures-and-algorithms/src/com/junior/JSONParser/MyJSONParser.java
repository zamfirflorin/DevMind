package com.junior.JSONParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyJSONParser {
	
	ArrayList<JSON_ARRAY> array = new ArrayList<>();
	
	public String json = "exampleJson.json";
	public static String inputFile = "inputJson.txt";
	public String outputFile = "outputJson.txt";
	public static JSON_ARRAY jsonArray = new JSON_ARRAY();
	static int index  = 0;
	
	public static ArrayDeque<Character> charactersStack = new ArrayDeque<>();
	public static ArrayDeque<IJsonField> jsons = new ArrayDeque<>();
	public static ArrayDeque<Character> openingParanthesisStack = new ArrayDeque<>();
	public static ArrayDeque<Character> closingParanthesisStack = new ArrayDeque<>();
	
	public static void main(String[] args) throws FileNotFoundException {

		StringBuilder data = readDataFromFile(inputFile);

		for (Character c : data.toString().toCharArray()) {
			if (c != ' ') {
				charactersStack.add(c);
			}
			if (c == '{') {
				closingParanthesisStack.push('}');
			} else if (c == '[') {
				closingParanthesisStack.push(']');
			}
			
			if (c == '{') {
				openingParanthesisStack.push(c);
			} else if (c == '[') {
				openingParanthesisStack.push(c);
			}
			
		}

		System.out.println(charactersStack);
		System.out.println(openingParanthesisStack);
		System.out.println(closingParanthesisStack);
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
	
	public void createJsonObject(StringBuilder data, IJsonField json) {
		while (index < data.length()) {
			if (data.charAt(index) == '{' && openingParanthesisStack.peek() == '{' && closingParanthesisStack.peek() == '}' ) {
				IJsonField jsonObj = readJSONObject(index, data, '}', json);
				json.add(jsonObj);
				index++;
				openingParanthesisStack.pop();
				closingParanthesisStack.pop();
			} else if(data.charAt(index) == '[' && openingParanthesisStack.peek() == '[' && closingParanthesisStack.peek() == ']') {
				IJsonField jsonArr = new JSON_ARRAY();
				json.add(jsonArr);
				index++;
				openingParanthesisStack.pop();
				closingParanthesisStack.pop();
			}
		}
	}

	private JSON_OBJECT<String, IJsonField> readJSONObject(int index, StringBuilder data,  char endingChar, IJsonField json) {
		StringBuilder jsonObjData = new StringBuilder();
		while (data.charAt(index) != endingChar) {
			jsonObjData.append(data.charAt(index));
			index++;
		}
		JSON_OBJECT<String, IJsonField> jo = processJSONLine(jsonObjData, json);
		return jo;
	}
	
	

	
	public JSON_OBJECT<String, IJsonField> processJSONLine(StringBuilder line, IJsonField json) {
		JSON_OBJECT<String, IJsonField> map = new JSON_OBJECT<>();
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
				} else if (index < line.length() && line.charAt(index) == '[') {
					json.createJsonObject();
				}
				else if (index < line.length() && line.charAt(index) == '{') {
					json.createJsonObject();
				}
				else {
					while (index < line.length() && line.charAt(index) != ',') {
						value.append(line.charAt(index));
						index++;
					}
				}
			}
			index++;
			String aKey = key.toString();
			Object obj =  value.toString().trim();
			map.put(aKey,  (IJsonField) obj);
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
