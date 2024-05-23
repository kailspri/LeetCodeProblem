package com.LeetCode;
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, 
//then 3 steps to the last index.
public class JumpGame {

	public static void main(String[] args) {
		int[] nums= {3,2,1,0,4};
		boolean canJump=canJump( nums);
		System.out.println(canJump);

	}

	private static boolean canJump(int[] nums) {
		int finalpos=nums.length-1;
		//greedyApproach 
		for(int i=nums.length-2;i>=0;i--) {
			if(finalpos<=nums[i]+i) {
				finalpos=i;
			}
		}
		return finalpos==0;
	}

}
