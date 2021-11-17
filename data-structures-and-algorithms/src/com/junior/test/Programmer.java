package com.junior.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


abstract class Writer {
public static void write() {
System.out.println("Writing...");
}
}
class Author extends Writer {
public static void write() {
System.out.println("Writing book");
}
}
public class Programmer extends Writer {
public static void write() {
System.out.println("Writing code");
}
public static void main(String[] args) {
Writer w = new Programmer();
w.write();
}
}