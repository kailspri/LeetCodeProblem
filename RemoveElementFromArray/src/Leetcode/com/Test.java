package Leetcode.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
public class Test {

	public static void main(String[] args) {
		int [] nums = {3,2,2,3};
		int val=3;
		removeElement( nums,  val);

	}

	private static void removeElement(int[] nums, int val) {
//		for(int i =0;i<nums.length-1;i++) {
//			if(nums[i]==val) {
//				nums[i]=nums[i+1];
//				nums[i+1]=0;
//			}
//			if(nums[i]==0) {
//				nums[i]=nums[i+1];
//				nums[i+1]=0;
//			}
//		}
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++) {
			if(nums[i]==val) {
				i++;
			}
			else
				 map.put(nums[i], i);
		}
		
		
		System.out.println(map.toString());
		for(int i =0;i<nums.length;i++) {
			nums[i]=map.getOrDefault(i);
		}
		System.out.println(Arrays.toString(nums));
		
	}

}
