package com.junior.ReflectionAPI;

import java.lang.reflect.Method;

public class ReflectionExample {
    public void list() {
        Class student = Student.class; // TODO: trebuie creata
 
        Method[] methods = student.getDeclaredMethods();
 
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
 
    public static void main(String[] args) {
        new ReflectionExample().list();
    }
}