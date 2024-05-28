package com.LeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
//	Example 1:
//
//		Input: nums = [1,2,3,4]
//		Output: [24,12,8,6]
//		Example 2:
//
//		Input: nums = [-1,1,0,-3,3]
//		Output: [0,0,9,0,0]
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[]answer= productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));
	}

private static int[] productExceptSelf(int[] nums) {
	int n = nums.length;
    int[] left = new int[n];
    int[] right = new int[n];
    int[] result = new int[n];
    
    // Fill left array
    left[0] = 1;
    for (int i = 1; i < n; i++) {
        left[i] = left[i - 1] * nums[i - 1];
        System.out.println("left"+left[i]);
    }
    
    // Fill right array
    right[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
        right[i] = right[i + 1] * nums[i + 1];
        System.out.println("rihgt -->"+right[i]);
    }
    
    // Calculate result
    for (int i = 0; i < n; i++) {
        result[i] = left[i] * right[i];
    }
    
    return result;
}

}
