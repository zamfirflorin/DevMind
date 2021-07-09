package com.florin.Lambda;

import java.util.*;

public class Main {

    public static void main(String args[]) {
/*        new Thread(() -> {
            System.out.println("Printing from the runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();*/

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim", 21);
        Employee florin = new Employee("Florin", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(florin);

/*        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

/*
        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }
*/

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

/*        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },
                employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);*/
/*
        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        UpperConcat lc = (s1, s2) -> {
            String result = s1.toLowerCase() + s2.toLowerCase();
            return result;
        };
        UpperConcat ns = (String s1, String s2) -> s1.replace('i', 'c');
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        String anotherString = doStringStuff(lc, employees.get(0).getName(), employees.get(1).getName());
        String nsstring = doStringStuff(ns, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
        System.out.println(anotherString);
        System.out.println(nsstring);
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);*/
    }
    public final static String doStringStuff (UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda experssions class is: " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("The anoterher class name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String 1", "String 1");

/*        System.out.println("The Another Class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2){
                System.out.println("The Anonoymous Class's name is: " + getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String 1", "String 2");*/

    }

}