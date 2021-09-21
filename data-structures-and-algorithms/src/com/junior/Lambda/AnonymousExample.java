package com.junior.Lambda;

public class AnonymousExample {
    public static void functionToReference(int i) {
       System.out.println(2*i);
    }
    public static void main(String args[])
    {
        IAlsoFuncional anonymousInstance = new IAlsoFuncional() {
            // membru care poate stoca o stare
            int count = 0;
            @Override
            public int processSingleValue(int x) {
                System.out.println("Acesta este apelul cu numarul: "
                                           + count++ + "\n " + 2*x);
                return 0;
            }
        };
 
        anonymousInstance.processSingleValue(5);
    }
}
