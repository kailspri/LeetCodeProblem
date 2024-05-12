package com.LeetCode;

import java.util.Arrays;

public class TestPractice {

	public static void main(String[] args) {
		int []nums= {-1,-100,3,99};
		int k =2;
		int [] newArr=rotate( nums,  k);
		System.out.println(Arrays.toString(newArr));
	}

	private static int[] rotate(int[] nums, int k) {
		k=k%nums.length;
		if (k == 0) {
            return null;
        }

		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		return nums;
	}

	private static void reverse(int[] nums, int start, int end) {
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}

}
