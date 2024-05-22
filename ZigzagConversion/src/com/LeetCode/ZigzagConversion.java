package com.LeetCode;

import java.util.Iterator;

public class ZigzagConversion {
//	Input: s = "PAYPALISHIRING", numRows = 4
//			Output: "PINALSIGYAHRPI"
//	Explanation:
//		P     I    N
//		A   L S  I G
//		Y A   H R
//		P     I
public static void main(String[] args) {
	String s = "PAYPALISHIRING";
	int numRows = 4;
	String answer= convert(s,  numRows);
	System.out.println(answer);
}

private static String convert(String s, int numRows) {
	String  [] strArr=new String[numRows];
	for(int i=0;i<strArr.length;i++) {
		strArr[i]="";
	}
	int currRow=0;
	while(currRow<s.length()) {
		for(int i=0;i<numRows && currRow<s.length();i++) {
			System.out.println(s.charAt(currRow));
			
			strArr[i]+=s.charAt(currRow++);
		}
		for(int i=numRows-2 ;i>0  && currRow<s.length();i--) {
			strArr[i]+=s.charAt(currRow++);
		}
	}
	String ans="";
	for (int i = 0; i < strArr.length; i++) {
		ans+=strArr[i];
	}
	return ans;
}
}
