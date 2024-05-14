package com.LeetCode;

//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
public class IsSubsequence {

	public static void main(String[] args) {
		String s="abc";
		String t="ahbgdc";
		boolean op= isSubsequence(s,t); 
		System.out.println(op);

	}

	private static boolean isSubsequence(String s, String t) {
		int sPointer=0;
		int tPointer=0;
		while(sPointer <s.length() && tPointer<t.length() ) {
			if(s.charAt(sPointer)==t.charAt(tPointer)) {
				sPointer++;
			}
			tPointer++;
		}
		return sPointer==s.length();
	}
}
