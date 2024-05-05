package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
public class Test {

	public static void main(String[] args) {
		int [] nums1 = {1};
		int [] nums2 = {};
		int m=1,n=0;
		merge(nums1,  m,  nums2,  n);
		merge2(nums1,  m,  nums2,  n);
	}
	private static void merge2(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int i =0;i<m;i++) {
			list1.add(nums1[i]);
		}
		for(int i =0;i<n;i++) {
			list2.add(nums2[i]);
		}
		
		System.out.println(list2);
		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);
		for(int i=0;i<list1.size();i++) {
			nums1[i]=list1.get(i);
		}
		System.out.println(Arrays.toString(nums1));
		
	}
	//this works for 1st case only 
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int index=m;
		for(int i =0;i<n;i++) {
    	 nums1[index++]=nums2[i];
     }
		
//		for(int i =0,j=m;i<n;i++) {
//			nums1[j]=nums2[i];
//			j++;
//		}
		Arrays.sort(nums1);
     System.out.println(Arrays.toString(nums1));
    }
}
