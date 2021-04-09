package com.florin.quizuri;
import java.util.Scanner;
 
public class ReadFromInput {
 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    System.out.println("Culoare autovehicul:");
    String carColor = scanner.next();
    System.out.println("Numar km parcursi:");
    int carKm = scanner.nextInt();
    System.out.println("Numar de inmatriculare (fara spatii):");
    String plateNo = scanner.next();
 
    System.out.println("The " + carColor + " car " + plateNo + 
                       " went " + carKm + " kilometers.");
 
    System.out.println("Driver name: ");
    String driverName = scanner.next();
    System.out.println("Driver name is: " + driverName);
 
    scanner.close();
 
  }
}