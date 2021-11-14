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
				openingParanthesisStack.offer(c);
				closingParanthesisStack.offer('}');
			} else if (c == '[') {
				openingParanthesisStack.offer(c);
				closingParanthesisStack.offer(']');
			}
		}

		
		
		
		System.out.println(charactersStack);
		System.out.println(openingParanthesisStack);
		System.out.println(closingParanthesisStack);
		
		createJsonObject(data, jsonArray);
		jsonArray.toString();
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
	
	
	public static IJsonField createJsonObject(StringBuilder data, IJsonField json) {
		index = 0;
		IJsonField field = null;
		while (index < data.length() && !closingParanthesisStack.isEmpty()) {
			if (data.charAt(index) == '{' && openingParanthesisStack.peek() == '{' && closingParanthesisStack.peek() == '}' ) {
				IJsonField jsonObj = readJSONObject(data, '}', json);
				json.add(jsonObj);
				openingParanthesisStack.pop();
				closingParanthesisStack.pop();
			} else if(data.charAt(index) == '[' && openingParanthesisStack.peek() == '[' && closingParanthesisStack.peek() == ']') {
				IJsonField jsonArr = new JSON_ARRAY();
				json.add(jsonArr);
				openingParanthesisStack.pop();
				closingParanthesisStack.pop();
			} else {
				index++;
			}
			
		}
		return field;
	}

	private static JSON_OBJECT<String, IJsonField> readJSONObject(StringBuilder data,  char endingChar, IJsonField json) {
		StringBuilder line = new StringBuilder();
		while (data.charAt(index) != endingChar) {
			line.append(data.charAt(index));
			index++;
		}
		JSON_OBJECT<String, IJsonField> jo = processJSONLine(line, json);
		return jo;
	}
	

	public static JSON_OBJECT<String, IJsonField> processJSONLine(StringBuilder line, IJsonField json) {
		JSON_OBJECT<String, IJsonField> map = new JSON_OBJECT<>();
		int index = 0;
		while (index < line.length()) {
			StringBuilder key = new StringBuilder();
			StringBuilder value = new StringBuilder();
			IJsonField field = null;
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
					IJsonField innerObject = createJsonObject(json, '[');
					field = innerObject;
				}
				else if (index < line.length() && line.charAt(index) == '{') {
					IJsonField innerObject = createJsonObject(json, '[');
					field = innerObject;
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
			Object obj =  field == null ? value.toString().trim() : field;
			map.put(aKey, obj);
		}
		return map;
	}
	
	private static IJsonField createJsonObject(IJsonField json, char c) {
		IJsonField inner = null;
		if (c == '{') {
			inner = new JSON_OBJECT<String, IJsonField>();
		} else if (c == '[') {
			inner = new JSON_ARRAY();
		}
		json.add(inner);
		return json;
	}
	
	
	
	//initialize array
		//if { add an object in the array
			//read fields
				//if [ value 

}
