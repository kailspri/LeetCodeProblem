package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

//The majority element is the element that appears more 
//than [n / 2] times. You may assume that 
//the majority element always exists in the array.

//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

public class MajorityElement {

	public static void main(String[] args) {
		int[]nums = {3,2,3};//{2,2,1,1,1,2,2};
		int res= majorityElement(nums);
		System.out.println(res);

	}

	private static int majorityElement(int[] nums) {
		Map<Integer,Integer> map =new HashMap<>();
		int val=nums.length/2;
		for(int i =0;i<nums.length;i++) {
//			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//			}
//			
//			map.put(nums[i], i);
				if(map.get(nums[i])>val){
					return nums[i];
				}
		}
		System.out.println(map.toString()+val);
		return 0;
	}

}
