package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
public class MergeSortedArray {

	public static void main(String[] args) {
		int [] nums1= {1,2,3,0,0,0};
		int [] nums2= {2,5,6};
		int m=3;
		int n=3;
		/*   Set Does not allows Duplicate entries*/
//		Set<Integer> list1= new TreeSet<>();
//		for(int i =0;i<m;i++) {
//			list1.add(nums1[i]);
//		}
//		Set<Integer> list2= new TreeSet<>();
//		for(int i =0;i<n;i++) {
//			list2.add(nums2[i]);
//		}
		List<Integer> list1= new ArrayList<>();
		for(int i =0;i<m;i++) {
			list1.add(nums1[i]);
		}
		List<Integer> list2= new ArrayList<>();
		for(int i =0;i<n;i++) {
			list2.add(nums2[i]);
		}
		list1.addAll(list2);
		Collections.sort(list1);
        System.out.println(list1);//gives correct output nut leetcode wants nums1
        
        
        
     // Converting List to array via scope resolution 
        // operator using streams 
//        Integer[] arr = list1.toArray(new Integer[0]); 
//        System.out.println(Arrays.toString(arr));
        for(int i =0;i<list1.size();i++) {
        	nums1[i]=list1.get(i);
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
	}

}
