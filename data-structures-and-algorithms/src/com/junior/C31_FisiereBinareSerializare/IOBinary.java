package com.junior.C31_FisiereBinareSerializare;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
 
public class IOBinary {
 
  public static void main(String[] args) throws IOException {
    String firstName = "Michael";
    String secondName = "Jordan";
    int birthYear = 1963;
    boolean isMarried = true;
    double netIncome = 258934.218;
 
    try(DataOutputStream binaryFileOut = new DataOutputStream(
            new BufferedOutputStream(new FileOutputStream("person.dat")))) {
      binaryFileOut.writeUTF(firstName);
      binaryFileOut.writeUTF(secondName);
      binaryFileOut.writeInt(birthYear);
      binaryFileOut.writeBoolean(isMarried);
      binaryFileOut.writeDouble(netIncome);
    } catch (IOException e) {
      System.out.println("IOException thrown: " + e.getMessage());
      return;
    }
 
    try(DataInputStream binaryFileIn = new DataInputStream(
            new BufferedInputStream(new FileInputStream("person.dat")))) {
      System.out.println("First name: " + binaryFileIn.readUTF());
      System.out.println("Last name: " + binaryFileIn.readUTF());
      int age = Calendar.getInstance().get(Calendar.YEAR) - binaryFileIn.readInt();
      System.out.println("Age: " + age);
      System.out.println("The person is" + (binaryFileIn.readBoolean() ? "" : " not")
                         + " married");
      System.out.println("Net income: " + binaryFileIn.readDouble());
    }
  }
}