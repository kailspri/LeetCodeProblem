package com.LeetCode;

import java.util.Arrays;

/*Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first,
second and thirdchild with 2, 1, 2 candies respectively.*/
public class Candy {
	public static void main(String[] args) {
		int[] ratings= {1,3,4,5,2}; //op 11
		int candies= candy(ratings);
		System.out.println(candies);
	}

	//space and time comlexity using o(n)
	private static int candy(int[] ratings) {
		int n =ratings.length;
		int [] candies= new int[ n];
		
	// Initialize candies array with 1 for each child
		Arrays.fill(candies, 1);
		
	// Scan from left to right, update candies according to ratings
		for(int i=1;i<n;i++) {
			if(ratings[i]>ratings[i-1]) {
				candies[i]=candies[i-1]+1;
			}
		}
		
		for(int i=n-2;i>=0;i--) {
			if(ratings[i]>ratings[i+1]) {
				candies[i]=Math.max(candies[i], candies[i+1]+1);
			}
		}
		
		 // Sum up all candies
		int sum=0;
		for(int candy :candies) {
			sum+=candy;
		}
		return sum;
	}

}
