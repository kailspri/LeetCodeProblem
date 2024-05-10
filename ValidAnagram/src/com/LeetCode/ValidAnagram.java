package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/*Given two strings s and t, return true if t is an 
anagram of s,and false otherwise.
An Anagram is a word or phrase formed by rearranging the
letters of a different word or phrase, 
typically using all the original letters exactly once.*/

//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false


public class ValidAnagram {

	public static void main(String[] args) {
//		String s ="anagram";
		String s ="a";
//		String t="nagaram";
		String t="ab";
		 boolean op= isAnagram( s,  t);
		 System.out.println(op);
		
	}

	private static boolean isAnagram(String s, String t) {
		char[] sCharArray=s.toCharArray();
		char[] tCharArray=t.toCharArray();
		Map<Character,Integer> map1 =new HashMap<>();
		Map<Character,Integer> map2 =new HashMap<>();
		for(int i =0;i<sCharArray.length;i++) {
			map1.put(sCharArray[i],map1.getOrDefault(sCharArray[i], 0)+1);
			
		    
		}
		for(int i =0;i<tCharArray.length;i++) {
			map2.put(tCharArray[i],map2.getOrDefault(tCharArray[i], 0)+1);
			
		}
		System.out.println(map1);
		System.out.println(map2);
		if(map2.equals(map1))
			 return true;
		return false;
	}

}
