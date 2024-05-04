
package com.LeetCode;
import java.util.*;

public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int newIndex = 0;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            System.out.println(countMap.toString());
           // System.out.println(Arrays.toString(nums));
            if (countMap.get(num) <= 2) {
                nums[newIndex++] = num;
                System.out.println(newIndex);
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
