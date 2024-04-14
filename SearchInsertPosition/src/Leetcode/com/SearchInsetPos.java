package Leetcode.com;
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.

/*Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

*/
public class SearchInsetPos {

	public static void main(String[] args) {
		int arr []= {1,3,5,6};
		int target=0;
		int Index=searchInsert( arr,  target);
		//int IndexPos=SearchInsert(arr,target);
		System.out.println("Found At :"+Index);
	}

	private static int SearchInsert(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				start=mid;
			else if(arr[mid]<target)
				 start=mid+1;
			else
				end=mid-1;
			System.out.println("Value of mid :"+mid +"Value of start :"+start);
		}
		return start;
	}

	//This Function is working fine when tagret is not greater than last value at array
	private static int searchInsert(int[] arr, int target) {
		
		  for(int i =0;i<arr.length-1;i++) {
			  if(arr[i]==target) {
				  return i;
			  }
			  else if(target>arr[i] && target < arr[i+1]) {
				  return i+1;
			  }
			  else if(target>arr[arr.length-1] && arr.length>1)
				  return arr.length;
			  
//			  else if(arr.length==1)
//				  return arr.length+1;
		  }
		return 0;
	}

}
