package LeetCode.com;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
	int arr[]= {2,7,11,15};
	int target=18;
	int arr1[]=arrSum(arr,target);
	int arr2[]=twoSum1(arr,target);
	for(int num:arr1) {
		System.out.println(num);
	}
	System.out.println(Arrays.toString(arr2));
	
	}

	//Brute Force Approach // on(n2)
	private static int[] arrSum(int[] arr, int target) {
		int [] arr1=new int[2];
		for(int i =0;i<arr.length;i++) {
			int sum=0;
			
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum==target) {
					//System.out.println("index value true"+i+j);
					arr1[0]=i;
					arr1[1]=j;
			   
				}
				
			}
		}
		return arr1;
	}
	
//Optimal using HAshMAp;
	 private static int[] twoSum1(int[] arr, int target) {
		 int [] arrOp= new int[2];
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i =0;i<arr.length;i++) {
				int moreNeeded=target-arr[i];
				if(map.containsKey(moreNeeded)) {
					arrOp[0]=map.get(moreNeeded);
					arrOp[1]=i;
					return arrOp;
				}
				map.put(arr[i], i);
			}
			
			return arrOp;
		}

}
