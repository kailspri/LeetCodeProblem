package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/*Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false*/
//Those numbers for which this process ends in 1 are happy.
public class HappyNumber {
	public static void main(String[] args) {
		int n=19;
		 boolean op=isHappy( n);
		 System.out.println(op);
	}

	private static boolean isHappy(int n) {
		Set<Integer> usedIntegers=new HashSet<>();
		while(true) {
			int sum=0;
			while(n!=0) {
				sum+=Math.pow(n%10, 2.0);
				n=n/10;
			}
			System.out.println("Sum "+sum);
			if(sum==1)
				 return true;
			n=sum;
			//check if we have alrady encountered that number
			if(usedIntegers.contains(n))
				 return false;
			usedIntegers.add(n);
			
		}
		
	}

}
