package com.junior.FisiereNIOInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Tema1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstWord = scanner.next();
		String replacement = scanner.next();
		
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("Input.txt"))); 
			BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextsOutput.txt"))) {
			while(sc.hasNext()) {
				String currentWord = sc.next();
				if (firstWord.equals(currentWord)) {
					currentWord = replacement;
				}
				outputFile.append(currentWord + " ");
			}
			outputFile.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			scanner.close();
		}
	}
	

	

}
