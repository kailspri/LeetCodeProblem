package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]] */
 
public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> groupString = groupAnagrams( strs);		
        System.out.println(groupString);
	}

	private static List<List<String>> groupAnagrams(String[] strs) {
	    Map<String, List<String>> map = new HashMap<>();
	    for (String str : strs) {
	        char[] charArray = str.toCharArray();
	        Arrays.sort(charArray);
	        //Sort the characters to get the same key for anagrams
	        String sortedStr = new String(charArray);
	        System.out.println("sprted string -> " +sortedStr);

	        if (!map.containsKey(sortedStr)) {
	            map.put(sortedStr, new ArrayList<>());
	            System.out.println("after contains "+map);
	        }
	        map.get(sortedStr).add(str);
	        System.out.println("else map ->"+map);
	    }
	    System.out.println(map);
	    return new ArrayList<>(map.values());
	}


}
