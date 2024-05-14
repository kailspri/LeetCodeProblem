package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/*Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote="aa";
		String magazine="ab";
		boolean answer= canConstruct( ransomNote,  magazine);
		System.out.println(answer);
	}
private static boolean canConstruct(String ransomNote, String magazine) {
	 int [] count =new int[26]; //to keep count of 26 charatcers
	 for(char ch :magazine.toCharArray())
		  count[ch-'a']++; //ascii of a is 97
	 for(char ch :ransomNote.toCharArray()) {
		 count[ch-'a']--;
		 if(count[ch-'a']<0)
			  return false;
	 }
		  
	     
	return true;
	}
//All cases Not paased :(
	private static boolean canConstruct1(String ransomNote, String magazine) {
		Map<Character,Integer> ransomNoteMap =new HashMap<>();
		Map<Character,Integer> magazineMap =new HashMap<>();
		for(int i=0;i<ransomNote.length();i++) {
			ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.getOrDefault(ransomNote.charAt(i), 0)+1);
		}
		for(int i=0;i<magazine.length();i++) {
			magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0)+1);
		}
		System.out.println(magazineMap);
		System.out.println(ransomNoteMap);
		for(int i =0;i<ransomNote.length();i++){
			if(magazineMap.containsKey(ransomNote.charAt(i)))
				if(magazineMap.get(ransomNote.charAt(i))>= ransomNoteMap.get(ransomNote.charAt(i))){
					return true;
				}
				else
				return false;
		}
		return false;
	}

}
