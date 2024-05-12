package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/*Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true*/
public class IsomorphicStrings {
	public static void main(String[] args) {
		String s="egg"; String t="add";
		 boolean op=isIsomorphic(s,t); 
		 System.out.println(op);

	}
	private static boolean isIsomorphic(String s, String t) {
		Map<Character ,Character>map=new HashMap<>();
		if(s.length()!=t.length())
			 return false;
		for(int i=0;i<s.length();i++) {
			char original=s.charAt(i);
			char replacement=t.charAt(i);
			if(!map.containsKey(original)) {
				if(!map.containsValue(replacement)) {
					map.put(original, replacement);
				}
				else//cheack "badc" "baba"
					 return false;
			}
			else {
				char mappedCharacter=map.get(original);
			    System.out.println("Else of if "+mappedCharacter +" "+original);
			    if(mappedCharacter!=replacement)
			    return false;
			}
		}
		return true;
	}
	private static boolean isIsomorphicTest(String s, String t) {
		Map<Character,Integer> mapS = new HashMap<>();
		Map<Character,Integer> mapT = new HashMap<>();
		char[] sCharArry=s.toCharArray();
		char[] tCharArry=t.toCharArray();
		for(int i=0;i<sCharArry.length;i++) {
			mapS.put(sCharArry[i], mapS.getOrDefault(sCharArry[i], 0)+1);
		}
		for(int i=0;i<tCharArry.length;i++) {
			mapT.put(tCharArry[i], mapT.getOrDefault(tCharArry[i], 0)+1);
		}
		System.out.println(mapS.values());
		System.out.println(mapT.values());
		boolean areEqual=mapS.values().equals(mapT.values());
		return areEqual;
	}
}
