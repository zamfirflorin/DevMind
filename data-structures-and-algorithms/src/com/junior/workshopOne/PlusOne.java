package com.junior.workshopOne;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[]{9, 9, 9, 9};
				digits = plusOne(digits);
				for(int n : digits) {
					System.out.print(n + " ");
				}
		
	}

    public static int[] plusOne(int[] digits) {
        
    	int c = 1;
    	int[] newArr = new int[digits.length];
    	int it = digits.length - 1;
    	int x;
    	int lastDigit;
    	
    	while (c > 0 && it >= 0) {
    		x = digits[it] + c;
    		lastDigit = x % 10;
    		c = x / 10;
    		newArr[it] = lastDigit;
    		it--;
    	}
    	
    	while (it >= 0) {
    		newArr[it] = digits[it];
    		it--;
    	}
    	
    	if (c > 0) {
    		int[] n_d2 = new int[digits.length + 1];
    		n_d2[0] = 1;
    		return n_d2;
    	}
    	
    	return newArr;
    	
    }
	
}
