package com.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should
//not contain leading or trailing spaces.
public class ReverseWordsinaString {

	public static void main(String[] args) {
		String s ="  hello world  ";
//		System.out.println(s.length());
		String op= reverseWords( s);
		System.out.println(op);
	}

	private static String reverseWords(String s) {
		String[] arr = s.trim().split("\\s+");
		for(String arr1:arr) {
			//String arr 
			System.out.println(arr1);
		}
		
		int i=0,j=arr.length-1;
		while(i<j) {
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		return String.join(" ", arr);
	}

}
