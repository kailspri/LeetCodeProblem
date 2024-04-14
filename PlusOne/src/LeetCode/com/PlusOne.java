package LeetCode.com;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int [] digits= {9,9};
		int [] output=plusOne(digits);
		System.out.println(Arrays.toString(output));

	}

	private static int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]+=1;
				return digits;
			}
			digits[i]=0;
		}
		int[] extra=new int[digits.length+1];
		extra[0]=1;
		return extra;
	}

}
