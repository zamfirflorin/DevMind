package com.florin.curs21;

public class Ex3 {

	public static void main(String[] args) {
		String str = "The number 1 deadliest animal on the PLANET Earth is the ©Mosquito!®";
		System.out.println(convertLetters(str));

	}
	
	public static String convertLetters(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		for (int i = 0; i < sb.length(); i++) {
			if (Character.isLetter(sb.charAt(i)) && Character.isLowerCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isLetter(sb.charAt(i)) && Character.isUpperCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		
		return sb.toString();
	}

}
