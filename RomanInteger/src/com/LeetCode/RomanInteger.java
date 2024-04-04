package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

	public static void main(String[] args) {
		Map<Character, Integer> map= new HashMap<>();
		String S="VI";
		map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int lastChar=map.get(S.charAt(S.length()-1));
        System.out.println("last Character "+lastChar);
        for(int i=S.length()-2;i>=0;i--) {
        	if(map.get(S.charAt(i))< map.get(S.charAt(i+1)))
        		lastChar=lastChar-map.get(S.charAt(i));
        	else 
        		lastChar=lastChar+map.get(S.charAt(i));
        }

        System.out.println(lastChar);
	}

}
