package com.LeetCode;
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.



public class ValidPalindrome {
	public static void main(String[] args) {
		String s ="A man, a plan, a canal: Panama";
		
		boolean op=isPalindrome( s);
		System.out.println(op);

	}

	private static boolean isPalindrome(String s) {
		String cleaned=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(cleaned);
		
		int left=0;
		int right=cleaned.length()-1;
		while(left<right) {
			if(cleaned.charAt(left)!=cleaned.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
				
				
				
				
				
				
				
				
				
				
				
		
//String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        
//        // Two pointers approach to check if the string is a palindrome
//        int left = 0;
//        int right = cleaned.length() - 1;
//        
//        while (left < right) {
//            if (cleaned.charAt(left) != cleaned.charAt(right)) {
//                return false; // Not a palindrome
//            }
//            left++;
//            right--;
//        }
        return true; // Palindrome
    }
}
