package com.junior.InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tema2 {

	public static void main(String[] args) {
		
		try {
			Scanner firstFile = new Scanner(new BufferedReader(new FileReader("Numbers1.txt")));
			Scanner secondFile = new Scanner(new BufferedReader(new FileReader("Numbers2.txt")));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("NumbersMerge.txt"));
			
			boolean isReadFromFirst = true;
			boolean isReadFromSecond = true;
			int op1 = 0;
			int op2 = 0;
			
			while (firstFile.hasNext() || secondFile.hasNext()) {
				if (isReadFromFirst) 
					op1 = Integer.parseInt(firstFile.next());
				if (isReadFromSecond) 
					op2 = Integer.parseInt(secondFile.next());

				if (op1 < op2) {
					bw.append(op1 + " ");
					isReadFromFirst = true;
					isReadFromSecond = false;
				} else {
					bw.append(op2 + " ");
					isReadFromSecond = true;
					isReadFromFirst = false;
				}
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
