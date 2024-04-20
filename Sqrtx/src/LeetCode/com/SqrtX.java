package LeetCode.com;

public class SqrtX {

	public static void main(String[] args) {
		int x =16;
		int sqrt=mySqrt( x);
		System.out.println(sqrt);
	}

	private static int mySqrt(int x) {
		int start=1;
		int end=x;
		while(start<=end) {
			int mid=start+(end-start)/2;
		System.out.println("Start : "+start+"END : "+end +"MID :"+mid);
			if(mid==x/mid)
				 return mid;
			else if(mid<x/mid)
				 start=mid+1;
			else
				end=mid-1;
		}
//		return start;
		return end;
//		Finally, when the loop exits, the algorithm returns end. This is because end holds the largest integer value less than or equal
//		to the square root of x within the search range.
//		So, end is the closest integer approximation of the square root of x.
	}

}
