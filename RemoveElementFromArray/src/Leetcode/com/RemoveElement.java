package Leetcode.com;
//take val from array and remove its all occur. and then return the size of array;
public class RemoveElement {

	public static void main(String[] args) {
	int [ ] arr = {0,1,2,2,3,0,4,2};
	int val=2;
	int arrLength=removeElement(arr,val);
	System.out.println("Arr Lenght ::"+arrLength);
	for(int i =0;i<arrLength;i++) {
		System.out.println(arr[i]);
		
	}

	}

	private static int removeElement(int[] arr, int val) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val)
			{
				arr[count++]=arr[i];
				
			}
		}
		return count;
	}

}
