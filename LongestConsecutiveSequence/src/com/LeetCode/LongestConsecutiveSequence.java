package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/*Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9*/

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int [] nums = {100,4,200,1,3,2};
		int longestLength=longestConsecutive(nums);
		System.out.println(longestLength);
	}

	private static int longestConsecutive(int[] nums) {
		Map<Integer, Boolean> map= new HashMap<>();
		int longestLength=0;
		for(int num:nums)
			 map.put(num, Boolean.FALSE);
		
		for(int num :nums) {
			int currLength=1;
			
			//search in forward direction
			int nextNum=num+1;
			while(map.containsKey(nextNum) && map.get(nextNum)== false) {
				currLength++;
				map.put(nextNum, Boolean.TRUE);
				nextNum++;
				System.out.println("Map in next "+map);
			}
			
			//search in backward direction
			int prevNum=num-1;
			while(map.containsKey(prevNum) && map.get(prevNum)== false) {
				currLength++;
				map.put(prevNum, Boolean.TRUE);
				prevNum--;
				System.out.println("Map in prev "+map);
			}
			longestLength=	Math.max(currLength, longestLength);
		}
		
		return longestLength;
	}

}
