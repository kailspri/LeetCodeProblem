package com.LeetCode;

import java.util.Arrays;

/*Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/

/*Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]*/
public class RotateArray {

	public static void main(String[] args) {
		int []nums= {-1,-100,3,99};
		int k =2;
		int [] newArr=rotate( nums,  k);
		System.out.println(Arrays.toString(newArr));
	}
//using Extraa space 
	/*private static int[] rotate(int[] nums, int k) {
		int []newArr=new int [nums.length];
		int count=k-1;
		for(int i=nums.length-1;i>k;i--) {
			newArr[count]=nums[i];
			count--;
			System.out.println(Arrays.toString(newArr));
		}
		int index=0;
		for(int i=k;i<newArr.length;i++) {
			newArr[i]=nums[index];
			index++;
		}
		
		return newArr;
	}*/
	private static int[] rotate1(int[] nums, int k) {
		int []newArr=new int [nums.length];
		int length=nums.length-k;
		for(int i=0;i<k;i++) {
			newArr[i]=nums[length];
			length++;
			System.out.println(Arrays.toString(newArr));
		}
		int index=0;
		for(int i=k;i<newArr.length;i++) {
			newArr[i]=nums[index];
			index++;
		}
		
		
		return newArr;
	}
	private static int[] rotate2(int[] nums, int k) {
		int count=0;
		int kIndex=k+1;
		for(int i =0;i<k;i++) {
			int temp=nums[count];
			nums[count]=nums[kIndex];
			nums[kIndex]=temp;
			count++;
			kIndex++;
		}
		
		System.out.println(Arrays.toString(nums));
		
		return nums;
	}
	private static int [] rotate(int[] nums, int k) {
		int n = nums.length;
        k = k % n; // Handle cases where k is greater than the length of the array
        if (k == 0) {
            return null;
        }

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        System.out.println("first k elements- > "+Arrays.toString(nums));
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
        return nums;
	}
	private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
       
    }

}
