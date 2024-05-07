package com.LeetCode;


/*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented 
by array [1,8,6,2,5,4,8,3,7]. In this case, the max 
area of water (blue section)the container can contain 
is 49.*/
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
//		int max= maxArea(height);
		int maxTwo= maxAreaTwoPointer(height);
		System.out.println(maxTwo);

	}
      private static int maxAreaTwoPointer(int[] height) {
		int area,res=0;
		int left=0,right=height.length-1;
		while(left<right) {
			area=(right-left)*Math.min(height[left], height[right]);
			res=Math.max(res, area);
			
			if(height[left]<height[right]) {
				left++;
			}
			else
				right--;
		}
		return res;
	}
	//Brute force approach with o(n^2) which is not feasible in LeetCode
	private static int maxArea(int[] height) {
		int area,res=0;
		for(int left=0;left<height.length;left++) {
			for(int right=left+1;right<height.length;right++) {
				area=(right-left)*Math.min(height[left],height[right]);
				System.out.println("area with left "+height[left]+"-->"+area);
				res=Math.max(area, res);
			}
		}
		return res;
	}

}
