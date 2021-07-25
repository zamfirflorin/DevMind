package com.florin.debugging_junit;

public class Utilities {
	
	public char[] everyNthChar(char[] sourceArray, int n) {
		
		if (sourceArray == null || sourceArray.length < n) {
			return sourceArray;
		}
		
		int returnedLength = sourceArray.length / n;
		char[] result = new char[returnedLength];//1
		int index = 0;

		for (int i = n - 1; i < sourceArray.length; i += n) {
			result[index++] = sourceArray[i];
		}
		return result;
	}
	
	
	//remove pairs of the same characcter that are next to eachother
	//by removing on e occurence of the currnter
	//ABBCDEEF -> ABCDEF
	public String removePairs(String source) {
		//if lenght less than two there won't be any  pairs
		
		if (source.length() < 2) {
			return source;
		}
		
		StringBuilder sb = new StringBuilder();
		char[] arr = source.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				sb.append(arr[i]);
			}
		}
		sb.append(arr[arr.length - 1]);
		return sb.toString();
	}

	//AABBEDEEFFG
	
	public int converter(int a, int b) {
		return (a / b) + (a * 30) - 2;
	}

}
