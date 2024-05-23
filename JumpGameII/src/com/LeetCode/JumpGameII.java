package com.LeetCode;

//Input: nums = [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1,
//then 3 steps to the last index.
public class JumpGameII {

	public static void main(String[] args) {
		int[] nums= {2,3,1,1,4};
		int jump=jump(nums);
		System.out.println(jump);
	}

	private static int jump(int[] nums) {
		int goal=nums.length-1;
		int totalJump=0;
		int coverage=0;
		int lastJumpIndex=0;
		//Base Case 
		if(nums.length==1)
			return 0;
		
		//Greddy Startegy :extend Coverage as long as possible
		for(int i=0;i<nums.length;i++) {
			//max jumps
			coverage=Math.max(coverage, i+nums[i]);
			if(i==lastJumpIndex) {
				lastJumpIndex=coverage;
				System.out.println("ttoalJum before ++-->"+totalJump);
				totalJump++;
				System.out.println("ttoalJum after ++-->"+totalJump);
				
				if(coverage>=goal) {
					System.out.println(" ++-->"+totalJump);
					 return totalJump;}
			}
	}
			
		return totalJump;
	}

}
