package com.Leetcode;

import java.util.HashMap;
import java.util.Map;

//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

//In simpler terms, the problem is asking whether there are two equal elements in the array that are at most k positions apart.
public class ContainsDuplicateII {
	public static void main(String[] args) {
		int[] nums= {1,0,1,1};
		int k=1;
		boolean op= containsNearbyDuplicate(nums, k);
		System.out.println(op);

	}

	private static boolean containsNearbyDuplicate(int[] nums, int k) {
//	for(int i=0;i<nums.length;i++) {
//		if(nums[k]==k)
//			 return true;
//	}
		
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int diff=i-map.get(nums[i]);
				if(diff<=k)
					 return true;
			}
			map.put(nums[i], i);
		}
		
		return false;
	}

}
