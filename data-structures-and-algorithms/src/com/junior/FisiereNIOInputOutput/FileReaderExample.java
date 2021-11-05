package com.junior.FisiereNIOInputOutput;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader("input.txt"));
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				// use the next line in program
			}
		} catch (IOException e) {
			System.out.println("Something wrong has happened...");
			e.printStackTrace();
		} finally {
			// Closing the scanner will automatically close the FileReader
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
