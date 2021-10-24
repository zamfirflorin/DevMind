package com.junior.P3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = new int[] {8, 5, 4, 8, 4};
		int[] arr2 = new int[] {4, 13, 2, 3};
		int[] arr3 = new int[] {2, 11, 3, 8, 10, 9, 5, 2, 11};
		int[] arr4 = new int[] {5};
		int[] arr5 = new int[] {5, 6, 7, 8, 9};
		int max = maxTickets(arr1);
		int max2 = maxTickets(arr2);
		int max3 = maxTickets(arr3);
		int max4 = maxTickets(arr4);
		int max5 = maxTickets(arr5);
		System.out.println(max);
		System.out.println(max2);
		System.out.println(max3);
		System.out.println(max4);
		System.out.println(max5);

	}
	
	public static int maxTickets(int[] tickets) {
		if (tickets.length == 0) {
			return 0;
		}
		if (tickets.length == 1) {
			return 1;
		}
		Arrays.sort(tickets);
		int max = 0; 
		int count = 1; 
		for (int i = 1; i < tickets.length; i++) {
			
			if (tickets[i] - tickets[i - 1] == 0 || (tickets[i] - tickets[i - 1]) == 1) {
				count++;
			} else {
				count = 0;
			}
//			if (i == tickets.length - 1 && (tickets[i] - tickets[i-1] == 0 || tickets[i] - tickets[i-1] == 1)) {
//				count++;
//			}
			if (count > max) {
				max = count;
			}
			//
		}
		return max;
	}
	


}
