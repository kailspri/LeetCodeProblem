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
		int op=removeElement( nums,  val);
		for(int i=0;i<op;i++) {
			System.out.println(nums[i]);
		}

	}

	private static int removeElement(int[] nums, int val) {
		int count=0;
		for(int i =0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[count]=nums[i];
				count++;
			}
			
				 
		}
		
		
		
		
		System.out.println(Arrays.toString(nums));
		return count;
		
	}

}
