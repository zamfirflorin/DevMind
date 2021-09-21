package com.junior.Lambda;

public class LambdaFunctionRefExample {


    interface IMethodCall {
        void myMethodCall(int x);
 
        default int defaultFunction() { 
           return -1; 
        }
    }
 
    public static void functionToReference(int x) {
       System.out.println(2*x);
    }
 
    public static void main(String args[])
    {
    	IMethodCall printlnPointer = LambdaFunctionRefExample::functionToReference;
 
        // acest apel printeaza 10
        printlnPointer.myMethodCall(5);
    }
}