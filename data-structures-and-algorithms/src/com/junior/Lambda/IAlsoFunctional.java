package com.junior.Lambda;

interface IAlsoFuncional
{ 
    // Functie abstracta
    int processSingleValue(int x);
 
    // O metoda non-abstracta
    default void sayHello() 
    { 
       System.out.println("Hello"); 
    } 
}
