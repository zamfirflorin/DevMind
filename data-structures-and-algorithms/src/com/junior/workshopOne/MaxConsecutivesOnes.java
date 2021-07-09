package com.junior.workshopOne;

public class MaxConsecutivesOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				cnt++;
				if (cnt > max) {
					max = cnt;
				}
			} else {
				cnt = 0;
			}
			
		}
		return max;
	}

}
