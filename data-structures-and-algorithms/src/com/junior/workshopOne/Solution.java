package com.junior.workshopOne;

public class Solution {
	
	public static void main(String[] args) {
		countAndSay(5);
	}
	
	
    public static String countAndSay(int number) {
    	String n = number + "";
    	String result = "";
    	int it = 0;


    	while (it < n.length()) {
    		System.out.println(n.length());
    	    	int cnt = 1;
    			while (it + 1 < n.length() && Character.getNumericValue(n.charAt(it)) == Character.getNumericValue(n.charAt(it+1))) {
    				cnt++;
    				it++;
    				
    			}
    			if (number == 1) {
    				return "1";
    			}
    			result += cnt + "" + n.charAt(it) ;
    			it++;
    			
    		}
    	
    	System.out.println(result);
    	System.out.println(result.length());
    	
    
    	return result;
    }
    
   
}


// Character.getNumericValue(c);