package com.LeetCode;
import java.util.*;

public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int newIndex = 0;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) <= 2) {
                nums[newIndex++] = num;
            }
        }
        
        return newIndex;
    }
    
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII solution = new RemoveDuplicatesfromSortedArrayII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = solution.removeDuplicates(nums);
        
        System.out.println("Output: " + newLength + ", nums = " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
