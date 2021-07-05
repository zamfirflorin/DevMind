package com.devmind;

public class TestFramework {
	 

		 
		  public static MyIntWrapper initFunction() {
		    int value = 1;
		    return new MyIntWrapper(value);
		  }
		 
		  public static int mul2(int op) {
		    op *= 2;
		    return op;
		  }
		 
		  public static MyIntWrapper update(MyIntWrapper b) {
		    int updater = 10;
		    MyIntWrapper b2 = new MyIntWrapper(updater + 1);
		    b = b2;
		    mul2(updater);
		    b.setIntPrimitive(updater);
		    return b;
		  }
		 
		  public static void main(String[] args) {
		    MyIntWrapper mbw = initFunction();
		    mbw = update(mbw);
		    System.out.println(mbw.getIntPrimitive());
		  }
		}

