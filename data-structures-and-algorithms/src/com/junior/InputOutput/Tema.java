package com.junior.InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Tema {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstWord = scanner.next();
		String replacement = scanner.next();
		
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("TextInput.txt"))); 
			BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"))) {
			
			while(sc.hasNextLine()) {
				String currentWord = sc.next();
				if (currentWord == firstWord) {
					currentWord = replacement;
				}
				outputFile.write(currentWord);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
	

}
