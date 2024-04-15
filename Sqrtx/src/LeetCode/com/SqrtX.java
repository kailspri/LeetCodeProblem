package LeetCode.com;

public class SqrtX {

	public static void main(String[] args) {
		int x =8;
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
		return end;
	}

}
