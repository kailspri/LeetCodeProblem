package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesTPractice {

	public static void main(String[] args) {
		String [] arr= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> listOfString=groupAnagram(arr);
          System.out.println(listOfString);
	}
	private static List<List<String>> groupAnagram(String[] arr) {
		Map<String,List<String>> map =new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			char[] charArray= arr[i].toCharArray();
			Arrays.sort(charArray);
		    String sortedStr= new String(charArray);
		    if(!map.containsKey(sortedStr)) {
		    	map.put(sortedStr, new ArrayList<>());
		    }
		    map.get(sortedStr).add(arr[i]);
		    //System.out.println(map);
		}
		return new ArrayList<>(map.values());
	}

}
