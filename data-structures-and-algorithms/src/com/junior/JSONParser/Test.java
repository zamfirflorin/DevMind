package com.junior.JSONParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
//		String line = "\"path\": \"/?ids=1415539204,100000029683311,100002103943551,100001647457365,100001917546606,100001841047260&fields=id,name,first_name,middle_name,last_name,gender,locale,link,username,picture&type=large\","; 
//		System.out.println(line);
//		HashMap<String, Object> map = processJSONLine(line, 0);
//		System.out.println(map);
//        for (Map.Entry me : map.entrySet()) {
//            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
//          }
//		System.out.println(map.get("path"));
		StringBuilder data = new StringBuilder();
		Scanner sc = new Scanner(new BufferedReader(new FileReader("testJson.txt")));
		while (sc.hasNext()) {
			data.append(sc.next());
		}
		System.out.println(data);
		System.out.println();
		HashMap<String, Object> hm = processJSONLine2(data);
		
		for (Map.Entry me : hm.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}
        
		ArrayDeque<Character> stack = new ArrayDeque<>();
		

	}
	
	public static HashMap<String, Object> processJSONLine(StringBuilder line, IJsonField json) {
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
				} else if (index < line.length() && line.charAt(index) == '[') {
					
				}
				else if (index < line.length() && line.charAt(index) == '{') {
					
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
			Object obj = value.toString().trim();
			map.put(aKey, obj);
		}
		return map;
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
			map.put(aKey, obj);
		}
		return map;
	}
	
	
}
