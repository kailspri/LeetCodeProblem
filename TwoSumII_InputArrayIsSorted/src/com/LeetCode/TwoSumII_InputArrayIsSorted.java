package com.LeetCode;

import java.util.Arrays;

//numbers = [2,3,4], target = 6
//Output: [1,3]
//Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]

//Input: numbers = [-1,0], target = -1
//Output: [1,2]
public class TwoSumII_InputArrayIsSorted {

	public static void main(String[] args) {
		int [] arr= {2,7,11,15};
		int target=9;
		int[] op=twoSum(arr,target);
		System.out.println(Arrays.toString(op));

	}

	private static int[] twoSum(int[] arr, int target) {
	 int sum=0;
	 int[]newarr= new int[2];
	 for(int i =0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 System.out.println("i ki value : "+ arr[i]+"    j ki value :"+j);
			 if(arr[i]+arr[j]==target) {
				 newarr[0]=i+1;
				 newarr[1]=j+1;
			 }
		 }
	 }
		
		return newarr;
	}
	
	public int[] twoSumLeetCodePass(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        while(numbers[left]+numbers[right]!=target){
            if(numbers[left]+numbers[right]>target) 
               right--;
            else
               left++;
        
        }
        return new int[]{left+1,right+1};
    }

}
