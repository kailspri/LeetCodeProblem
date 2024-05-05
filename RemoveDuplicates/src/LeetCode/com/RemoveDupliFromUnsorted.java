package LeetCode.com;

import java.util.Arrays;
import java.util.*;
import java.util.Iterator;

public class RemoveDupliFromUnsorted {

	public static void main(String[] args) {
		
		int [] arr = {1,1,2};
		//int arrLength=removeDuplicate(arr);
		//Other way using Arrays.Sort method 
		int arrLength=removeDuplicate1(arr);
		
		System.out.println(arrLength);
		for (int i = 0; i < arrLength; i++) {
             System.out.print(arr[i] + " ");
		}
       }

	private static int removeDuplicate1(int[] arr) {
		Arrays.sort(arr);
		int uniqueIndex=0;
		for(int i =1;i<arr.length;i++) {
			if(arr[i]!=arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex]=arr[i];
			}
		}
		return uniqueIndex+1;
		
	}
	private static int removeDuplicateLeetCode(int[] arr) {
		Arrays.sort(arr);
		int uniqueIndex=1;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				uniqueIndex++;
				arr[uniqueIndex]=arr[i+1];
			}
		}
		return uniqueIndex;
		
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
