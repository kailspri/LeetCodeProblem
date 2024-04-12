package LeetCode.com;

import java.util.Arrays;
//From sorted array Remove Duplicate 
public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] arr = {1,1,1};
		int arrLength=removeDuplicate(arr);
		System.out.println(arrLength);
		for (int i = 0; i < arrLength; i++) {
             System.out.print(arr[i] + " ");}
       }

	private static int removeDuplicate(int[] arr) {
		int uniqueIndex=0;
		for(int i =1;i<arr.length;i++) {
			if(arr[i]!=arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex]=arr[i];
			}	
		}
		System.out.println(Arrays.toString(arr));
		return uniqueIndex+1;
	}

}



