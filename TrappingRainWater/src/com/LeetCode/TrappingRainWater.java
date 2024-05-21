package com.LeetCode;
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by 
//array [0,1,0,2,1,0,1,3,2,1,2,1].In this case, 6 units of rain water 
//(blue section) are being trapped.
public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		int trapOp=trap(height);
		System.out.println(trapOp);

	}

	private static int trap(int[] height){
	int left=0,right=height.length-1;
	
	int maxLeft=height[left];
	int maxRight=height[right];
	int res=0;
	
	while(left<right) {
		if(maxLeft < maxRight) {
			left+=1;
			maxLeft=Math.max(maxLeft, height[left]);
			res+=maxLeft-height[left];
			
		}
		else {
			right-=1;
			maxRight=Math.max(maxRight, height[right]);
			res+=maxRight-height[right];
		}
	}
	
		return res;
	}

}
