package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order
of the triplets does not matter.*/
public class _3Sum {

	public static void main(String[] args) {
		int[] nums= {-1,0,1,2,-1,-4};
		 List<List<Integer>> list =threeSum( nums);
		 System.out.println(list);

	}

	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		
		for(int i =0;i<nums.length-2;i++) {
			//skip the duplicate 
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			int left=i+1;
			int right=nums.length-1;
			while(left<right) {
				int total=nums[i]+nums[left]+nums[right];
				if(total>0) 
					 right--;
				else if(total<0)
					 left++;
				else {
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
				  
					//skip the duplicates
					while(left<right && nums[left]==nums[left+1]) {
						left++;
					}
					while(left<right && nums[right]==nums[right-1]) {
						right --;
					}
					left++;
				  right--;
				  
				}
					
			}
		}
		return list;
	}

}
