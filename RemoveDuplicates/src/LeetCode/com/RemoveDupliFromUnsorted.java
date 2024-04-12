package LeetCode.com;

import java.util.Arrays;
import java.util.*;
import java.util.Iterator;

public class RemoveDupliFromUnsorted {

	public static void main(String[] args) {
		
		int [] arr = {1,1,1};
		int arrLength=removeDuplicate(arr);
		
		System.out.println(arrLength);
		for (int i = 0; i < arrLength; i++) {
             System.out.print(arr[i] + " ");
		}
       }

	private static int removeDuplicate(int[] arr) {
		int uniqueIndex=0;
		Set<Integer> set =new HashSet<>();
		for(int i =0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				arr[uniqueIndex++]=arr[i];
				set.add(arr[i]);
			}
		}
		System.out.println(set);
		return uniqueIndex ;
	
	}

}
