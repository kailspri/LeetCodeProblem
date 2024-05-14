package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/*Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false*/

public class WordPattern {

	public static void main(String[] args) {
		String pattern="aaaa";
		String s="dog cat cat fish";
		boolean answer= wordPattern( pattern,  s);
		System.out.println(answer);

	}

	private static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		
		Map<Character ,String> map=new HashMap<>();
		System.out.println(words[0]);
		for(int i =0;i<words.length;i++) {
			char orginal=pattern.charAt(i); //a
			String replace=words[i];
			if(!map.containsKey(orginal)) {
				if(!map.containsValue(replace))
					 map.put(orginal, replace);
				else
					return false;
			}
			else {
				String mapped=map.get(orginal);
				//in string Use equals() method for string comparison
				//!= gives error
				if(!mapped.equals(replace))
					 return false;
			}
			System.out.println(map);
		}
		
		return true;
	}

}
